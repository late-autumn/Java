package Day09;
/*
 * JDK 5.0 �̻󿡼� ���Ӱ� ź���� ���
 * �̴� �޼ҵ� ���ǽ� ���ϵ� ������ �ڷ�����
 * '...'��� ����ϹǷ� �̸� ���� �޼ҵ带 �����ϴµ� 
 * �ʿ��� ������ ���� �����ϰ� ������ �� ����.
 * (���������� �迭ȭ �۾��� �ڵ����� ó������)
 * 
 */


public class VarEx {
	
	public void argTest(String ...n){
		for(int i=0; i<n.length;i++)
		{
			System.out.println(n[i]);
		}
		System.out.println();
	}
	
public static void main(String[] args) {
	VarEx v = new VarEx();
	v.argTest("Vareee","test");
	v.argTest("100","200","300");
}
}
