package Day02;

public class PrintEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a =100;
		char b = 'A';
		float c = 12.346f;
		String d = "ȫ�浿";
		
		System.out.printf("%d \n",a);					//  %c, %d, %f, %s 
		System.out.printf("%c \n",b);					//  char, int, float, String
		System.out.printf("%f \n", c);					
		System.out.printf("%s", d);
		System.out.printf("%n");						// %n �� ��ĭ ���� 
		System.out.printf("b = %c %d�Դϴ�.", b,(int)b);
		System.out.println();
		System.out.printf("c = %6.3f", c);				// .�ڿ� ���ڿ� ���� ��Ÿ���� �Ҽ��� ����� �޶�����.

	}

}
