package Day04;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);
		String Name;
		char grade;
		int Kor, Eng, Math, Soci, Sin, Sum;
		double Avg;
		System.out.println("�̸��� �Է��ϼ���:");
		Name = sr.nextLine();
		System.out.println("���� ������ �Է��Ͻÿ�:");
		Kor = sr.nextInt();
		System.out.println("���� ������ �Է��Ͻÿ�:");
		Eng = sr.nextInt();
		System.out.println("���м����� �Է��Ͻÿ�:");
		Math = sr.nextInt();
		System.out.println("��ȸ������ �Է��Ͻÿ�:");
		Soci = sr.nextInt();
		System.out.println("���м����� �Է��Ͻÿ�:");
		Sin = sr.nextInt();

		Sum = Kor + Eng + Math + Soci + Sin;
		Avg = Sum / 5;


		switch ((int) Avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		System.out.printf("������ %d ���̸� ����� %d�̴�.\n", Sum, (int) Avg);
		System.out.println("����� =" + grade + "�Դϴ�.");
	}
}
