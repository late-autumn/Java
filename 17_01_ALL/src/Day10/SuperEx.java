package Day10;

class Super {

	int a = 5;
	public Super(int x) {
		// TODO Auto-generated constructor stub
		System.out.println("�⺻ ������ ����"+x);
	}
	
}
class Sub extends Super{
	
	int a =10;
	public Sub() {
		// TODO Auto-generated constructor stub
		super(5);
		System.out.println("���� ������ ����");
	}
	public void test()
	{										//��½� ���� �ٸ����� �������� �����ص���.
		System.out.println(this.a);  	//10   
		System.out.println(super.a);	// 5 
	}
	
}
public class SuperEx{
		public static void main(String[] args) {
		
		Sub s = new Sub();
		s.test();
	}
}
