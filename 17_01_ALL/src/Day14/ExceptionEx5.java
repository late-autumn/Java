package Day14;

public class ExceptionEx5 {

	int []ss;
	public ExceptionEx5(){
		
		ss = new int[3];
		//멤버필드 초기화 
		
	}
	public void program()
	{
		for(int i=0; i<=ss.length;i++)
		{		//ss[0] ss[1] ss[2]
			System.out.println("for문의시작"+i+"번째");
			try {
				System.out.println(ss[i]);
			} catch (Exception e) {
				System.out.println("예외처리발생"+e);
				return;
			}finally{
				System.out.println("무조건 수행하는곳");
			}
			System.out.println("for문의 끝"+i+"번째");
		}

	}
	
	
	public static void main(String[] args)throws Exception {
		ExceptionEx5 ex = new ExceptionEx5();
		ex. program();
		System.out.println("끝");
}
}
