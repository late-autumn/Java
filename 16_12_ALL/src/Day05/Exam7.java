package Day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam7 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		while(true)
		{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float a1, a2, total = 0;
		char math , end;
		
		System.out.println("ù��° �� =");
		a1 = Integer.parseInt(br.readLine());
		System.out.println("������(+,-,*,/,%)");
		math = (char)System.in.read();
		System.in.read();
		System.in.read();
		System.out.println("�ι�° �� =");
		a2 = Integer.parseInt(br.readLine());

		switch(math)
		{
		case '+':
			total = a1+a2;
			break;
		case '-':
			total = a1-a2;
			break;
		case '*':
			total = a1*a2;
			break;
		case '/':
			total = a1/a2;
			break;
		case '%':
			total = a1%a2;
			break;
		}
		System.out.println();
		System.out.printf("����� %.2f \n", total);
		System.out.println("��� �Ͻðڽ��ϱ�?(y/n)");
		end = (char)System.in.read();
		System.in.read();
		System.in.read();
		if (end != 'y' || end != 'Y')
		{
		  break;
		}
		}
	}

}
