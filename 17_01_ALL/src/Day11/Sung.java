package Day11;

import java.util.Scanner;


public class Sung extends Record{
	//�ֿ� ���� (�Ӽ� ����)
	Scanner sc = new Scanner(System.in);
	Record[] rec; //Record Ŭ���� �迭 ȭ 
	
	
	//���(�޼ҵ�)
	//1.�ο��� �Է�
	void Input_people()
	{
		do{
		System.out.print("�л� �� �Է�:");
		student = sc.nextInt();
		rec = new Record[student];
		}while(student<1 || student>10);
	}
	//2.������ �Է� �� ���
	//����, ��� ���
	//���� ���
	void Data_Input()
	{
		String[] title = {"����","����","����"};       
		for(int i=0;i<student;i++)
		{
			rec[i] = new Record(); //�̰� �ٽ� ����Ʈ ���־��� �߿��ϴ� 
			
			System.out.print((i+1)+"��° �̸��Է�:");
			rec[i].name = sc.next();
			
			for(int j=0; j <title.length;j++)
			{
				System.out.print(title[j]);
				//�Է� ���� �����͸� ���ھ �����Ѵ�.
				rec[i].score[j] = sc.nextInt();
				//�ݺ��Ǵ� ���� �Է¹��� ������ ������ ����
				rec[i].total += rec[i].score[j];
			}
			//��� ���ϱ� 
			rec[i].avg = rec[i].total/student;
		}
	}
	
	//���� ����ϱ�
	void ranking()
	{
		//��� �л��� ����� 1�� �ʱ�ȭ �ؾ��Ѵ�.
		for(int i=0; i< student;i++)
		{
			rec[i].rank = 1;
		//���� ���
			for(int j=0;j<student;j++)
			{
				if(rec[i].rank<rec[i].rank)
				{
					rec[i].rank++;
				}
			}
		}
	}
	
	//���
	void print()
	{
		System.out.println();
		System.out.println("�̸�	����  ����  ����  ����  ���  ����");
		//�л� 1��� �ݺ� ���
		for(int i=0;i<student;i++)
		{
			//�̸� ���
			System.out.print(rec[i].name+"�� ������:");
			//���� ���
			for(int j= 0; j<rec[i].score.length;j++){
			System.out.printf("%5d",rec[i].score[j]);
			}
			//���� �� ���
			System.out.printf("%5d",rec[i].total);
			System.out.printf("%7.2f",rec[i].avg);
			System.out.printf("%d",rec[i].rank);
			System.out.println();
		}
	}

	
}
