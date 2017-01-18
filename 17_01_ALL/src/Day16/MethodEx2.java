package Day16;

public class MethodEx2 {
	//전역 변수, 인스턴스 변수
	int a;

	//사용하는 과정에서 초기화를 하지 않을 경우 int형을 기준으로 자동으로 0을초기화함
	public static void main(String[] args) {
		MethodEx2 ex2 = new MethodEx2();
		//객체생성
		System.out.println(ex2.a);
	}
}
