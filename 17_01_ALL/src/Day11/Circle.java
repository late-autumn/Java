package Day11;

import java.util.Scanner;

public class Circle {
	Scanner sc = new Scanner(System.in);
	int r;
	final double PI = 3.141592;
	void input() //�Է¸޼ҵ�
	{
		System.out.println("�������� �Է��ϼ���:");
		r = sc.nextInt();
	}
	double area()//���� ���ϴ� �޼ҵ�
	{
		double result = r*r*PI;
		return result;
	}
	double length()//�ѷ� ���ϴ� �޼ҵ�
	{
		double result = r*2*PI;
		return result;
	}
	void display(double a, double b)//��� �޼ҵ� 
	{
		System.out.println("������:"+r);
		System.out.printf("���� �ѷ�:%.2f\n",a);
		System.out.printf("���� ����:%.2f\n",b);
	}

	
	
}
