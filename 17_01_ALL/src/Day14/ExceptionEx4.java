package Day14;

public class ExceptionEx4 {
public static void main(String[] args) {
	
	System.out.println(1);
	System.out.println(2);
	try {
		System.out.println(3);
		System.out.println(0/0);
	} catch (ArithmeticException ae) {	//���� ����ó������ ����� �����߻����� �ʴ´�. 
		// TODO: handle exception
		if(ae instanceof Exception)
		System.out.println(true);
		System.out.println("������� �˰���");
	}
	catch(Exception e){
		System.out.println("���ܹ߻�");
	}
	
	System.out.println("��");
}
}
