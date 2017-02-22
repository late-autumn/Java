package Day20;
import java.io.*;
public class PrintWriterEx {

	public static void main(String[] args) {
		
		PrintWriter pw = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try{
			fos = new FileOutputStream("c:/비둘기/printWriter.txt");
			bos = new BufferedOutputStream(fos);
			pw = new PrintWriter(bos,true);
			
			pw.println("하이하이");
			pw.println("배고프다");
			pw.println(100.0);
			pw.println(true);
			
			
		}catch(FileNotFoundException fe){
			fe.printStackTrace();
		}catch(IOException ie){
			ie.printStackTrace();
		}finally{
			try{
				if(pw!=null) pw.close();
				if(bos!=null) bos.close();
				if(fos!=null) fos.close();
			}catch(Exception e){
				e.getMessage();
			}
		}
		
		
	} 
	
	
}
