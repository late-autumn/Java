package Day14;

public class ExceptionEx5 {

	int []ss;
	public ExceptionEx5(){
		
		ss = new int[3];
		//����ʵ� �ʱ�ȭ 
		
	}
	public void program()
	{
		for(int i=0; i<=ss.length;i++)
		{		//ss[0] ss[1] ss[2]
			System.out.println("for���ǽ���"+i+"��°");
			try {
				System.out.println(ss[i]);
			} catch (Exception e) {
				System.out.println("����ó���߻�"+e);
				return;
			}finally{
				System.out.println("������ �����ϴ°�");
			}
			System.out.println("for���� ��"+i+"��°");
		}

	}
	
	
	public static void main(String[] args)throws Exception {
		ExceptionEx5 ex = new ExceptionEx5();
		ex. program();
		System.out.println("��");
}
}
