package Day20;
import java.io.*;
public class BufferedWriterEx {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try{
			fw = new FileWriter("c:/��ѱ�/hello.txt");
			bw = new BufferedWriter(fw);
			
			bw.newLine();
			bw.write("�ȳ��ϼ���:"+System.getProperty("line.separator"));
			bw.write("�ȳ��ϼ���2:"+System.lineSeparator());
			bw.write("�氩���ϴ�");
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
