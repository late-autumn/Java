package Day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Test6 {
public static void main(String[] args)throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	

	int Num1,Num2,result=0;
	System.out.print("첫번째 수 :");
	Num1 = Integer.parseInt(br.readLine());
	System.out.print("두번째 수 :");
	Num2 = Integer.parseInt(br.readLine());
	System.out.print("연산을 입력하세요:");
	char Math = (char)br.read();
	
	switch(Math)
	{
	case '+':
		result = Num1+Num2;
		break;
	case'-':
		result = Num1-Num2;
		break;
	case '*':
		result = Num1*Num2;
		break;
	case '/':
		result = Num1/Num2;
		break;
	default:
		System.out.println("없는 연산입니다.");
	}
	System.out.printf("%d %c %d = %d \n",Num1,Math,Num2,result);
	
}

}
