package Day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExTest {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
	
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("������ �Է��ϼ��� (1.����, 2.����)");
		int a = (char)in.read();
		System.out.println(a=='1'? "����� �����Դϴ�":"����� �����Դϴ�");

		//System.out.println(a==1 ? "1":"2");
		
	/*	String str = in.readLine();
	//	System.out.println(str);
	//	System.out.println(str=="1"?"����":"����");
		
		System.out.println("��� �����ڸ� �Է��ϼ���");
		int b = in.read();
		
		
		if(b=='+')
		{
			System.out.println("+�Դϴ�.");
		}
		else if(b=='-')
		{
			System.out.println("-�Դϴ�");
					
		}
		*/
		
		
	}

}
