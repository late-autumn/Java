package Day03;

import java.util.Scanner;  //Ȥ�� �Ƚ�� ������ ctrl + shift + o �� ������ �ڵ����� ����ش�.

//Scanner �Է�

public class SacnnerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�̸��� �������� ������ �Է¹޾� �հ踦 ���
		
		Scanner sc = new Scanner(System.in);
		
		int Kor, Eng, Math, Sum =0;
		String Name;
		double Avg;
		System.out.println("�̸��� �Է��ϼ���:");
		Name = sc.nextLine();  							// sc.next()�� ����ص� �������.
		System.out.println("���� ������ �Է��ϼ���:");
		Kor = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���:");
		Eng = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���:");
		Math = sc.nextInt();
		
		Sum = Kor+Eng+Math;
		Avg = Sum /3;
		
		System.out.println("�Է��Ͻ� �̸���"+Name);
		System.out.printf("������ ������ = %d ���̸� ����� %f�Դϴ�.\n", Sum,Avg);
		
		
	}

}
