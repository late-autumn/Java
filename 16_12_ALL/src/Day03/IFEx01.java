package Day03;

import java.io.IOException;
import java.util.Scanner;
// �ܼ� if��

public class IFEx01 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
/*
		int a = 30;

		if (a > 100) {
			System.out.println("a�� ���� 100���� ũ��.");
		} else {
			System.out.println("a�� ���� 100���� �۴�.");
		}

		// ���� 1 ) int a =51 �϶� ¦������ Ȧ�� ������ �Ǻ��Ͻÿ�

		int b = 51;

		if (b % 2 == 0) {
			System.out.println("¦���Դϴ�");
		} else {
			System.out.println("Ȧ���Դϴ�");
		}

		// ���� 2 ) ����ڷκ��� ������ ������ �Է� �޾� �Է� ���� ������ �������, ��������,0������ �Ǻ��Ͻÿ� �� ���׿����� ���

		int number;
		Scanner sr = new Scanner(System.in);
		System.out.println("������ ���� �Է��ϼ���:");
		number = sr.nextInt();
		String s;
		s = number <0 ? "����": (number==0 ? "0":"���");
		System.out.println(number+"==>"+s);


		
		//4�� ��� �鼭 100�� ����� �ƴϸ鼭 400�� ����� ������ ���ϱ� 
		int year;
		String s;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sr = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ���:");
		year = sr.nextInt();
		s =((year%4 ==0)&&(year%100!=0)||(year%400==0))?"����":"���";
		System.out.println(year+"==>"+s);
	
		if((year%4==0)&&(year%100!=0)||(year%400==0))
		{
			System.out.println("�����Դϴ�");
		}
		else
		{
			System.out.println("����Դϴ�");
		}
		
		*/
		
		//����ڷκ��� �̸�, ����, ����, ����, ��ȸ, ���� ������ ������ �Է¹޾� ������ ����� ���ϰ� ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//�� ����� ���� ����� �Ǽ������� ����� �������·� ����Ͻÿ�
		// ���� : 90~100 => A���� , 80~90 => B���� , 70~80 => C����, 60~70 => D����, 60���ϴ� F�� ó���Ͻÿ�
		// ���� ���� ������ ��հ����� ó���Ѵ�.
		
		Scanner sr = new Scanner(System.in);
		String Name;
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
		
		Sum = Kor+Eng+Math+Soci+Sin;
		Avg = Sum/5;
		
		System.out.printf("������ %d ���̸� ����� %d�̴�.\n", Sum,(int)Avg);
		
		if(Avg>=90)
		{
			System.out.println("A");
		}
		else if(Avg>=80)
		{
			System.out.println("B");
		}
		else if(Avg>=70)
		{
			System.out.println("C");
		}
		else if(Avg>=60)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}
		String s =((Avg>=90)?"A":(Avg>=80)?"B":(Avg>=70)?"C":(Avg>=60)?"D":"F");
		System.out.println(s);


	}

}
