package Day16;

import java.util.Scanner;

/*
 * ���� ���̿� �ѷ� ���ϱ�
 * ������� : ������, ������
 * �޼ҵ� : ����, �ѷ�, �������Է�, ���
 * ����: ������ * ������ * 3.14
 * �ѷ� :������ *2 * 3.14
 * 
 */
public class Circle {
	Scanner sc = new Scanner(System.in);
	int radius;
	final static double PI = 3.14159;
	
	//�Է� �޼ҵ�
	void input(){
		System.out.println("�������� �Է��ϼ���:");
		radius = sc.nextInt();
	}
	double area(){
		double area = radius * radius * PI;
		return area;
	}
	double length(){
		double length = radius*2*PI;
		return length;
	}
	void print(double a, double b){
		System.out.println(a+ ","+b);
	}

}
