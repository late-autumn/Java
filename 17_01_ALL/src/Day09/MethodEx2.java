package Day09;

public class MethodEx2 {
	
	//Ŭ���� ��� ���� = ���� ����
	int var1, var2;  		
	
	public MethodEx2() { 		//������ ����. ctrl + space
		// TODO Auto-generated constructor stub
		var1 = 10;
		var2 = 20;
	}
	
	public int sum(int a, int b)//�޼ҵ��� ������� = �������� 
	{
		return a+b;				
	}
	
	public static void main(String[] args) {

		MethodEx2 ab = new MethodEx2();
		System.out.println(ab.sum(1, 2));
		System.out.println(ab.sum(ab.var1, ab.var2));
	
	
	
}
}
