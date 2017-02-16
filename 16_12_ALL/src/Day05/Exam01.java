package Day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam01 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	

		int num1, num2,result=0 ;
		int min=0 ,max=0;
		System.out.print("첫번째 정수를 입력해주세요:");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("두번째 정수를 입력해주세요:");
		num2 = Integer.parseInt(br.readLine());


		if(num1>num2){
			num1 = num1^num2;
			num2 = num2^num1;
			num1 = num1^num2;
		}
		min = num1;
		max = num2;
		while(num1<=num2){
		result +=num1;
		num1++;
		}		
		
		System.out.println("작은수부터의 순서는 결과 = :"+min+","+max+" 합계는 ="+result);
		
	}
}
