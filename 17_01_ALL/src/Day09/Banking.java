package Day09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Banking {
public static void main(String[] args)throws IOException {
		Account na = new Account("ȫ�浿");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int input;
		int money;
		String strWork;
		int switchInt = 0;

		do{
			System.out.println("�޴��� �Է����ּ���.");
			System.out.println("===============");
			System.out.println("1�� �Ա�");
			System.out.println("2�� ���");
			System.out.println("3�� ��ȸ");
			System.out.println("0�� ����");
			System.out.println("===============");
			strWork = br.readLine();
		if(strWork!=null)
		{
			switchInt = Integer.parseInt(strWork);
		}
		else
		{
			System.out.println("�۾� ������ �Է����� �����̽��ϴ�.");
			System.exit(0);
		}
		
		//switch�� ����
		switch(switchInt)
		{
		case 1:
			System.out.println("�Ա� �Ͻ� �ݾ��� �Է��ϼ��� :");
			System.out.println("===============");
			money = sc.nextInt();
			na.deposit(money);
			break;
		case 2:
			System.out.println("����Ͻ� �ݾ��� �Է��ϼ���:");
			System.out.println("===============");
			money = sc.nextInt();
			na.withdraw(money);
			break;
		case 3:
			System.out.println("�ܾ� ��ȸ �Դϴ�.");
			System.out.println("===============");
			na.display();
			break;
		case 0:
			System.out.println("���� ���� �Դϴ�.");
			System.exit(0);
			default:
				System.out.println("�߸� �����̽��ϴ�.0���� 3 ������ ���ڸ� �����ּ���");

		}//end switch��
		
		}while(!strWork.equals(0));

		
	
}
}
