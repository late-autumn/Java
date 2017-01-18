package Day10;

class AClass{
	
}
interface CInter{
	
}
class BClass extends AClass implements CInter{
	
	
}

public class AbcdEx {
public static void main(String[] args) {
	
	BClass bp = new BClass();
	Object obj = new Object();
	//°´Ã¼ »ý¼º

	System.out.println(bp instanceof Object);
	System.out.println(bp instanceof AClass);
	System.out.println(bp instanceof BClass);
	System.out.println(bp instanceof CInter);
}
}
