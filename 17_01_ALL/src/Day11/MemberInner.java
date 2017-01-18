package Day11;

public class MemberInner {

	int a = 10;
	private int b = 100;
	static int c = 200;
	class Inner{ // 내부 클래스 
		
		public void Data(){
			System.out.println(a);//클래스 멤버변수
			System.out.println(b);//private 인데도 내부 클래스라서 접근하는데 허용한다.
			System.out.println(c);//static
		}
	}
	
	public static void main(String[] args) {
		
		MemberInner io = new MemberInner();
		MemberInner.Inner eo = io.new Inner();
		eo.Data();
		
	}
}
