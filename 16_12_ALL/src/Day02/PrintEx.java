package Day02;

public class PrintEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a =100;
		char b = 'A';
		float c = 12.346f;
		String d = "홍길동";
		
		System.out.printf("%d \n",a);					//  %c, %d, %f, %s 
		System.out.printf("%c \n",b);					//  char, int, float, String
		System.out.printf("%f \n", c);					
		System.out.printf("%s", d);
		System.out.printf("%n");						// %n 은 한칸 띄우기 
		System.out.printf("b = %c %d입니다.", b,(int)b);
		System.out.println();
		System.out.printf("c = %6.3f", c);				// .뒤에 숫자에 따라 나타나는 소수점 출력이 달라진다.

	}

}
