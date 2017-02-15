package NT_Day3;
/* MultiServer : 모든 클라이언트의 연결요청을 받아서 Socket을 생성하고
 * Socket을 유지하기 위한 Thread를 생성한다.
 * 생성된 스레드 객체를 Collection내에 저장한다.
 */
import java.net.*;
import java.io.*;
import java.util.*;

public class MultiServer {

	/*
	 * 특정 클라이언트가 보낸 메세지를 모든 클라이언트에게 전달하기 위해
	 * 클라이언트와 메세지 송수신 할 수 있는 기능을 가진 MultiServerThread객체를
	 * 저장할 자료구조를 선언함.
	 */
	
	private ArrayList<MultiServerThread> clientList  = new ArrayList<>();
	private ServerSocket server = null;
	
	public MultiServer() {
		//???? 번 포트번호와 클라이언트의 접속 효청을 기다리고있는 서버 소켓 생성
		try{
		server = new ServerSocket(3000);
		System.out.println("서버 시작됨.....");
		
		while(true){
			//클라이언트의 연결 요청을 대기하고 있다가 연결 요청이 
			//접수되면 해당 클라이언트랑 통신 할 수 있는 소켓을 만들어서 반환한다.
			
			Socket socket = server.accept();
			
			//소켓으로부터 IP주소와 호스트명을 가지고 있는 InetAddress 객체 얻기 
			InetAddress ip = socket.getInetAddress();
			
			//InetAddress 객체로 부터 IP주소 얻기
			String ipAddress = ip.getHostAddress();
			
			System.out.println(ipAddress+"들어옴");
			
			/* Client랑 송수신 할 수 있는 기능을 가진 
			  MultiServerThread를 저장하고 있는 clientList와
			  해당 클라이언트와 연결된 Socket객체를 전달해서
			  MultiServerThread 객체를 생성한다.
			 */
			
			MultiServerThread t = new MultiServerThread(clientList,socket);
			
			t.start();
			
			
			//생성된 MultiServerThread객체를 clientList에 저장함
			clientList.add(t);
			
		}
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		  new MultiServer();
	}
}
