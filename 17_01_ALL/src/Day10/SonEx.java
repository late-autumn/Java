package Day10;

//���������� �޼ҵ�� �ڽ�, ��������� �θ��� ���� ����Ѵ�.
class ParentEx{ //�θ� Ŭ����
	
	int foo = 5;
	
	public int getNumber(int a){
		return a+1;
	}
}

public class SonEx extends ParentEx{
	int foo = 7;
	
	@Override
	public int getNumber(int a) {
		// TODO Auto-generated method stub
		return a+2;
	}
	
	
public static void main(String[] args) {
	
	ParentEx pe = new SonEx();
	System.out.println(pe.getNumber(0));  //�޼ҵ�� �ڽĲ� ��������� �θ� ����Ѵ�. �̰��� �������� Ư¡ 
	System.out.println(pe.foo);
}
}
