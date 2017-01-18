package Day20;
import java.net.*;
import java.io.*;
import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;
public class ScannerEx2 {
	
	public static void main(String[] args) {
		Scanner sc = null;
		URLConnection urlcon = null;
		
		try{
			urlcon = new URL("http://www.daum.net/index.html").openConnection();
			sc = new Scanner(urlcon.getInputStream());
			sc.useDelimiter("\\Z");
			String text = sc.next();
			System.out.println(text);
		}catch(IOException io){
			io.printStackTrace();
		}
		finally{
			if(sc!=null) sc.close();
		}
	}
}
