package Day09;

public class OverloadingEx1 {

		public void intLength(int a)
		{
			String s = String.valueOf(a);
			System.out.println("입력한 값의 길이 "+s.length());
		}
		public void intLength(float f)
		{
			String s = String.valueOf(f);
			System.out.println("입력한 값의 길이 "+s.length());
		}
		public void intLength(String str)
		{
			String s = String.valueOf(str);
			System.out.println("입력한 값의 길이 "+s.length());	
		}
		public static void main(String[] args) {
			
			OverloadingEx1 ex = new OverloadingEx1();
			ex.intLength(1000);
			ex.intLength(3.14f);
			ex.intLength("10000");
			
		}
}
