package Day06;

//����� �迭 (���� �迭)

import java.util.Scanner;

public class SungJuk02 {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	int[][]score; //����
	String[] name;//�̸�
	String[] grade;//����
	double[] avg;//���
	
	int total =0, student, subnum, sco;
	String Sname;
	System.out.print("�л� �� �Է�:");
	student = sc.nextInt();
	
	score =new int[student][]; //�Է� ���� �л� �� ��ŭ �迭 ũ�� �Ҵ�
	
	name = new String[student];
	
	avg= new double[student];
	grade = new String[student];
	
	for(int i=0;i<score.length;i++){
		System.out.print((i+1)+"�� �л� �̸� �Է�:");
		Sname = sc.next();
		name[i] = Sname;
		
		//���� �� �Է�
		System.out.print((i+1)+"���� �л��� ����� �Է�:");
		subnum = sc.nextInt();
		score[i] = new int[subnum];
		//����� �迭 
		//�л����� �ٸ� ������� �Է¹޾� �迭�� ���̰� ��� �ٸ� �� ����
		
		
		for(int j=0;j<score[i].length;j++)
		{
			System.out.print((i+1)+"�� �л�"+(j+1)+"�������Է�:");
			sco = sc.nextInt();
			total += sco;		//�հ�
			score[i][j] = sco;
		}
		//���
		avg[i] = (double)total/subnum;
		//total = 0;
		
		switch((int)avg[i]/10)
		{
		case 10:
		case 9: grade[i] = "A"; break;
		case 8: grade[i] = "B"; break;
		case 7: grade[i] = "C"; break;
		case 6: grade[i] = "D"; break;
			default: grade[i] = "F"; break;
		}
	}
	// ���� ���ϱ�
	
	//====================���=======================
	
	for(int i=0; i<score.length;i++)
	{
		System.out.printf("�̸� = %s \t",name[i]);
		for(int j=0; j<score[i].length;j++)
		{
			System.out.printf("%d ���� : %d \t",j+1,score[i][j]);
		}
		System.out.printf("��� : %.1f\t", avg[i]);
		System.out.printf("���� : %s \t \n", grade[i]);
	}
  }
}
