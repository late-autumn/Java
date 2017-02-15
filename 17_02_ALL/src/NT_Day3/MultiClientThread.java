package NT_Day3;

import java.io.*;

public class MultiClientThread extends Thread {

   private BufferedReader in; //서버가 전송할 메시지를 수신하기 위한 클래스
   
   //객체 생성시에 서버가 전달한 메시지를 읽어 들일 수 있는 BufferedReader를 전달받음
   public MultiClientThread(BufferedReader in) {
      // TODO Auto-generated constructor stub
      this.in = in;
   }

   @Override
   public void run() {
      // TODO Auto-generated method stub

      try{
         
         while(true){
            String text = in.readLine();
            System.out.println("수신메시지:"+text);
         }
         
      }catch(IOException io){
         io.printStackTrace();
      }
      
   }
   
}