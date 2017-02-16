package Day06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SungJuk {
public static void main(String[] args)throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String[] name = new String[5];	//이름
	int[] sum = new int[5];			//총점
	int[] avg= new int[5];			//평균
	char[]grade = new char[5];		//등급
	int i, j , k , h ;
	String sub[] = {"국어","영어","수학","사회","과학"};
	int [][] soc = new int[5][5];
	int rank[] = new int[5];		//석차
	
	for(i=0; i<name.length;i++)	{
		System.out.print("이름을 입력하세요:");
		name[i] = br.readLine();  //이름을 입력받는다.
		//System.out.println();
		for(j=0;j<sub.length;j++)
		{
			System.out.print(sub[j]+"점수를 입력하세요 ");
			soc[i][j] = Integer.parseInt(br.readLine());
			sum[i]+=soc[i][j];		//합계
		}
		// 평균 구하기
		avg[i]= sum[i]/5;
		
		if(avg[i]>=90)  grade[i] = 'A';
		else if(avg[i]>=80) grade[i] = 'B';
		else if(avg[i]>=70) grade[i] = 'C';
		else if(avg[i]>=60) grade[i] = 'D';
		else 
		  grade[i] = 'F';
		
		System.out.println();
	}
		//석차 구하기
		for(i=0;i<name.length;i++)
		{
			rank[i] =1;
			for(j=0;j<name.length;j++)
			{
				if(avg[i]<avg[j])
				{
					rank[i]++;
				}
			}
		}
									//출력문
		System.out.println("이름\t 국어점수\t 영어점수\t 수학점수\t 사회점수\t 과학점수\t총점\t평균\t학점\t석차");
		for(i=0;i<name.length;i++)
		{
			System.out.print(name[i]);
			for(j=0;j<sub.length;j++)
			{
				System.out.print("\t"+soc[i][j]);
			}
			System.out.println("\t"+sum[i]+"\t"+avg[i]+"\t"+grade[i]+"\t"+rank[i]);
		}
		
	
}
}
