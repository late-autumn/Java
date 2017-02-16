package Day03;

//쉬프트 연산자

public class OperEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		int a = -3;
		int b,c;
					  // >> : >>> 기본적인것은 같다. 
		b = a>>3;    //  3비트씩 이동하지만 앞에 부호가 음수일경우 1, 양수일 경우엔 0이 온다.
		c = a>>>3;   //  3비트씩 이동하지만 음수일경우에도 무조건 다 0이 앞으로 온다.
		System.out.println(b);
		System.out.println(c);
		
	}

}
