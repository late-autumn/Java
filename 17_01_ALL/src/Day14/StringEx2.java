package Day14;

public class StringEx2 {
public static void main(String[] args) {
	
	String  str = new String();
	str+="hello";
	str+="java";
	
	System.out.println(str);
	
	String str1 = "ABCD";
	char ch = str1.charAt(0); //charAT(int)에 따라 원하는 위치 문자를 출력한다. 
	System.out.println(ch);
	
	String so = str1.toLowerCase(); // 소문자로 변환하는 함수 
	String imsi = str1.substring(0,2); //0부터 2까지 출력이지만 뒤에 end는 -1 을 해줘야해서 두개만 출력된다 즉 0,1 만 출력 
	System.out.println(so);
	System.out.println(imsi);
}
}
