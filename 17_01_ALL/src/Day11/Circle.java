package Day11;

import java.util.Scanner;

public class Circle {
	Scanner sc = new Scanner(System.in);
	int r;
	final double PI = 3.141592;
	void input() //입력메소드
	{
		System.out.println("반지름을 입력하세요:");
		r = sc.nextInt();
	}
	double area()//넓이 구하는 메소드
	{
		double result = r*r*PI;
		return result;
	}
	double length()//둘레 구하는 메소드
	{
		double result = r*2*PI;
		return result;
	}
	void display(double a, double b)//출력 메소드 
	{
		System.out.println("반지름:"+r);
		System.out.printf("원의 둘레:%.2f\n",a);
		System.out.printf("원의 넓이:%.2f\n",b);
	}

	
	
}
