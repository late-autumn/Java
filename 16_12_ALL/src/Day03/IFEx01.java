package Day03;

import java.io.IOException;
import java.util.Scanner;
// 단순 if문

public class IFEx01 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
/*
		int a = 30;

		if (a > 100) {
			System.out.println("a의 값은 100보다 크다.");
		} else {
			System.out.println("a의 값은 100보다 작다.");
		}

		// 문제 1 ) int a =51 일때 짝수인지 홀수 인지를 판별하시오

		int b = 51;

		if (b % 2 == 0) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}

		// 문제 2 ) 사용자로부터 임의의 정수를 입력 받아 입력 받은 정수가 양수인지, 음수인지,0인지를 판별하시오 단 삼항연산자 사용

		int number;
		Scanner sr = new Scanner(System.in);
		System.out.println("임의의 수를 입력하세요:");
		number = sr.nextInt();
		String s;
		s = number <0 ? "음수": (number==0 ? "0":"양수");
		System.out.println(number+"==>"+s);


		
		//4의 배수 면서 100의 배수가 아니면서 400의 배수인 윤달을 구하기 
		int year;
		String s;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sr = new Scanner(System.in);
		System.out.println("년도를 입력하세요:");
		year = sr.nextInt();
		s =((year%4 ==0)&&(year%100!=0)||(year%400==0))?"윤년":"평년";
		System.out.println(year+"==>"+s);
	
		if((year%4==0)&&(year%100!=0)||(year%400==0))
		{
			System.out.println("윤년입니다");
		}
		else
		{
			System.out.println("평년입니다");
		}
		
		*/
		
		//사용자로부터 이름, 국어, 영어, 수학, 사회, 과학 과목의 점수를 입력받아 총점과 평균을 구하고 학점을 판정하는 프로그램을 작성하시오.
		//단 평균은 번수 선언시 실수형으로 출력은 정수형태로 출력하시오
		// 조건 : 90~100 => A학점 , 80~90 => B학점 , 70~80 => C학점, 60~70 => D학점, 60이하는 F로 처리하시오
		// 학점 판정 기준은 평균값으로 처리한다.
		
		Scanner sr = new Scanner(System.in);
		String Name;
		int Kor, Eng, Math, Soci, Sin, Sum;
		double Avg;
		System.out.println("이름을 입력하세요:");
		Name = sr.nextLine();
		System.out.println("국어 성적을 입력하시오:");
		Kor = sr.nextInt();
		System.out.println("영어 성적을 입력하시오:");
		Eng = sr.nextInt();
		System.out.println("수학성적을 입력하시오:");
		Math = sr.nextInt();
		System.out.println("사회성적을 입력하시오:");
		Soci = sr.nextInt();
		System.out.println("과학성적을 입력하시오:");
		Sin = sr.nextInt();
		
		Sum = Kor+Eng+Math+Soci+Sin;
		Avg = Sum/5;
		
		System.out.printf("총합은 %d 점이며 평균은 %d이다.\n", Sum,(int)Avg);
		
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
