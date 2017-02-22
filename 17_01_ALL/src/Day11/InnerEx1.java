package Day11;

class OuterEx{ //외부
	
	class InnerEx{ //내부
		int x = 5;
	}
	
}

public class InnerEx1 {
public static void main(String[] args) {
	//객체를 생성할땐 외부 클래스부터 생성해야한다.
	OuterEx eo = new OuterEx();
	//외부 객체를 통해서 내부 클래스의 객체를 생성한다.
	OuterEx.InnerEx ei = eo.new InnerEx();
	System.out.println(ei.x);

 }
}
