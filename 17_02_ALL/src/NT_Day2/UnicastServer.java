package NT_Day2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class UnicastServer {

	
	public UnicastServer() {
		// TODO Auto-generated constructor stub
		ServerSocket server = null;
		
		try{
			//서버 소켓 생성 
			server = new ServerSocket(5000);
			
		}catch(IOException io){
			System.out.println("해당 포트가 없습니다.");
			System.exit(0);
		}
		
		try{
			
			while(true){
				System.out.println("Server Ready...");
				//클라이언트의 연결요청이 접수되면
				//해당 클라이언트와 통신할 Socket을 생성함.
				Socket socket = server.accept();
				
				//클라이언트와 메세지를 송수신할 UnicastSeverThread 생성
				//UnicastServerThread 생성시 Socket을 전달함 
				
				UnicastServerThread thread = new UnicastServerThread(socket);
				
				thread.start();
				
			}
		}catch(IOException io){
			io.printStackTrace();
		}
	
	}
	
	
	
	
	public static void main(String[] args) {
		
		new UnicastServer();
		
	}
}
