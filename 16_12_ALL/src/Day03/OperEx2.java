package Day03;


public class OperEx2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		short a,b;
		a = b = 10;							// a,b 둘다 10으로 대입한다는 의미
		//short c = a+b; 					범위가 넘어가기 때문에 short를 사용할 수 없다. int로 변환해야한다.
		int c = a + b;
		System.out.println("c:"+c);
		
		/*
		 * byte, short, char, int 자료형 사이의 연산자에서는 결과가 int이다.
		 * 
		 */
		
	}

}
