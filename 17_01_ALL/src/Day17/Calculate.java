package Day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculate {
	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int input1, input2;
	char input4;
	int result = 0;

	public void input(){
		try{

		System.out.println("ù��° ������ �Է��ϼ��� :");
		input1 = sc.nextInt();
		System.out.println("�ι�° ������ �Է��ϼ��� :");
		input2 = sc.nextInt();
		System.out.println("���ϴ� ��Ģ ������ �����ּ���: [+]  [-]  [*]  [/]  [0] ����");
		input4 = (char)br.read();
		cal();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	public void cal() {

		switch (input4) {
		case '+':
			result = input1 + input2;
			print();
			break;
		case '-':
			result = input1 - input2;
			print();
			break;
		case '*':
			result = input1 * input2;
			print();
			break;
		case '/':
			result = input1 / input2;
			print();
			break;
		case 0:
			System.out.println("�ý����� �����մϴ�.");
			System.exit(0);
			break;
		}


	}

	public void print() {
		System.out.println("����� :" + result + "�Դϴ�");
	}

}
