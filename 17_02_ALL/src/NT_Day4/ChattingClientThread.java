package NT_Day4;
import java.util.*;
public class ChattingClientThread extends Thread{

	ChattingClient cc = null;
	
	public ChattingClientThread(ChattingClient cc) {
		// TODO Auto-generated constructor stub
		
		this.cc=cc;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		String message = null;
		boolean isStop = false;
		
		while(!isStop){
			
			try{
			message = (String)cc.ois.readObject();
			StringTokenizer st = null;
			
			int protocol = 0;			//100,200,300,400,500
			
			if(message!=null){			//메세지가 있을경우
				
				st = new StringTokenizer(message, "#");
				protocol = Integer.parseInt(st.nextToken()); 
			}
			
			switch(protocol){
			
			 //대화명
			case Protocol.ROOM_IN:{
				String nickName = st.nextToken();
				Vector<String> v = new Vector<>();
				v.add(nickName);
				cc.dtm.addRow(v);
				cc.jta_display.append(nickName+"님이 입장 하셨습니다.");
				cc.jta_display.setCaretPosition(cc.jta_display.getDocument().getLength());
			}
			break;
			
			case Protocol.MESSAGE:{
			
				String nickName = st.nextToken(); //대화명
				String msg = st.nextToken();
				cc.jta_display.append("["+nickName+"]"+msg+"\n");
				cc.jta_display.setCaretPosition(cc.jta_display.getDocument().getLength());
				
			}
			break;
			
			case Protocol.CHANGE:{
				String nickName = st.nextToken();
				String afterName = st.nextToken();
				
				//대화명 변경전에 현재 테이블에서 가져온 대화명을 받음 
				for(int i=0; i< cc.dtm.getRowCount();i++){
					
					String n1 = (String)cc.dtm.getValueAt(i, 0);
					
					//변경할 대화명으로 테이블 내에 대화명 변경
					if(n1.equals(nickName)){
						cc.dtm.setValueAt(afterName, i, 0);
						break;
					}
					
					cc.jta_display.append(nickName+"님이"+afterName+"님으로 변경되었습니다.");
					cc.jta_display.setCaretPosition(cc.jta_display.getDocument().getLength());
					
					//채팅 팝업창에 타이틀 방에도 대화명 변경
					if(nickName.equals(cc.nickName)){
						cc.setTitle(afterName+"님의 대화창");
						cc.nickName = afterName;
					}
				}
			}
			break;
			
			//귓속말
			case Protocol.WHISPER :{	
				String nickName = st.nextToken();
				String otherName = st.nextToken();
				String msg = st.nextToken();
				
				cc.jta_display.append(nickName+"님이"+otherName+"님에게"+msg+"\n");
				cc.jta_display.setCaretPosition(cc.jta_display.getDocument().getLength());
				
			}
			break;
			
			//대화방 퇴장 
			case Protocol.ROOM_OUT : { 
				String name = st.nextToken();
				cc.jta_display.append(name+"님이 퇴장 하셨습니다.\n");
				cc.jta_display.setCaretPosition(cc.jta_display.getDocument().getLength());
				
				for(int i=0; i<cc.dtm.getRowCount();i++){
					String n1 = (String)cc.dtm.getValueAt(i, 0);
					
					if(name.equals(n1)){
						cc.dtm.removeRow(i);
						break;
					}
				}
				
			}
			break;
			
			}//end switch
		}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	
}
