package Day03;
/*
���� 1)
����ڷκ��� ������ ������ �Է¹޾� ��Ģ���� �� ������ ������ ���ϴ� ���α׷��� �����Ͻÿ�

���࿹) 
   ù��° ���� : 10
   �ι�° ���� : 20

  ���� ���
    10 + 2 = 12
    10 - 2 = 10
    10 * 2 = 20
    10 / 2 = 5
 */
import java.util.Scanner;
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int Temp1, Temp2;

		System.out.print("ù��° ����:");
		Temp1 = sc.nextInt();
		
		System.out.print("�ι�° ����:");
		Temp2 = sc.nextInt();
		System.out.println();
		System.out.println();
		System.out.printf("%d + %d = %d \n", Temp1,Temp2,(Temp1+Temp2));
		System.out.printf("%d - %d = %d \n", Temp1,Temp2,(Temp1-Temp2));
		System.out.printf("%d * %d = %d \n", Temp1,Temp2,(Temp1*Temp2));
		System.out.printf("%d / %d = %d \n", Temp1,Temp2,(Temp1/Temp2));
		System.out.printf("%d %% %d = %d \n",Temp1,Temp2,(Temp1%Temp2));

	}

}
