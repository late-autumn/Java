package Day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Test4 {
public static void main(String[] args)throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("���ĺ��� �Է��Ͻÿ�:");
	String Input = br.readLine();
	char Change = Input.charAt(0);
	
	if (Change >= 'a' && Change <= 'z') 
	{
		System.out.printf("��°��� =%c -> %c\n",Change,Change-32);
	}
	else if(Change >= 'A' && Change <= 'Z')
	{
		System.out.printf("��°��� =%c -> %c \n",Change,Change+32);
	}
	else
	{
		System.out.println("�߸��� �����Դϴ�.");
	}
	
	/* ==============================����� ��� =======================
	 * int n =(char)br.read();
	 * if(n>='A' && n<='Z')  Ȥ�� if(n>=97 && n<=122)
	 * {
	 * 	n+=32;
	 * ch = (char)n;
	 * System.out.println(ch);
	 */
	
}
}
