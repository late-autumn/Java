package Day14;

public class StringEx1 {
public static void main(String[] args) {
	
	//�Ͻ��� ����
	String s1 = "Twnkle";
	String s2 = "Twnkle";
	System.out.println(s1.toString());
	System.out.println(s2.toString());
	if(s1==s2)
		System.out.println("S1�� S2 ����.");
	else
		System.out.println("S1�� S2�� ���� �ʴ�.");
	//����� ����
	String s3 = new String("Little");
	String s4 = new String("Little");
	if(s3==s4)
		System.out.println("S3�� S4 ����.");
	else
		System.out.println("S3�� S4�� ���� �ʴ�.");
	
	System.out.println(s3.equals(s4));
	
}
	
	
}
