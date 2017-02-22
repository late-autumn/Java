package Day14;

public class ExceptionEx4 {
public static void main(String[] args) {
	
	System.out.println(1);
	System.out.println(2);
	try {
		System.out.println(3);
		System.out.println(0/0);
	} catch (ArithmeticException ae) {	//하위 예외처리부터 해줘야 오류발생하지 않는다. 
		// TODO: handle exception
		if(ae instanceof Exception)
		System.out.println(true);
		System.out.println("계산착오 알고리즘");
	}
	catch(Exception e){
		System.out.println("예외발생");
	}
	
	System.out.println("끝");
}
}
