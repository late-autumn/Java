package Day11;

import java.util.Scanner;


public class Sung extends Record{
	//주요 변수 (속성 선언)
	Scanner sc = new Scanner(System.in);
	Record[] rec; //Record 클래스 배열 화 
	
	
	//기능(메소드)
	//1.인원수 입력
	void Input_people()
	{
		do{
		System.out.print("학생 수 입력:");
		student = sc.nextInt();
		rec = new Record[student];
		}while(student<1 || student>10);
	}
	//2.데이터 입력 및 계산
	//총점, 평균 계산
	//석차 계산
	void Data_Input()
	{
		String[] title = {"국어","영어","수학"};       
		for(int i=0;i<student;i++)
		{
			rec[i] = new Record(); //이게 핵심 포인트 아주아주 중요하다 
			
			System.out.print((i+1)+"번째 이름입력:");
			rec[i].name = sc.next();
			
			for(int j=0; j <title.length;j++)
			{
				System.out.print(title[j]);
				//입력 받은 데이터를 스코어에 저장한다.
				rec[i].score[j] = sc.nextInt();
				//반복되는 동안 입력받은 점수의 총합을 구함
				rec[i].total += rec[i].score[j];
			}
			//평균 구하기 
			rec[i].avg = rec[i].total/student;
		}
	}
	
	//석차 계산하기
	void ranking()
	{
		//모든 학생의 등수를 1로 초기화 해야한다.
		for(int i=0; i< student;i++)
		{
			rec[i].rank = 1;
		//석차 계산
			for(int j=0;j<student;j++)
			{
				if(rec[i].rank<rec[i].rank)
				{
					rec[i].rank++;
				}
			}
		}
	}
	
	//출력
	void print()
	{
		System.out.println();
		System.out.println("이름	국어  영어  수학  총점  평균  석차");
		//학생 1명당 반복 출력
		for(int i=0;i<student;i++)
		{
			//이름 출력
			System.out.print(rec[i].name+"의 성적은:");
			//성적 출력
			for(int j= 0; j<rec[i].score.length;j++){
			System.out.printf("%5d",rec[i].score[j]);
			}
			//총점 과 평균
			System.out.printf("%5d",rec[i].total);
			System.out.printf("%7.2f",rec[i].avg);
			System.out.printf("%d",rec[i].rank);
			System.out.println();
		}
	}

	
}
