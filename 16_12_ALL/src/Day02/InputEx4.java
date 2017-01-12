package Day02;
// 숫자 하나 이상 입력받기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputEx4 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int kor, eng, mat, sum =0;
		
		System.out.print("국어점수");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어점수");	
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학점수");	
		mat = Integer.parseInt(br.readLine());
		sum = kor + eng + mat;
		System.out.println("총합 점수는 :"+sum);
		
		
	
		
		
	}
	
}
