package Day20;
import java.io.*;
public class PrintStreamEx {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		
		try{
			fos = new FileOutputStream("c:/비둘기/printStream.txt");
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos,true);
			
			ps.println("홍길동");
			ps.println(1234);
			ps.println(true);
			ps.println('A');
		}catch(FileNotFoundException fe){
			fe.getMessage();
		}catch(IOException ie){
			ie.getMessage();
		}finally{
			try{
				if(ps!=null)ps.close();
			}catch(Exception e){
				e.getMessage();
			}
			try{
				if(bos!=null)bos.close();
			}catch(Exception e){
				e.getMessage();
			}
			try{
				if(fos!=null)fos.close();
			}catch(Exception e){
				e.getMessage();
			}
		}
		
	}
}
