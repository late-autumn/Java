package Day14;

public class StringEx1 {
public static void main(String[] args) {
	
	//암시적 생성
	String s1 = "Twnkle";
	String s2 = "Twnkle";
	System.out.println(s1.toString());
	System.out.println(s2.toString());
	if(s1==s2)
		System.out.println("S1과 S2 같다.");
	else
		System.out.println("S1과 S2는 같지 않다.");
	//명시적 생성
	String s3 = new String("Little");
	String s4 = new String("Little");
	if(s3==s4)
		System.out.println("S3과 S4 같다.");
	else
		System.out.println("S3과 S4는 같지 않다.");
	
	System.out.println(s3.equals(s4));
	
}
	
	
}
