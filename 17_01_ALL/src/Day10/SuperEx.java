package Day10;

class Super {

	int a = 5;
	public Super(int x) {
		// TODO Auto-generated constructor stub
		System.out.println("기본 생성자 생성"+x);
	}
	
}
class Sub extends Super{
	
	int a =10;
	public Sub() {
		// TODO Auto-generated constructor stub
		super(5);
		System.out.println("하위 생성자 생성");
	}
	public void test()
	{										//출력시 값이 다른것을 차이점을 구분해두자.
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
