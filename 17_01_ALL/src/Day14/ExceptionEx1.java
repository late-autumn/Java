package Day14;

/*���� ���� ������ 0���� ���� ��� ���� �� �ִ� ����ó��
 * 
 */

public class ExceptionEx1 {
public static void main(String[] args) {
	
	//���� ����κ�
	int num = 50,sum =0;
	
	//���� �� ó�� �κ�

	for(int i=0;i<10;i++)
	{
		try{
		sum+=num/(int)(Math.random()*5); 

		System.out.println(sum);
		}catch(ArithmeticException e){ //�� ó��������Ѵ�.
			//e.printStackTrace();
			//e.getMessage();
			System.out.println(e.getMessage());
		}
	}
	
}
}
