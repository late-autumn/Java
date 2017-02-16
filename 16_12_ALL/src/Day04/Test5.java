package Day04;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);
		String Name;
		char grade;
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
		System.out.printf("총합은 %d 점이며 평균은 %d이다.\n", Sum, (int) Avg);
		System.out.println("등급은 =" + grade + "입니다.");
	}
}
