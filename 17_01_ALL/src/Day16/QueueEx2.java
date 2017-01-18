package Day16;

import java.util.*;

public class QueueEx2 {
	
	private static final String colors[] ={
			"����","��ȫ","��Ȳ","�Ķ�","����","����"
	};
	public QueueEx2() {
		// TODO Auto-generated constructor stub
		Queue<String>queue = new LinkedList<>();
		//���׸����		
		for(String n : colors)
			queue.offer(n);

		popStack(queue);		
	}

	public void popStack(Queue<String>q){ //���
		while(q.peek()!=null)
			System.out.println(q.poll());
	}
	
	
public static void main(String[] args) {
	new QueueEx2();
	
	
}
}
