package Day10;

abstract class AbsEx1{
	int a =100;
	final String str = "���� �߻� Ŭ���� ���ȭ�� ������";
	public String getStr()
	{
		return str;
	}
	abstract public int getA();
}

abstract class AbsEx2 extends AbsEx1{
	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return a;
	}
	public abstract String getStr();
}

public class AbsEx extends AbsEx2{

	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		//absEx2�� �߻� �޼ҵ� ������
		return str; //str�� absEx1�� ��������̴�.    
	}
public static void main(String[] args) {
	

	// TODO Auto-generated method stub
		AbsEx ae = new AbsEx();
		System.out.println(ae.getA());
		System.out.println(ae.getStr());
		
}

}
