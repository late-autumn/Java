package Day02;

import java.io.IOException;

public class Exam2 {
	public static void main(String[] args)throws IOException {
		
		System.out.println("��� �����ڸ� �Է��ϼ���('+','-','*','/','%'):");
		char Input = (char)System.in.read();
		System.out.println(Input =='+' || Input == '-' || Input == '*' || Input == '/' || Input =='%' ?
				"'"+Input+"'�� ��� �������Դϴ�." : "'" +Input+"'�� ��� �����ڰ� �ƴմϴ�");
	}
}
