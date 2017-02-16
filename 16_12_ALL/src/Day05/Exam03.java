package Day05;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Exam03 {
public static void main(String[] args)throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int num1, result =0;
	
	do{
		System.out.print("정수를 입력하세요 (0:종료):");
		num1 = Integer.parseInt(br.readLine());
		result+=num1;
		
	}while(num1!=0);
	System.out.println("총합은 ="+result);
	
}
}
