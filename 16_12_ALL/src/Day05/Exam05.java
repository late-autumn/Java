package Day05;

import java.util.Scanner;
public class Exam05 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int menu;
	int InputNum, Result=0;
	int StartNum=1;
	
	do{
		//�޴� ����
		System.out.println("1.������ ��");
		System.out.println("2.¦���� ��");
		System.out.println("3.Ȧ���� ��");
		System.out.println("4.�� ��");
		System.out.print("����==>");
		menu = sc.nextInt();
		System.out.println();
		if(menu==4)System.exit(0);
	}
	while(menu<1||menu>4);

	do{
		System.out.println("���ϴ� �� �Է��ϼ���:");
		InputNum = sc.nextInt();
	}while(InputNum<1||InputNum>1000);
	
	//�޴� ó���ϴ� �κ�, ���ǹ� ��� 
		if(menu ==1){
			for(int i=1;i<=InputNum;i++)
			{
				Result += i;
			}
			System.out.println("1�� �հ� ���:"+Result);
		}
		else if(menu ==2)
		{
			for(int i=2;i<=InputNum;i+=2)
			{
				Result+=i;
			}
			System.out.println("2�� ¦�� �հ� ���:"+Result);
		}
			
		else if(menu==3)
		{
			for(int i=1;i<=InputNum;i+=2)
			{
				Result +=i;
			}
			System.out.println("3�� Ȧ�� �հ� ���:"+Result);
		}



	
			
		
	

 }
}
