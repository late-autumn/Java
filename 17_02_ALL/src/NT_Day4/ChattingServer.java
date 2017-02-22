package NT_Day4;

import java.net.*;
import java.util.*;
import javax.swing.*;

public class ChattingServer extends JFrame{

	//선언부
	//클라이언트 소켓의 접속을 받아주는 서버소켓 선언
	ServerSocket server = null;
	
	//실제 메시지를 주고 받을 때 사용하는 소켓
	Socket client = null;
	
	//서버소켓에 접속을 해오는 클라이언트 즉 사용자들에 대한 정보를 담아 둘 자료구조 선언
	List<ChattingServerThread> chatList = null;
	ChattingServerThread csThread = null;
	
	JTextArea jta_log = new JTextArea();
	JScrollPane jsp_log = new JScrollPane(jta_log, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	
	//생성자
	public ChattingServer() {
		// TODO Auto-generated constructor stub
	}
	
	//서버 초기 세팅하기
	public void init(){
		
		//서버에 접속한 클라이언틀를 관리할 스레드를 담을 벡터 생성
		chatList = new Vector<ChattingServerThread>();
		
		boolean isStop = false;
		
		try {
			
			server = new ServerSocket(6000);
			
			while(!isStop){
				
				//서버소켓을 통해 접속한 사용자 소켓 정보를 받아서 소켓에 담기
				client = server.accept();
				
				//스레드시작
				csThread = new ChattingServerThread(this);
				csThread.start();
				
			}
			
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//end init()
	
	//화면처리
	public void initDisplay(){
		
		jta_log.setEditable(false);
		this.add("Center",jsp_log);
		this.setTitle("로그출력창");
		this.setSize(500,500);
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChattingServer cServer = new ChattingServer();
		cServer.initDisplay();
		cServer.init();

	}

}
