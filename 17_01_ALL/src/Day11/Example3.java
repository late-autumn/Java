package Day11;

import java.util.Scanner;

public class Example3 {
	
	Scanner sc = new Scanner(System.in);
	int InputNum = 0 ;
	int InputNum2 = 0;
	int result = 0;
	char CAL ;
	void input()
	{
		System.out.println("ù��° ������ �ι�° ������ �Է��ϼ���:");
		InputNum = sc.nextInt();
		InputNum2 = sc.nextInt();
		System.out.print("���ϴ� ��Ģ ������ �Է��ϼ���:");
		CAL = sc.next().charAt(0);
	}
	
	void cal()
	{
		switch(CAL)
		{
		case '+':
			result = InputNum+InputNum2;
			System.out.println("������ �Ͽ����ϴ�");
			break;
		case '-':
			result = InputNum-InputNum2;
			System.out.println("������ �Ͽ����ϴ�");
			break;
		case '*':
			result = InputNum*InputNum2;
			System.out.println("������ �Ͽ����ϴ�");
			break;
		case '/':
			result = InputNum/InputNum2;
			System.out.println("�������� �Ͽ����ϴ�");
			break;
			default:
				System.out.println("�Է� ����");
		}
	}
	void print()
	{
		System.out.println("����� :"+result);
	}
	
}
