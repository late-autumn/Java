package Day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char Input;
		System.out.print("���ĺ��� �Է��ϼ���:");
		Input = (char) br.read();


		if ((Input >= 'a' && Input <= 'z') || (Input >= 'A' && Input <= 'Z')) {
			if (Input == 'a' || Input == 'e' || Input == 'o' || Input == 'i' || Input == 'u'||
				Input == 'A' || Input == 'E' || Input == 'O' || Input == 'I' || Input == 'U')
				{
				System.out.printf("�Է��Ͻ� ���ĺ��� = %c �Դϴ�\n", Input);
			}
			else {
				System.out.println("�Է��Ͻ� ���ĺ��� ������ �ƴմϴ�.");
			}
		}
		else{
			System.out.println("�Է��Ͻ� ���ڴ� Ʋ�Ƚ��ϴ�.");
		}

	}
}
