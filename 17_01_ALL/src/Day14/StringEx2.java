package Day14;

public class StringEx2 {
public static void main(String[] args) {
	
	String  str = new String();
	str+="hello";
	str+="java";
	
	System.out.println(str);
	
	String str1 = "ABCD";
	char ch = str1.charAt(0); //charAT(int)�� ���� ���ϴ� ��ġ ���ڸ� ����Ѵ�. 
	System.out.println(ch);
	
	String so = str1.toLowerCase(); // �ҹ��ڷ� ��ȯ�ϴ� �Լ� 
	String imsi = str1.substring(0,2); //0���� 2���� ��������� �ڿ� end�� -1 �� ������ؼ� �ΰ��� ��µȴ� �� 0,1 �� ��� 
	System.out.println(so);
	System.out.println(imsi);
}
}
