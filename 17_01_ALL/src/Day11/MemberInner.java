package Day11;

public class MemberInner {

	int a = 10;
	private int b = 100;
	static int c = 200;
	class Inner{ // ���� Ŭ���� 
		
		public void Data(){
			System.out.println(a);//Ŭ���� �������
			System.out.println(b);//private �ε��� ���� Ŭ������ �����ϴµ� ����Ѵ�.
			System.out.println(c);//static
		}
	}
	
	public static void main(String[] args) {
		
		MemberInner io = new MemberInner();
		MemberInner.Inner eo = io.new Inner();
		eo.Data();
		
	}
}
