package Day09;

class Static
{
	int x;
	static int y;
	static final int z = 10;
	
}

public class StaticEx {
public static void main(String[] args) {
	System.out.println(Static.y);
	//x는 객체를 생성해 줘야 접근이 가능하다.
	Static st = new Static();
	st.x = 10; 
	//Static.x = 10; 이건 static만 가능
	Static.y = 20;
	//Static.z = 0; 변경 불가능 
	System.out.println(Static.y);
	System.out.println(Static.z);
	
	
}
}
