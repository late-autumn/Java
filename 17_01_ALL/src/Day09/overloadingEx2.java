package Day09;

public class overloadingEx2 {

	
	public overloadingEx2() {
		// TODO Auto-generated constructor stub
	}
	public void getLength(int n)
	{
		String s = String.valueOf(n);
		getLength(s);
		//System.out.println("길이는:"+s);
	}
	void getLength(float n)
	{
		String s = String.valueOf(n);
		getLength(s);
	}
	private int getLength(String str)
	{
		System.out.println("입력한 값의 길이:"+str.length());
		return 0;
	}
	public static void main(String[] args) {
	
		overloadingEx2 oe = new overloadingEx2();
		oe.getLength(100);
		oe.getLength(3.14f);
		oe.getLength("gg");
		
	
	
}
}
