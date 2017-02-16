package Day03;

import java.util.Scanner;  //혹시 안썼다 싶을땐 ctrl + shift + o 를 누르면 자동으로 잡아준다.

//Scanner 입력

public class SacnnerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//이름과 세과목의 성적을 입력받아 합계를 출력
		
		Scanner sc = new Scanner(System.in);
		
		int Kor, Eng, Math, Sum =0;
		String Name;
		double Avg;
		System.out.println("이름을 입력하세요:");
		Name = sc.nextLine();  							// sc.next()로 사용해도 상관없다.
		System.out.println("국어 성적을 입력하세요:");
		Kor = sc.nextInt();
		System.out.println("영어 성적을 입력하세요:");
		Eng = sc.nextInt();
		System.out.println("수학 성적을 입력하세요:");
		Math = sc.nextInt();
		
		Sum = Kor+Eng+Math;
		Avg = Sum /3;
		
		System.out.println("입력하신 이름은"+Name);
		System.out.printf("성적의 총합은 = %d 점이며 평균은 %f입니다.\n", Sum,Avg);
		
		
	}

}
