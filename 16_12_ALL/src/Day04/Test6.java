package Day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Test6 {
public static void main(String[] args)throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	

	int Num1,Num2,result=0;
	System.out.print("ù��° �� :");
	Num1 = Integer.parseInt(br.readLine());
	System.out.print("�ι�° �� :");
	Num2 = Integer.parseInt(br.readLine());
	System.out.print("������ �Է��ϼ���:");
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
		System.out.println("���� �����Դϴ�.");
	}
	System.out.printf("%d %c %d = %d \n",Num1,Math,Num2,result);
	
}

}
