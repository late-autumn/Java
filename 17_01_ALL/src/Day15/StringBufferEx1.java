package Day15;

public class StringBufferEx1 {
public static void main(String[] args) {
	
	StringBuffer sb = new StringBuffer("JAVA");
	sb.append("1.6");
	System.out.println(sb);
	sb.delete(3, 5); 		//delete�� ��ŸƮ �ε������� end�ε���-1 ������. 
	System.out.println(sb);
	sb.insert(3, "�ȳ�");		//insert�� ��ŸƮ �ε������ٰ� ���� �ִ´�.
	System.out.println(sb);
	sb.replace(1, 5, "��");
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);
	
	
	String s = "     java java java     ";	//trim�� �յ� ���� ���� ���ִ� ��� 
	String v;
	v = s.trim();
	System.out.println("trim:" + v);
	
	

	
	
}
}
