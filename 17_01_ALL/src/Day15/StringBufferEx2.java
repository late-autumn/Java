package Day15;

public class StringBufferEx2 {
public static void main(String[] args) {
	
	StringBuffer sb2= new StringBuffer("1234567890");
	//sb.capacity();//용량을 
	StringBuffer sb= new StringBuffer("1234");
	
	System.out.println(sb.capacity()); // 1이 아닌 17인 이유는 버퍼 자체로 16이 잡혀있기 때문이다.
	System.out.println(sb.length());
	
	sb.append("12345678910111200011"); //메모리는 무조건 앞에 버퍼 *2 +2 로 생성된다. 
	System.out.println(sb.capacity()); 

	sb.append("ㅁㅇㄴㄹㅁㄴㅇㄹㅁㄴㅇㄹㅇㄴㄹㄴㄴㅁㅇㄹㅇㄴㄹ"); //17칸 인덱스 증가 
	System.out.println(sb.capacity()); 
}
}
