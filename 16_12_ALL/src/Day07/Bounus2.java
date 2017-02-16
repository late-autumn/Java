package Day07;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Bounus2 {
public static void main(String[] args)throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int human = Integer.parseInt(args[0]); //사람 수
	String name[] = new String[human];
	String[] subject = new String[args.length-1];
	//과목명 초기화
	//점수와 총점처리 배열
	
	int[][]jumsu = new int[human][args.length];
	float[] avg = new float[human];
	char[] grade = new char[human];
	int[] rank = new int[human];
	
	for(int i=0;i<args.length-1;i++)
	{
		subject[i] = args[i+1]; //과목명 가져오기		
	}
	for(int i=0;i<human;i++)//사람 수 만큼 반복
	{
		System.out.print(i+1+"번째 학생 이름:");
		name[i] = br.readLine();
		System.out.print("응시과목수:");
		System.out.println(name[i]+"학생 점수 입력:");
		for(int j=0; j<subject.length;j++)
		{	//과목수만큼 총점을 구한다.
			System.out.print(subject[j]+"점수:");
			jumsu[i][j] = Integer.parseInt(br.readLine());
			
			jumsu[i][subject.length]+=jumsu[i][j];
			//총점 구함
		}
	}
	//평균 구하기 
	
	//학점 구하기
	
	//석차 구하기
	
	//성적표 출력
	System.out.print("이름\t");
	for(int i=0;i<subject.length;i++)
	{
		System.out.print(subject[i]+"\t");	
	}
	System.out.println("총점 \t");
	
	for(int i=0; i<human;i++)
	{
		System.out.print(name[i]+"\t");
		for(int j=0;j<subject.length+1;j++)
		{	//과목점수와 총점 출력
			System.out.print(jumsu[i][j]+"\t");
		}
		
		System.out.print(avg[i]+"평균 \t");
		System.out.println();
	}
	
}
}
