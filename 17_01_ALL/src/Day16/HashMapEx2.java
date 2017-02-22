package Day16;
import java.util.*;
public class HashMapEx2 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("홍길동", new Integer(30));
		map.put("강감찬", new Integer(50));
		map.put("이순신", new Integer(47));
		map.put("김유신", new Integer(97));
		map.put("장보고", new Integer(84)); 
		map.put("손오공", new Integer(100));
		
		/*키와 값을 Set형태로 저장한다.
		  (HashMap을 이용해서 key와 value를 묶어 주기 위해서) 객체를 이용함
		   Map.Entry 인터페이스 이용
		   Map.entrySet 메소드는 클래스에 속하는 요소를 가지는 맵의 컬렉션  뷰를 반환함
		   iterator 인터페이스의 메소드는 iterator()를 이용함
		    
		*/
		Set<Map.Entry<String, Integer>> set1 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it1 = set1.iterator();
		while(it1.hasNext()){
		Map.Entry<String, Integer> e= it1.next();
		System.out.println("이름:"+e.getKey()+", 점수:"+e.getValue());
		}
		//키를 set2에 저장해보자
		Set set2 = map.keySet(); //키를 set에 저장함
		System.out.println("시험 응시자 명단:"+set2);
		
		Collection<Integer> v= map.values(); // 값들을 컬렉션에 넣는다 .
		
		Iterator<Integer> it2 = v.iterator();
		
		int sum = 0;
		
		while(it2.hasNext()){
			Integer i = it2.next();
			sum += i;
		}
		System.out.println("합계 :"+sum);
		System.out.println("평균:"+(float)sum/set2.size());
		System.out.println("최고 점수:"+Collections.max(v));
		System.out.println("최저 점수:"+Collections.min(v));
	}
	
}
