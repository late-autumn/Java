package Day02;

public class CharEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch1 = 'A', ch2 = '\u0041';
		String str = "hello", str2 = " world";

		int temp, sum, result =0;
		int B = 8;
		System.out.printf("B의 10진수로는 %d \n", B);
		for (int i = 1; B> 0; i *= 10) 
		   { 
		      temp = B % 2; 
		      sum = temp * i; 
		      result = result + sum; 
		      B /= 2; 
		   } 
		System.out.printf("B의 2진수로는 %d\n", result);
		System.out.printf("A 는 %c \n",ch1);
		System.out.printf("10진수로는 %d \n",(int)ch1);
		System.out.printf("8진수로는 : %o \n",(int)ch1);
		System.out.printf("16진수로는 : %x \n",(int)ch1);

		System.out.println("ch1+2의 유니코드 값은 : "+(ch1+ch2));  	//계산이 가능한 경우 숫자로 변경함
		System.out.println("ch1+2의 아스키코드 값은 : "+(char)(ch1+ch2));
		System.out.println("str+str2의 문자는 :"+(str+str2));
		
		String s = "1000";                     

	    int id = Integer.parseInt(s);      
	    System.out.println(id);
	    float f = Float.parseFloat(s);
	    System.out.println(f);

	     
	    
	    
	}

}
