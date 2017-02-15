package NT_Day4;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.StringTokenizer;


public class ChattingServerThread extends Thread{

	ChattingServer cs = null;
	ObjectInputStream ois =null;
	ObjectOutputStream oos = null;
	
	//대화명을 담을 변수
	String chatName = null;
	
	public ChattingServerThread(ChattingServer cs) {
		// TODO Auto-generated constructor stub
		
		this.cs=cs;
		
		try {
			
			oos = new ObjectOutputStream(cs.client.getOutputStream());
			ois = new ObjectInputStream(cs.client.getInputStream());
			
			//클라이언트에서 보내온 메시지 읽기
			
			
			//100#대화명
			//ROOM_IN#하하
			//100번이면 대화방 입장
			String message = (String)ois.readObject();
			StringTokenizer st = new StringTokenizer(message, "#");
			st.nextToken();
			
			chatName = st.nextToken();
			
			//서버의 로그창에 출력하기
			cs.jta_log.append(message+"\n");
			
			//기존의 채팅 참여자에게 입장 사실을 통보함
			for(ChattingServerThread cst : cs.chatList){
				String currentName = cst.chatName;
				this.send(Protocol.ROOM_IN+"#"+currentName);
			}
			
			//List에 새로운 사용자 추가
			cs.chatList.add(this);
			
			this.broadCasting(message);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//대화방에 참여한 모든 사람에게 메시지를 출력함
	public void broadCasting(String message){
		
		for(ChattingServerThread cst : cs.chatList){
			cst.send(message);
		}

	}
	
	//클라이언트로부터 읽어온 메시지를 출력
	public void send(String message){
		
		//ROOM_IN #대화명
		
		try {
			oos.writeObject(message);
		} catch (IOException io) {
			io.printStackTrace();
		}
		
	}
	
	//thread를 실행시키기 위해서는 run메서드가 필요
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		boolean isStop = false;
		
		try{
			
		run_start:
			while(!isStop){
				
				String message = (String)ois.readObject();
				
				//사용자가 입력한 메시지를 서버로그창에 출력하기
				cs.jta_log.append(message+"\n");
				StringTokenizer st = null;
				
				int protocol = 0;
				
				if(message != null){
					
					st = new StringTokenizer(message,"#");
					protocol = Integer.parseInt(st.nextToken());
					
				}
				
				
				switch(protocol)
				{
				
				case Protocol.MESSAGE : {
					broadCasting(message);
				}
				break;

				case Protocol.CHANGE : {
					String nickName = st.nextToken();
					String afterName = st.nextToken();
					this.broadCasting(message);
					this.chatName = afterName;
				}
				break;
				
				case Protocol.WHISPER : {
					String nickName = st.nextToken();
					String otherName = st.nextToken();
					String msg = st.nextToken();
					
					for(ChattingServerThread cst : cs.chatList){
						
						if(otherName.equals(cst.chatName)){
							cst.send(message);
						}
						//break;
						
					}
					this.send(message);
					
				}
				break;
				
				case Protocol.ROOM_OUT : {
					String name = st.nextToken();
					String msg = Protocol.ROOM_OUT+"#"+name;
					
					cs.chatList.remove(this);
					this.broadCasting(msg);
					break run_start;
				}
				
				}//end switch
								
			}//end while
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}//end run()
	
	
}
