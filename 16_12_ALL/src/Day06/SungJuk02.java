package Day06;

//레기드 배열 (가변 배열)

import java.util.Scanner;

public class SungJuk02 {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	int[][]score; //점수
	String[] name;//이름
	String[] grade;//학점
	double[] avg;//평균
	
	int total =0, student, subnum, sco;
	String Sname;
	System.out.print("학생 수 입력:");
	student = sc.nextInt();
	
	score =new int[student][]; //입력 받은 학생 수 만큼 배열 크기 할당
	
	name = new String[student];
	
	avg= new double[student];
	grade = new String[student];
	
	for(int i=0;i<score.length;i++){
		System.out.print((i+1)+"번 학생 이름 입력:");
		Sname = sc.next();
		name[i] = Sname;
		
		//과목 수 입력
		System.out.print((i+1)+"번의 학생의 과목수 입력:");
		subnum = sc.nextInt();
		score[i] = new int[subnum];
		//레기드 배열 
		//학생마다 다른 과목수를 입력받아 배열의 길이가 모두 다를 수 있음
		
		
		for(int j=0;j<score[i].length;j++)
		{
			System.out.print((i+1)+"번 학생"+(j+1)+"과목성적입력:");
			sco = sc.nextInt();
			total += sco;		//합계
			score[i][j] = sco;
		}
		//평균
		avg[i] = (double)total/subnum;
		//total = 0;
		
		switch((int)avg[i]/10)
		{
		case 10:
		case 9: grade[i] = "A"; break;
		case 8: grade[i] = "B"; break;
		case 7: grade[i] = "C"; break;
		case 6: grade[i] = "D"; break;
			default: grade[i] = "F"; break;
		}
	}
	// 석차 구하기
	
	//====================출력=======================
	
	for(int i=0; i<score.length;i++)
	{
		System.out.printf("이름 = %s \t",name[i]);
		for(int j=0; j<score[i].length;j++)
		{
			System.out.printf("%d 과목 : %d \t",j+1,score[i][j]);
		}
		System.out.printf("평균 : %.1f\t", avg[i]);
		System.out.printf("학점 : %s \t \n", grade[i]);
	}
  }
}
