package Day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 {
	

	int InputNum = 0;
	int Sum = 0;

	void Input()throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1~1000������ ���ڸ� �Է��ϼ���:");
		InputNum = Integer.parseInt(br.readLine());

		if(InputNum<1 || InputNum>1000)
		{
			System.out.println("�߸� �Է��ϼ̽��ϴ� . �ٽ��Է��ϼ���");
			Input();
		}
	

	}
	void add()
	{
		for(int i=1; i<=InputNum;i++)
		{
			Sum += i;
		}
	}
	void display()
	{
		System.out.println("�Է��Ͻ� ���� : "+InputNum+"�Դϴ�.");
		System.out.println("1������ �� ����:"+Sum+"�Դϴ�.");
	}

	
}
