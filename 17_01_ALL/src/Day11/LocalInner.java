package Day11;

public class LocalInner {

	int a = 10;//멤버 변수
	
	public void Inner(int k){
		int b = 200; //지역 변수
		final int c = k; // 상수화 시킨다.
	class InnerExa{
			//내부 클래스 메소드안에 만들어진다.
			//지역 클래스는 외부 클래스의 멤버변수와 상수들만 접근이 가능하다
		int d = 400;
			public void getData(){
				System.out.println("a="+a);
				System.out.println("b="+b);
				System.out.println("c="+c);
				System.out.println("d="+d);
			}
			
		}
		//메소드 내에서 이너클래스의 객체 생성
	InnerExa i = new InnerExa();
	i.getData();// 객체를 생성해서 메소드를 호출
	}//end method 
	
	public static void main(String[] args) {
		LocalInner lo = new LocalInner();
		lo.Inner(1000);
	}
}
