package Day02;

public class CharEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch1 = 'A', ch2 = '\u0041';
		String str = "hello", str2 = " world";

		int temp, sum, result =0;
		int B = 8;
		System.out.printf("B�� 10�����δ� %d \n", B);
		for (int i = 1; B> 0; i *= 10) 
		   { 
		      temp = B % 2; 
		      sum = temp * i; 
		      result = result + sum; 
		      B /= 2; 
		   } 
		System.out.printf("B�� 2�����δ� %d\n", result);
		System.out.printf("A �� %c \n",ch1);
		System.out.printf("10�����δ� %d \n",(int)ch1);
		System.out.printf("8�����δ� : %o \n",(int)ch1);
		System.out.printf("16�����δ� : %x \n",(int)ch1);

		System.out.println("ch1+2�� �����ڵ� ���� : "+(ch1+ch2));  	//����� ������ ��� ���ڷ� ������
		System.out.println("ch1+2�� �ƽ�Ű�ڵ� ���� : "+(char)(ch1+ch2));
		System.out.println("str+str2�� ���ڴ� :"+(str+str2));
		
		String s = "1000";                     

	    int id = Integer.parseInt(s);      
	    System.out.println(id);
	    float f = Float.parseFloat(s);
	    System.out.println(f);

	     
	    
	    
	}

}
