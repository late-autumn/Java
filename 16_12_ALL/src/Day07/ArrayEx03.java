package Day07;
import java.util.Scanner;
public class ArrayEx03 {
public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int input ;
	do{
		System.out.print("�޴��� �Է����ּ���:");
		System.out.print("�ݶ�-1, ���̴�-2, ����ƾ��-3, ���ڼ���-4, ���̽�-5, ���Ͻ�-6(0 ����)");
		input = sc.nextInt();
		
		switch(input)
		{
		case 0:
			System.exit(0);
			break;
		case 1:
			System.out.print("�ݶ�");
			break;
		case 2:
			System.out.print("���̴�");
			break;
		case 3:
			System.out.print("����ƾ��");
			break;
		case 4:
			System.out.print("���ڼ���");
			break;
		case 5:
			System.out.print("���̽�");
			break;
		case 6:
			System.out.print("���Ͻ�");
			break;
			default:
				System.out.print("�����Ͻ� ��ǰ�� �����ϴ�.");
		}
		System.out.println();
		
	}while(input!=0);
	
}
}
