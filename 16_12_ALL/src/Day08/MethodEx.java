package Day08;

public class MethodEx extends Method{
	//���� ���̵�
	@Override
		public int sub(int i, int j) {
			// TODO Auto-generated method stub
			return super.sub(i, j);
		}
	@Override
	public int sum(int i, int j, int k) {
		// TODO Auto-generated method stub
		return super.sum(i, j, k);
	}
	
public static void main(String[] args) {
	
	Method m = new Method();
	int i = 10;
	int j= 20;
	
	int result = m.sum(i, j);
	int result2 = m.sub(i, j);
	int result3 = m.sum(i, j, i);
	System.out.println("�������:"+result);
	System.out.println("�������:"+result2);
	System.out.println("�������:"+result3);

	// �������̵� 
	
	Method M1 = new Method();
	System.out.println(M1.sum(i, j, i));
	
	
}
}
