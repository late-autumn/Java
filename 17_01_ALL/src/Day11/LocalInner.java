package Day11;

public class LocalInner {

	int a = 10;//��� ����
	
	public void Inner(int k){
		int b = 200; //���� ����
		final int c = k; // ���ȭ ��Ų��.
	class InnerExa{
			//���� Ŭ���� �޼ҵ�ȿ� ���������.
			//���� Ŭ������ �ܺ� Ŭ������ ��������� ����鸸 ������ �����ϴ�
		int d = 400;
			public void getData(){
				System.out.println("a="+a);
				System.out.println("b="+b);
				System.out.println("c="+c);
				System.out.println("d="+d);
			}
			
		}
		//�޼ҵ� ������ �̳�Ŭ������ ��ü ����
	InnerExa i = new InnerExa();
	i.getData();// ��ü�� �����ؼ� �޼ҵ带 ȣ��
	}//end method 
	
	public static void main(String[] args) {
		LocalInner lo = new LocalInner();
		lo.Inner(1000);
	}
}
