package NT_Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*
 *URL(Uniform Resource Locator): 인터넷에서 접근 가능한 자원의 주소를 
 * 표현할 수 있는 형식을 말함 
 * http://www.daum.net:/80/member/mem.jsp?name=ByungJun#Content
 * protocol    host     port    path    query           reference
 */

public class URLEx {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		
		try{
			URL url = new URL("http://www.daum.net/index.html");
			
			System.out.println("프로토콜:"+url.getProtocol());
			System.out.println("호스트 :"+url.getHost());
			System.out.println("포트번호:"+url.getPort());
			System.out.println("경로:"+url.getPath());
			System.out.println("파일:"+url.getFile());
			
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			String str = null;
			
			while((str=br.readLine()) !=null){
				System.out.println(str);
				
			}
		}catch(MalformedURLException me){
			me.printStackTrace();
		}catch(IOException io){
			io.printStackTrace();
		}
		finally
		{
			try{
				if(br!=null) br.close();
			}catch(IOException io){
				io.printStackTrace();
			}
		}
		
	}
	
}
