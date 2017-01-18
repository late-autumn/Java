package Day16;

import java.util.*;

public class QueueEx {
public static void main(String[] args) {
	
	String[] item = {"홍길동","강감찬","김유신","이순신"};
	LinkedList<String> q = new LinkedList<String>();
	
	for(String n : item)
		q.offer(n); //요소 추가
	System.out.println("q의 크기 :"+q.size());
	
	String data = " ";
	while((data=q.poll())!=null){
		
		System.out.println(data+"삭제");
	}
	
} 


}
