package Day11;

class OuterEx{ //�ܺ�
	
	class InnerEx{ //����
		int x = 5;
	}
	
}

public class InnerEx1 {
public static void main(String[] args) {
	//��ü�� �����Ҷ� �ܺ� Ŭ�������� �����ؾ��Ѵ�.
	OuterEx eo = new OuterEx();
	//�ܺ� ��ü�� ���ؼ� ���� Ŭ������ ��ü�� �����Ѵ�.
	OuterEx.InnerEx ei = eo.new InnerEx();
	System.out.println(ei.x);

 }
}
