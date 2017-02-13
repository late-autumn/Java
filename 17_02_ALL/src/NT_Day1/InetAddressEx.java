package NT_Day1;
import java.net.*;
public class InetAddressEx {

	public static void main(String[] args) {
		
		//InetAddress�� IP�� Host ������ ������ ��ü
		//InetAddress��ü�� �����ڰ� �ƴ� static �޼ҵ带 �̿��ؼ� ������
		
		try{
			//IP������ ���� inetAddress��ü ��� 			
			InetAddress ipInfo1 = InetAddress.getByName("www.daum.net");
			
			//IP�ּ� ��� 
			String ip = ipInfo1.getHostAddress();
			System.out.println("IP�ּ� :"+ip);
			
			
			//host�̸��� �ش��ϴ� IP������ ���� ��� inetAddress��ü ���
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
