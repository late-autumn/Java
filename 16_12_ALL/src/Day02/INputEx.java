package Day02;

import java.io.IOException;

//ASCII 코드 입력받기

public class INputEx {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub

/*		System.out.print("문자 입력 :");
		int i = System.in.read();
		
		System.out.println("아스키 코드 값 입력 :"+i);
		System.out.println((char)i);
*/		
		
		System.out.print("문자 입력:");
		char ch = (char)System.in.read();
		System.out.println("입력받은 문자: "+ch);
		
		
	}

}
