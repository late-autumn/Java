package Day05;

import java.util.Scanner;

public class Exam06 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int s,n,num;
	char ch; // y,n�� �Է��� ���� 
	while(true)
	{
		do{
			System.out.println("���ϴ� �� �Է�:");
			num = sc.nextInt();
			//���ϴ� �� �Է�
		}while(1>num ||num>1000);
		
		s = 0;
		for(n=1;n<=num;n++)
		{
			s+=n;
		}
		System.out.println("1��������"+num+"������ ���� ������ ="+s);
		System.out.println("��� �Ͻðڽ��ϱ�? y or n");
		ch = sc.next().charAt(0);
		if(ch!='Y'&&ch!='y')
		break;
	}
	
}
}
