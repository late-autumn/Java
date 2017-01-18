package Day11;


abstract class Tt{
	int data = 1000;
	public abstract void printData();
}


public class AnonyInner {
	
	Tt t = new Tt(){
		@Override
		public void printData() {
			// TODO Auto-generated method stub
		System.out.println("data:"+data);	
		}
	};
	
public static void main(String[] args) {
	
	AnonyInner an = new AnonyInner();
	an.t.printData();
	
}
}
