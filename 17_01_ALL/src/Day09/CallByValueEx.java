package Day09;


/* 값에 의한 호출(call by value)
 * 
 * 메소드를 호출시 기본 자료형의 값을 인자값으로
 * 호출하는 방식을 의미함.
 */


public class CallByValueEx {

	int n1, n2;
	public int incre(int n)
	{
		n++;
		return n;
	}
	public void swap(CallByValueEx ex)
	{
		int temp;
		temp = ex.n1;
		ex.n1 = ex.n2;
		ex.n2 = temp;

	}
	
	
	public static void main(String[] args) {
		
		int var1 = 100;
		int var11 = 200;
		CallByValueEx ce = new CallByValueEx();
		
		int var2 = ce.incre(var1);
		
		System.out.println("var1 :"+var1+",var2 :"+var2);
		
		ce.swap(ce);
		System.out.println(var1+","+var11);
		
		
	}
	
}
