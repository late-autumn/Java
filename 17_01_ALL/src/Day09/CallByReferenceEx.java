package Day09;

/* �ּҿ� ���� ȣ��(call by reference) = ���� ȣ��
 * 
 * �޼ҵ� ȣ��� �����Ϸ��� ���ڸ� ����(��ü) �ڷ����� ����� ��� �����
 * ���⿡���� �⺻�ڷ����� �ƴ� �Ϲ� ��ü �Ǵ� �迭�� ����
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

        System.out.println("------- swap �� -------");

        System.out.println("a => " + a.value);
        System.out.println("b => " + b.value);
		
		
	}
}
