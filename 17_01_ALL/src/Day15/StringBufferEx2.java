package Day15;

public class StringBufferEx2 {
public static void main(String[] args) {
	
	StringBuffer sb2= new StringBuffer("1234567890");
	//sb.capacity();//�뷮�� 
	StringBuffer sb= new StringBuffer("1234");
	
	System.out.println(sb.capacity()); // 1�� �ƴ� 17�� ������ ���� ��ü�� 16�� �����ֱ� �����̴�.
	System.out.println(sb.length());
	
	sb.append("12345678910111200011"); //�޸𸮴� ������ �տ� ���� *2 +2 �� �����ȴ�. 
	System.out.println(sb.capacity()); 

	sb.append("����������������������������������������������"); //17ĭ �ε��� ���� 
	System.out.println(sb.capacity()); 
}
}
