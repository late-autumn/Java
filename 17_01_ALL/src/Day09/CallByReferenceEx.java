package Day09;

/* 주소에 의한 호출(call by reference) = 참조 호출
 * 
 * 메소드 호출시 전달하려는 인자를 참조(객체) 자료형을 사용할 경우 사용함
 * 여기에서는 기본자료형이 아닌 일반 객체 또는 배열이 속함
 *  
 */
public class CallByReferenceEx {
	int value;
	public void incre(int[] n)
	{
		for(int i=0; i<n.length;i++)
		{
			n[i]++;
		}
	}
	public CallByReferenceEx()
	{
		
	}
	public CallByReferenceEx(int value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}
	public static void swap(CallByReferenceEx a, CallByReferenceEx b)
	{
		int temp = a.value;
		a.value = b.value;
		b.value = temp;
	}
	
	
	
	public static void main(String[] args) {
	
		int ref[] = {100,80,90};
		CallByReferenceEx ce = new CallByReferenceEx();
		ce.incre(ref);
		for(int i=0; i<ref.length;i++)
		{
			System.out.println("ref["+i+"]: "+ref[i]);
		}
		
		CallByReferenceEx a = new CallByReferenceEx(1);
		CallByReferenceEx b = new CallByReferenceEx(2);

        System.out.println("a => " + a.value);
        System.out.println("b => " + b.value);

        swap(a, b);

        System.out.println("------- swap 후 -------");

        System.out.println("a => " + a.value);
        System.out.println("b => " + b.value);
		
		
	}
}
