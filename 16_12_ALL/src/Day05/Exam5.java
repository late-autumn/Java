package Day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam5 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.out.println("�ֹι�ȣ 8��° �ڸ��� �Է��ϼ���:");
		int a = Integer.parseInt(br.readLine());
		switch(a)
		{
		case 0:
			System.out.println("����� ���� �ֹ��̱���");
			break;
		case 1:
			System.out.println("����� ���,��õ �ֹ��̱��� ");
			break;
		case 2:
			System.out.println("����� ������ �ֹ��̱���");
			break;
		case 3:
			System.out.println("����� ��û�ϵ� �ֹ��̱���");
			break;
		case 4:
			System.out.println("����� ��û���� �ֹ��̱���");
			break;
		case 5:
			System.out.println("����� ����ϵ� �ֹ��̱���");
			break;
		case 6:
			System.out.println("����� ���󳲵� �ֹ��̱���");
			break;
		case 7:
			System.out.println("����� ���ϵ� �ֹ��̱���");
			break;
		case 8:
			System.out.println("����� ��󳲵��� �ֹ��̱���");
			break;
		case 9:
			System.out.println("����� ���ֵ� �ֹ��̱���");
			break;
			default:
				System.out.println("1~9�� ��� ���� �Է��Ͽ����ϴ�.");
		}
	}

}
