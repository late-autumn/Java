package Day15;

public class StringBufferEx1 {
public static void main(String[] args) {
	
	StringBuffer sb = new StringBuffer("JAVA");
	sb.append("1.6");
	System.out.println(sb);
	sb.delete(3, 5); 		//delete는 스타트 인덱스에서 end인덱스-1 까지다. 
	System.out.println(sb);
	sb.insert(3, "안녕");		//insert는 스타트 인덱스에다가 값을 넣는다.
	System.out.println(sb);
	sb.replace(1, 5, "ㅗ");
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);
	
	
	String s = "     java java java     ";	//trim은 앞뒤 공백 제거 해주는 기능 
	String v;
	v = s.trim();
	System.out.println("trim:" + v);
	
	

	
	
}
}
