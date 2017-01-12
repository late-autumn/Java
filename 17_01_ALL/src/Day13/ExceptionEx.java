package Day13;

public class ExceptionEx {
public static void main(String[] args) {
	
	try{
	int i =0;
	int s= 0;
	s = i/0;	//알고리즘에대한 Exception 발생한다.
	System.out.println(s);
	} catch (ArithmeticException e) {
		e.printStackTrace();
	}
	
}
}
