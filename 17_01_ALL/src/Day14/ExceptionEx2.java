package Day14;

public class ExceptionEx2 {
public static void main(String[] args) {
	
	System.out.println(1);
	System.out.println(2);
	try {
		System.out.println(3);
		System.out.println(0/0);
		System.out.println(4); //위에서 exception 발생하기대문에 수행하지 않는다.
	} catch (Exception e) {
		System.out.println(5);
		// TODO: handle exception
	}finally{
		System.out.println("무조건 출력 부분");
	}
	System.out.println(6);
}
}
