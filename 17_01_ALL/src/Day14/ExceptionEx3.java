package Day14;

public class ExceptionEx3 {
public static void main(String[] args) {
	
	
	try {
		throw new Exception();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
}
}
