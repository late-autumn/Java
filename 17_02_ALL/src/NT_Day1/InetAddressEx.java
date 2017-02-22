package NT_Day1;
import java.net.*;
public class InetAddressEx {

	public static void main(String[] args) {
		
		//InetAddress는 IP와 Host 정보를 가지는 객체
		//InetAddress객체는 생성자가 아닌 static 메소드를 이용해서 생성함
		
		try{
			//IP정보를 가진 inetAddress객체 얻기 			
			InetAddress ipInfo1 = InetAddress.getByName("www.daum.net");
			
			//IP주소 얻기 
			String ip = ipInfo1.getHostAddress();
			System.out.println("IP주소 :"+ip);
			
			
			//host이름에 해당하는 IP정보를 가진 모든 inetAddress객체 얻기
			InetAddress[] ipArray = InetAddress.getAllByName("www.daum.net");
			
			for(InetAddress tempip : ipArray){
				System.out.println(tempip);
			}
			
			InetAddress myHost = InetAddress.getLocalHost();
			System.out.println("host:"+myHost.getHostName());
			System.out.println("host ip :"+myHost.getHostAddress());
			
		}catch(UnknownHostException e){
				e.printStackTrace();
		}
	}
}
