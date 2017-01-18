package Day09;

public class MethodEx2 {
	
	//클래스 멤버 변수 = 전역 변수
	int var1, var2;  		
	
	public MethodEx2() { 		//생성자 생성. ctrl + space
		// TODO Auto-generated constructor stub
		var1 = 10;
		var2 = 20;
	}
	
	public int sum(int a, int b)//메소드의 멤버변수 = 지역변수 
	{
		return a+b;				
	}
	
	public static void main(String[] args) {

		MethodEx2 ab = new MethodEx2();
		System.out.println(ab.sum(1, 2));
		System.out.println(ab.sum(ab.var1, ab.var2));
	
	
	
}
}
