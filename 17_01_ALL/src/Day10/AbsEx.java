package Day10;

abstract class AbsEx1{
	int a =100;
	final String str = "나는 추상 클래스 상수화된 변수다";
	public String getStr()
	{
		return str;
	}
	abstract public int getA();
}

abstract class AbsEx2 extends AbsEx1{
	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return a;
	}
	public abstract String getStr();
}

public class AbsEx extends AbsEx2{

	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		//absEx2의 추상 메소드 재정의
		return str; //str은 absEx1의 멤버변수이다.    
	}
public static void main(String[] args) {
	

	// TODO Auto-generated method stub
		AbsEx ae = new AbsEx();
		System.out.println(ae.getA());
		System.out.println(ae.getStr());
		
}

}
