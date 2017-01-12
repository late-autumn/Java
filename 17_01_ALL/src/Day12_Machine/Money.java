package Day12_Machine;

import java.util.Scanner;

import org.w3c.dom.Attr;

//������ Ŀ�� �Ǹ� �� ������ ����� ��,��� ���Ŭ���� 
public class Money {

	Scanner sc = new Scanner(System.in);
	//������ Ŭ���� Ŀ��ȣ��
	RandomCoffee cof1 = new RandomCoffee(); 	 
	OriginalCoffee cof2 = new OriginalCoffee();
	TesteCoffee cof3 = new TesteCoffee();
	
	//�Աݰ� ����� ó���ϴ� �޼ҵ� ����
	public void inmoney(){
		
		Admin ad = new Admin();
		
		System.out.print("�ݾ��� �־� �ּ���(���鱸��):");
		System.out.println("���� �ܾ�: "+Attribute.deposit);
		
		//�ּұݾ� Ȯ���Ͽ� ���� �κ� ����
		if(Attribute.deposit<1000)
		{
			System.out.print("100��[1] 500��[2] 1000��[3] 5000��[4] ��ȯ[5]:");
		}
		else{
			System.out.print("100��[1] 500��[2] 1000��[3] 5000��[4] ��ȯ [5] �� ����[6]:");
		}
		int input = sc.nextInt();
		if(input ==1)
		{
		Attribute.deposit += 100;	//���� �ݾ�����
		Attribute.money[1][0]++;	//�ӽſ� ���� ���� ����
		}
		else if(input ==2)
		{
			Attribute.deposit += 500;
			Attribute.money[1][1]++;
		}
		else if(input ==3)
		{
			Attribute.deposit += 1000;
			Attribute.money[1][2]++;
		}
		else if(input ==4)
		{
			Attribute.deposit += 5000;
			Attribute.money[1][3]++;
		}
		else if(input ==5)
		{
			outmoney();
		}
		else if(input ==6)
		{
			//�ݾ��� ������ ��� �ٽ� �Է� �ޱ�
			if(Attribute.deposit<1000)
			{
				System.out.print("�ݾ��� �����մϴ�.");
			}
			else
			{
				System.out.print("�޴��� �����ϼ���:");
				input = sc.nextInt();
				if(input>=1 && input <=5)
					cof2.menu(input);
				else if(input == 6 && Attribute.deposit>=2500)//���� Ŀ��
					cof1.menu();
				else if(input == 7 && Attribute.deposit>=3000)//���� Ŀ��
					cof3.menu();
			}
		}
		else if(input ==1234)//������ Ȯ��
		{
			ad.admin();
		}
		System.out.println();
	}//end inmoney()
	
	public void outmoney()
	{
		boolean flag = true;
		int[] num = new int[4];
		int won = Attribute.deposit;
		
		for(int i =Attribute.money[1].length-1;i>=0;i--)
		{
			if(Attribute.deposit / Attribute.money[0][i] < Attribute.money[1][i]
				&& Attribute.money[1][i] !=0)
			{
				num[i] = Attribute.deposit / Attribute.money[0][i];
				Attribute.deposit -=(num[i]*Attribute.money[0][i]);
			}
			else
			{
				if(i==0)
				{
					Attribute.deposit =0;
					System.out.println("�� ó���� �ݾ� : "+won);
					System.out.println("�����ڿ��� ���� �ٶ��ϴ�.");
					System.out.println("010-123-1234");
					System.out.println("�ܵ� ó���� �Ϸ� �Ǿ����� �ƹ�Ű�� ��������");
					flag = true;
					sc.next();
				}
			}
		}//for������ 
		
		if(flag)
		{
			Attribute.deposit = 0;
			for(int i=0; i<num.length;i++)
			{
				Attribute.money[1][i]-= num[i];
			}
			System.out.println("�ܵ� ��ȯ�� �Ϸ� �Ǿ����ϴ�.[��ȯ�ݾ�:"+won+"��");
		}
	}//end outmoney()
	
	
	
}
