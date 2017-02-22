package Day10;

interface Inter1{
	
	public int getA();
	
}
interface Inter2 {
	
	public int getA();
}
interface Inter3 extends Inter1,Inter2{
	
	public int getData();
}


public class InterfaceEx2 implements Inter3{
	
	int a = 100;
	
	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return a;
	}
	@Override
	public int getData() {
		// TODO Auto-generated method stub
		return a+10;
	}
	
public static void main(String[] args) {
	
	InterfaceEx2 ex = new InterfaceEx2();
	
	Inter1 it1 = new InterfaceEx2();
	Inter2 it2 = ex;  //new InterfaceEx2()나 ex나 이렇게 해도 상관 없다.
	Inter3 it3 = ex;
	
	System.out.println(it1.getA());
	System.out.println(it2.getA());
	System.out.println(it3.getData());
	
}
}
