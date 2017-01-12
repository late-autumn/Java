package Day16;
import java.util.*;
public class HashMapEx {
private static final String[] name = {
		"홍길동","이순신","김유신","강감찬","손오공","사오정"};

	//키 : 동일한 값이 존재 할 수 없다.(만약 동일한 키가 존재할 경우 마지막 데이터가 저장됨)널이 될 수 없다.
	private static final String[] tel = {"111-111","222-2222","233-3333",
			"111-111","222-2222","555-5555"};
	//값 : 동일한 값이 존재해도 가능하다. why : key값에 의해 데이터값을 불러오기 때문
	

public static void main(String[] args) {
	
	Hashtable<String, String>ht = new Hashtable<>();
	//해쉬테이블에 키, 값 입력 put(k,v)
	for(int i=0;i<name.length;i++)
		ht.put(name[i], tel[i]);
	
	//해쉬테이블 값을 키를 이용하여 검색함
	
	String str = ht.get("홍길동");
	if(str!=null)
	System.out.println("홍길동의 전화번호:"+str);
	//키가 존재하는 검색
	if(ht.containsKey("임꺽정")){
		System.out.println("임꺽정의 데이터가 존재합니다.");
	}
	else 
		System.out.println("임꺽정의 데이터가 존재하지 않습니다.");
	
	if(ht.containsKey("666-666"))
	{
		System.out.println("존재합니다");
	}
	else
		System.out.println("존재안하는 번호");
	
	//키 값 삭제
	ht.remove("사오정");
	if(ht.containsKey("사오정"))
		System.out.println("존재함");
	else
		System.out.println("사오정 지워짐");
	

}
}
