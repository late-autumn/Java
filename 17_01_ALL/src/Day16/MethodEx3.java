package Day16;

//�޼ҵ� ȣ��
public class MethodEx3 {
	
	public static int a(int b){
		return b;
	}
	
	public static void showHi(){
		
		System.out.println("�ȳ��ϼ��� ����");
	}
	
	
	public static void main(String[] args) {
		
		MethodEx3 ex3 = new MethodEx3();
	
		int c = a(10); // �������� ���� = ���������� �������� ���⶧��
		ex3.showHi();
	}
}
