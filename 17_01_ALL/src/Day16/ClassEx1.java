package Day16;

import java.util.Scanner;

//Ŭ������ �ν��Ͻ�

//�簢�� Ŭ���� ����
/*
 * �簢���� ���̿� �ѷ� ��� Ŭ������ ǥ��
 * Ŭ���� : �簢��
 * Ŭ������ �Ӽ� : ����, ����, (����, �ѷ�, ����, ����, ����...)
 * Ŭ������ ��� : ���� ��� , �ѷ����, ����/�����Է� ��� ���
 * 
 * ��ü�� ���� : ������(�Ӽ�,����)+���(����)
 * Ŭ������ ���� : ����ʵ�(����) + �޼ҵ�
 * 
 */

public class ClassEx1 {
	Scanner sc = new Scanner(System.in);

	int x,y , input;
	

	void menu()
	{
		do{
		System.out.println("���� ���� �Է��ϼ��� :");
		x = sc.nextInt();
		System.out.println("���� ���� �Է��ϼ���:");
		y = sc.nextInt();
		System.out.println("���Ͻô� ��� ������ �Է��ϼ���: [1] ���̰�� [2] �ѷ���� [3]����/���� �Է� ��� ���");
		input = sc.nextInt();
		switch(input)
		{
		case 1:
			cal(x,y);
			break;
		case 2:
			cal2(x,y);
			break;
		case 3:
			System.out.println("����/���� �Է� ����Դϴ�."+x+","+y);
			
			break;
			
		}
		}while(true);
		
	}
	void cal(int a, int b)
	{
		int sum = a*b;
		System.out.println("���� ="+sum);
	}
	void cal2(int a, int b)
	{
		int sum = (a+b)*2;
		System.out.println("�ѷ� ="+sum);
	}
	
	
	
	public static void main(String[] args) {
		ClassEx1 ex = new ClassEx1();
		ex.menu();
		
		
	}

}
