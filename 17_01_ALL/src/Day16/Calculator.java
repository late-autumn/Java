package Day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

	int input_num;
	int sum = 0;

	void menu() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("�Է� �Ͻ� ������ �Է��ϼ���:");
			input_num = Integer.parseInt(br.readLine());
			if (input_num < 1 || input_num > 1000) {
				menu();
			} else {
				calcu();
			}
		} catch (IOException e) {
			e.getMessage();
		}
	}

	void calcu() {
		for (int i = 1; i <= input_num; i++) {
			sum += i;
		}
		System.out.println("�Է��Ͻ� ���� :" + input_num + "�̸�, �� ����:" + sum + "�Դϴ�.");
	}

}
