package Day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Test01 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Num1, Num2,Result;
		char Math;

		System.out.print("ù��° ���� :");
		Num1 = sc.nextInt();
		// Num1 = Integer.parseInt(br.readLine());
		System.out.print("�ι�° ���� :");
		Num2 = sc.nextInt();
		System.out.print("������ �Է�:[+ - * /]");
		Math = (char) br.read();

		if (Math == '+') {
			System.out.printf("%d %c %d = %d\n", Num1,Math, Num2, Num1 + Num2);
			//Result = Num1+Num2;
		} 
		else if (Math == '-') {
			System.out.printf("%d %c %d = %d\n", Num1,Math, Num2, Num1 - Num2);
			//Result = Num1-Num2;
		} 
		else if (Math == '*') {
			System.out.printf("%d %c %d = %d\n", Num1,Math, Num2, Num1 * Num2);
			//Result = Num1 * Num2;
		} 
		else if (Math == '/') {
			System.out.printf("%d %c %d = %d\n", Num1,Math, Num2, Num1 / Num2);
			//Result = Num1 / Num2;
		} 
		else {
			System.out.println("�߸��� �����Դϴ�.");
		}
	}
}
