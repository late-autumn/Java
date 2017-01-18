package Day16;

//메소드 호출
public class MethodEx3 {
	
	public static int a(int b){
		return b;
	}
	
	public static void showHi(){
		
		System.out.println("안녕하세요 ㅎㅎ");
	}
	
	
	public static void main(String[] args) {
		
		MethodEx3 ex3 = new MethodEx3();
	
		int c = a(10); // 오류나는 이유 = 돌려받을ㅈ ㅏ료형이 없기때문
		ex3.showHi();
	}
}
