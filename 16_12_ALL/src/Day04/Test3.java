package Day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char Input;
		System.out.print("알파벳을 입력하세요:");
		Input = (char) br.read();


		if ((Input >= 'a' && Input <= 'z') || (Input >= 'A' && Input <= 'Z')) {
			if (Input == 'a' || Input == 'e' || Input == 'o' || Input == 'i' || Input == 'u'||
				Input == 'A' || Input == 'E' || Input == 'O' || Input == 'I' || Input == 'U')
				{
				System.out.printf("입력하신 알파벳은 = %c 입니다\n", Input);
			}
			else {
				System.out.println("입력하신 알파벳은 모음이 아닙니다.");
			}
		}
		else{
			System.out.println("입력하신 문자는 틀렸습니다.");
		}

	}
}
