package Day10;

//다형성에서 메소드는 자식, 멤버변수는 부모의 것을 사용한다.
class ParentEx{ //부모 클래스
	
	int foo = 5;
	
	public int getNumber(int a){
		return a+1;
	}
}

public class SonEx extends ParentEx{
	int foo = 7;
	
	@Override
	public int getNumber(int a) {
		// TODO Auto-generated method stub
		return a+2;
	}
	
	
public static void main(String[] args) {
	
	ParentEx pe = new SonEx();
	System.out.println(pe.getNumber(0));  //메소드는 자식꺼 멤버변수는 부모꺼 출력한다. 이것이 다형성의 특징 
	System.out.println(pe.foo);
}
}
