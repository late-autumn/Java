package Day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExTest {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
	
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("성별을 입력하세요 (1.남자, 2.여자)");
		int a = (char)in.read();
		System.out.println(a=='1'? "당신은 남자입니다":"당신은 여자입니다");

		//System.out.println(a==1 ? "1":"2");
		
	/*	String str = in.readLine();
	//	System.out.println(str);
	//	System.out.println(str=="1"?"남자":"여자");
		
		System.out.println("산술 연산자를 입력하세요");
		int b = in.read();
		
		
		if(b=='+')
		{
			System.out.println("+입니다.");
		}
		else if(b=='-')
		{
			System.out.println("-입니다");
					
		}
		*/
		
		
	}

}
