package Day06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SungJuk {
public static void main(String[] args)throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String[] name = new String[5];	//�̸�
	int[] sum = new int[5];			//����
	int[] avg= new int[5];			//���
	char[]grade = new char[5];		//���
	int i, j , k , h ;
	String sub[] = {"����","����","����","��ȸ","����"};
	int [][] soc = new int[5][5];
	int rank[] = new int[5];		//����
	
	for(i=0; i<name.length;i++)	{
		System.out.print("�̸��� �Է��ϼ���:");
		name[i] = br.readLine();  //�̸��� �Է¹޴´�.
		//System.out.println();
		for(j=0;j<sub.length;j++)
		{
			System.out.print(sub[j]+"������ �Է��ϼ��� ");
			soc[i][j] = Integer.parseInt(br.readLine());
			sum[i]+=soc[i][j];		//�հ�
		}
		// ��� ���ϱ�
		avg[i]= sum[i]/5;
		
		if(avg[i]>=90)  grade[i] = 'A';
		else if(avg[i]>=80) grade[i] = 'B';
		else if(avg[i]>=70) grade[i] = 'C';
		else if(avg[i]>=60) grade[i] = 'D';
		else 
		  grade[i] = 'F';
		
		System.out.println();
	}
		//���� ���ϱ�
		for(i=0;i<name.length;i++)
		{
			rank[i] =1;
			for(j=0;j<name.length;j++)
			{
				if(avg[i]<avg[j])
				{
					rank[i]++;
				}
			}
		}
									//��¹�
		System.out.println("�̸�\t ��������\t ��������\t ��������\t ��ȸ����\t ��������\t����\t���\t����\t����");
		for(i=0;i<name.length;i++)
		{
			System.out.print(name[i]);
			for(j=0;j<sub.length;j++)
			{
				System.out.print("\t"+soc[i][j]);
			}
			System.out.println("\t"+sum[i]+"\t"+avg[i]+"\t"+grade[i]+"\t"+rank[i]);
		}
		
	
}
}
