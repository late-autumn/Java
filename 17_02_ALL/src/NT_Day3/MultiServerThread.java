package NT_Day3;

import java.net.*;
import java.io.*;
import java.util.*;

/* MultiServerThread : 각각의 클라이언트와 연결된 Socket객체를 가지고 있으며
 * 클라이언트와 접속을 유지하고 통신을 담당함
 * 특정 클라이언트가 전송한 메세지를 수신해서 모든 클라이언트에게 전송하는 
 * broadcastion이 구현되어야 한다.
 */

public class MultiServerThread extends Thread {

	   private Socket socket; //MultiServer가 전달해주는 Socket을 담아둘 멤버변수
	   private BufferedReader in; //client가 전달한 메시지를 읽어들일 스트림
	   private PrintWriter out; //client로 메시지를 전송할 스트림

	   //모든 MultiServerThread 객체를 저장하고 있는 ArrayList
	   private ArrayList<MultiServerThread> clientList;

	   //MultiServerThread는 객체가 생성되는 시점에 MultiServer로부터 clientList와 client를 통신 할 수 있는
	   //Socket을 전달 받음
	   public MultiServerThread(ArrayList<MultiServerThread> clientList, Socket socket) {
	      // TODO Auto-generated constructor stub
	      
	      this.socket = socket;
	      this.clientList = clientList;      
	   }
	   
	   //스레드를 이용해서 실행시키고자하는 내용을 구현
	   //동기화로 구현되어야함
	   @Override
	   public synchronized void run() {
	      // TODO Auto-generated method stub
	      
	      try {
	         
	         //스트림연결
	         in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	         out = new PrintWriter(socket.getOutputStream());
	         
	         //클라이언트와 메시지 송수신을 반복
	         while(true){
	            
	            //클라이언트가 송신한 메시지 읽기
	            String msg = in.readLine();
	            System.out.println(msg);
	            
	            //모든 클라이언트에게 메시지 전달(broadcasting)
	            broadcasting(msg);
	            
	         }
	         
	         
	      } catch (IOException e) {
	         // TODO: handle exception
	         
	         //클라이언트와 연결이 끊어진 경우 해당 MultiServerThread 객체를 목록에서 삭제
	         //세사람이 접속했는데 한사람이 접속을 끊어버린 경우 IOException가 발생함
	         //이경우 자기 자신을 없애줘야함
	         clientList.remove(this);

	         //클라이언트와의 연결이 끊어져도 소켓은 그 ipAddress의 주소를 가지고 있음
	         String ipAddress = socket.getInetAddress().getHostAddress();
	         
	         try{
	            broadcasting(ipAddress+"와 연결이 끊어졌습니다.");
	         }catch(IOException io){
	            io.printStackTrace();
	         }

	      }
	      
	   }//end run()
	      
	   //모든 클라이언트에게 메시지 전달
	   public void broadcasting(String msg) throws IOException{
	         
	      //clientList에 저장된 MultiServerThread의 개수만큼 반복하면서
	      //각각의 MultiServerThread의 sendMsg 메서드를 호출해서 연결된 클라이언트에게 메시지 전달
	      for(MultiServerThread t : clientList){
	         
	         //개별 MultiServerThread의 sendMsg 메서드를 호출해서
	         //메시지를 각각의 클라이언트에게 전달
	         t.sendMsg(msg);
	         
	      }
	      
	   }
	   
	   //전달받은 메시지를 Socket의 OutputStream과 연결된 PrintWriter를 이용해서 클라이언트로 전달하는 메서드
	   public void sendMsg(String msg) throws IOException{
	      
	      out.println(msg);
	      out.flush(); //메시지 전달후 스트림 비움
	      
	   }

}
