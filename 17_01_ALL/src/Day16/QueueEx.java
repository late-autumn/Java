package Day16;

import java.util.*;

public class QueueEx {
public static void main(String[] args) {
	
	String[] item = {"ȫ�浿","������","������","�̼���"};
	LinkedList<String> q = new LinkedList<String>();
	
	for(String n : item)
		q.offer(n); //��� �߰�
	System.out.println("q�� ũ�� :"+q.size());
	
	String data = " ";
	while((data=q.poll())!=null){
		
		System.out.println(data+"����");
	}
	
} 


}
