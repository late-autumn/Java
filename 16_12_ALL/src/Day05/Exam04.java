package Day05;
import java.util.Scanner;
public class Exam04 {
public static void main(String[] args) {
	

	Scanner sc = new Scanner(System.in);
	
	//변수 선언 및 두개의 실수 초기화
	float Num, result;
	Num = result = 0.0f;
	//카운트 변수 선언과 초기화
	int Count=0;
	
	for(; ;)
	{
		result+=Num;
		System.out.println("정수를 입력하세요:");
		Num = sc.nextFloat();
		
		if(Num<0){
		Num *= -1;
		result += Num;
		}
		Count++;
		System.out.println("평균은 ="+(result));
	}

	
	}	
	
}
