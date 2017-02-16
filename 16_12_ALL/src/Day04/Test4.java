package Day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Test4 {
public static void main(String[] args)throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("알파벳을 입력하시오:");
	String Input = br.readLine();
	char Change = Input.charAt(0);
	
	if (Change >= 'a' && Change <= 'z') 
	{
		System.out.printf("출력값은 =%c -> %c\n",Change,Change-32);
	}
	else if(Change >= 'A' && Change <= 'Z')
	{
		System.out.printf("출력값은 =%c -> %c \n",Change,Change+32);
	}
	else
	{
		System.out.println("잘못된 문자입니다.");
	}
	
	/* ==============================강사님 방법 =======================
	 * int n =(char)br.read();
	 * if(n>='A' && n<='Z')  혹은 if(n>=97 && n<=122)
	 * {
	 * 	n+=32;
	 * ch = (char)n;
	 * System.out.println(ch);
	 */
	
}
}
