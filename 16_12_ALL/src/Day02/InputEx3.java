package Day02;
//���ڿ� �Է¹ޱ�

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class InputEx3 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		String name;
		String age;
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		//�� �ٸ� �Է¹� ��ĳ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� �Է�:");
		name = br.readLine();
		System.out.print("���� �Է� :");
		age = br.readLine();
		
		System.out.println("�̸��� "+name+"�Դϴ�. ���̴� "+age+"�� �Դϴ�.");
	
	}

}
