package Day12_Machine;

import java.util.*;

public class Admin {
	
	Scanner sc = new Scanner(System.in);

	public void admin(){
		
		//�����ڸ�带 ���� ��ų ��
		boolean flag = true;
		
		//�޴� ������ �� �ִ� ����
		int in;
		
		//��ü ����

		
		do //�����ڸ�� �ݺ� ������ ���� �ݺ���
		{
			
			//���� ���, �ѱݾ� �� �޴��ȳ�
			System.out.println();
			System.out.println();
			
			System.out.println("���� ���");
			System.out.println("    ��    ����    ����    ����    ����    ��");
			for(int n : Attribute.amount)
				System.out.printf("%8d",n);
			
			System.out.println();
			
			System.out.println("�ݰ� �ݾ�:"+Attribute.money());
			System.out.println();
			System.out.println();
			System.out.println("�� ȸ��(1), ��ȯ���Ա�(2), ���ä���(3), �Ǹŷ�&����(4), ����(5)");
			System.out.print("�޴�����[�ٸ� ���� �Է½� ������ ��� ����]:");
			in=sc.nextInt();
			
			//�޴������� ���� switch case�� ���
			switch(in)
			{
			
			case 1: outmoney(); break;
			case 2: inmoney(); break;
			case 3: inamount(); break;
			case 4: frequency(); break;
			case 5: exit(); break;
			default: flag=false; break;
		}
		}while(flag);
	}//end admin()
	
	
	//��� �߰��� ���� �޼���
	
	public void inamount(){
		

		//����߰� �ȳ� �� ���Է�
		System.out.println("�߰��� ��Ḧ ��, ����, ����, ����, ����, ������ ���� ������ �Է�[���鱸��]");
		
		
		for(int i=0; i<Attribute.amount.length; i++){
			
			Attribute.amount[i]+=sc.nextInt();
			
		}
		//�߰� ���� ��� �� ����
		
		for(int i=0; i<Attribute.amount.length; i++){
			
			System.out.println(Attribute.material[i]+":"+Attribute.amount[i]+"��");
			
		}
		
		System.out.println("���� ���� ��ᰡ �߰� �ͷ� �Ǿ����ϴ�.");
		System.out.println();
		System.out.println("������ �޴��� �̵��Ϸ��� �ƹ�Ű�� ��������!!!");
		sc.next();
		
		
	}//end inamount
	
	
	//�Ա�
	void inmoney(){
		
		//moneyname Ŭ���� ���� ��� �� �ȳ� ���� ���
		for(String s : Attribute.moneyname){
			System.out.printf("%s",s);
		}
		System.out.print(" ������� ��ȯ�� �Է�[���� ����]: ");
		
		//�� �ݾ׺��� ���鱸���Ͽ� �Է�
		for(int i=0; i<Attribute.money[0].length; i++)
		{
			Attribute.money[1][i] += sc.nextInt();
		}	
			System.out.println();
			System.out.println("�Ʒ��� ���� ��ȯ���� �Է��Ͽ����ϴ�.");
			System.out.println();
			
		//���� �� �ݾ׺��� ����
		for(int i=0; i<Attribute.money[0].length; i++)
		{
				
				System.out.printf("%5s:%d2��\n", Attribute.moneyname[i],Attribute.money[1][i]);
				
		}
			
		System.out.println("�Ѿ�:"+Attribute.money());
		System.out.println();
		System.out.println("������ �޴��� �̵��Ϸ��� �ƹ�Ű�� ��������!!!");
		sc.next();
		
		
	}//end inmoney()
	
	
	//���
	public void outmoney(){

		int mon = Attribute.money();
		
		//���� �� �ݾ׺��� ���� ��� �� �� ���� ���� 0����
		for(int i=0; i<Attribute.money[0].length; i++)
		{
			
			System.out.print(Attribute.moneyname[i]+":"+Attribute.money[1][i]+"��");
			
			if(i != Attribute.money[1].length-1)
				System.out.print(", ");
			Attribute.money[1][i] = 0;
			
		}
		
		System.out.println();
		Attribute.deposit = 0;
	
		//���� �� �ݾ��� ����Ͽ� ȯ���� ���
		System.out.println("ȯ����:"+mon+"�Դϴ�.");
		System.out.println();
		System.out.println("������ �޴��� �̵��Ϸ��� �ƹ�Ű�� ��������!!!");
		sc.next();
		
	}
	
	
	//�Ǹŷ��� ������ ���ϴ� �޼���
	void frequency(){
		
		int temp;
		
		//������ ��Ÿ���� �迭
		int[] num = {1,1,1,1,1,1,1};
		
		//�� �޴����� �������� ����ϴ� �迭
		int[] sort={0,1,2,3,4,5,6};
		
		//�� �޴��� �Ǹŷ��� ���Ͽ� �ڽź��� �Ǹŷ��� ���� �޴��� ������ 1�� ������ ����߸�
		for(int i=0; i<Attribute.frequency.length-1; i++)
		{
			
			for(int j=i; j<Attribute.frequency.length;j++)
			{
				if(Attribute.frequency[i]<Attribute.frequency[j])
					num[i]++;
				else if(Attribute.frequency[i]>Attribute.frequency[j])
					num[j]++;
				
			}
			
		}
		
		//�������� �������� num������ sort������ ������������ ����
		
		for(int i=0; i<num.length-1; i++){
			
			for(int j=i; j<num.length; j++){
				
				if(num[i]>num[j])
				{
					
					temp = num[i];
					num[i]=num[j];
					num[j]=temp;
					
					temp=sort[i];
					sort[i]=sort[j];
					sort[j]=temp;
					
				}
				
			}
			
		}
		
		//�� �޴��� ��� ������� (i�� ������ �ƴ� sort[i] ������� ���)
		System.out.println("�޴��� ����");
		System.out.println("    �޴�     �Ǹŷ�     ����");
		
		for(int i=0; i<Attribute.frequency.length;i++)
		{
			
			if(sort[i]!=0 && sort[i] != 4)
				System.out.println("   ");
			System.out.printf("");
			System.out.printf("%5s%8d%6d��\n",Attribute.coffee[sort[i]],Attribute.frequency[sort[i]],num[i]);
			
		}
		
		System.out.println();
		
	}
	
	
	
	
	
	
	//�ݾ� ���� �޼��� inmoney outmoney
	void exit(){
		
		
		System.out.println("(((((   �Ǹų�   )))))");
		System.exit(0);
		
		
	}
	
	
	
	
	
	

}
