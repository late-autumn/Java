package Day11;

public class StaticInner {

	int a = 10;
	private int b = 20;
	static int c= 200;
	
	static class Inner{        // 바로 여기곳에 
		static int d = 1000;  // static 을 빼면 오류가 난다. 어쩔  수 없이 붙여줘야한다. 
		
		public void printData()
		{
			//System.out.println("a:"+a);  //static이 아니기때문에 사용할 수가 없다.
			//System.out.println("b:"+b); 
			System.out.println("c:"+c);
			System.out.println("d:"+d);
		}
	}
/*	public class INN{
		static int df = 300;	//즉 이렇게 하면 오류가 난다. 둘중 하나다. static을 붙여주던지 변수에서 static을 빼던지	
	}*/							
	public static void main(String[] args) {
		
		StaticInner sc = new StaticInner();
		StaticInner.Inner in = new Inner();
		in.printData();
		
	}
}
