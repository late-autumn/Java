package NT_Day1;

import java.io.*;
import java.net.*;

public class URLConnectionEx {

	public static void main(String[] args) {
		
		
		BufferedReader br = null;
		try{
			
			URL url = new URL("http://java.sun.com/");
			URLConnection uc = url.openConnection();
			uc.connect();
			
			String str = null;
			
			br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
			
			while((str=br.readLine())!=null){
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
