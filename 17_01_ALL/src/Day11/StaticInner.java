package Day11;

public class StaticInner {

	int a = 10;
	private int b = 20;
	static int c= 200;
	
	static class Inner{        // �ٷ� ������� 
		static int d = 1000;  // static �� ���� ������ ����. ��¿  �� ���� �ٿ�����Ѵ�. 
		
		public void printData()
		{
			//System.out.println("a:"+a);  //static�� �ƴϱ⶧���� ����� ���� ����.
			//System.out.println("b:"+b); 
			System.out.println("c:"+c);
			System.out.println("d:"+d);
		}
	}
/*	public class INN{
		static int df = 300;	//�� �̷��� �ϸ� ������ ����. ���� �ϳ���. static�� �ٿ��ִ��� �������� static�� ������	
	}*/							
	public static void main(String[] args) {
		
		StaticInner sc = new StaticInner();
		StaticInner.Inner in = new Inner();
		in.printData();
		
	}
}
