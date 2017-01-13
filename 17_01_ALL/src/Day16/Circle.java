package Day16;

import java.util.Scanner;

/*
 * 원의 넓이와 둘레 구하기
 * 멤버변수 : 원주율, 반지름
 * 메소드 : 넓이, 둘레, 반지름입력, 출력
 * 넓이: 반지름 * 반지름 * 3.14
 * 둘레 :반지름 *2 * 3.14
 * 
 */
public class Circle {
	Scanner sc = new Scanner(System.in);
	int radius;
	final static double PI = 3.14159;
	
	//입력 메소드
	void input(){
		System.out.println("반지름을 입력하세요:");
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
