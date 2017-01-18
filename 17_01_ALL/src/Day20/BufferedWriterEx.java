package Day20;
import java.io.*;
public class BufferedWriterEx {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try{
			fw = new FileWriter("c:/비둘기/hello.txt");
			bw = new BufferedWriter(fw);
			
			bw.newLine();
			bw.write("안녕하세요:"+System.getProperty("line.separator"));
			bw.write("안녕하세요2:"+System.lineSeparator());
			bw.write("방갑습니다");
			bw.flush();
		}catch(IOException e){
			e.getMessage();
		}finally{
			try{
				if(fw!=null){
					fw.close();
				}
			}catch(IOException ie){
				ie.getMessage();
			}
			try{
				if(bw!=null){
					bw.close();
				}
			}catch(IOException ie){
				ie.getMessage();
			}
		}
	}
}
