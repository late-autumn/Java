package Day19;

import java.io.*;

public class FileInputStreamEx {
public static void main(String[] args) {
	
	FileInputStream fis = null;
	
	byte _read[] = new byte[100];
	byte console[] = new byte[100];
	
	try{
		System.out.print("ÆÄÀÏ¸í:");
		System.in.read(console);
		String file = new String(console).trim();
		
		fis = new FileInputStream(file);
		fis.read(_read,0,_read.length);
		System.out.println(new String(_read).trim());
		
	}catch(FileNotFoundException fe){
		fe.printStackTrace();
	}catch(IOException io){
		io.printStackTrace();
	}finally{
		
		try{
			if(fis!=null)fis.close();
		}catch(IOException io){
			io.printStackTrace();
		}
	}
	
	
}
}
