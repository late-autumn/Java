package Day09;

class Static
{
	int x;
	static int y;
	static final int z = 10;
	
}

public class StaticEx {
public static void main(String[] args) {
	System.out.println(Static.y);
	//x�� ��ü�� ������ ��� ������ �����ϴ�.
	Static st = new Static();
	st.x = 10; 
	//Static.x = 10; �̰� static�� ����
	Static.y = 20;
	//Static.z = 0; ���� �Ұ��� 
	System.out.println(Static.y);
	System.out.println(Static.z);
	
	
}
}
