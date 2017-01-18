package Day16;

import java.util.*;

public class QueueEx2 {
	
	private static final String colors[] ={
			"빨강","분홍","주황","파랑","연두","남색"
	};
	public QueueEx2() {
		// TODO Auto-generated constructor stub
		Queue<String>queue = new LinkedList<>();
		//제네릭방식		
		for(String n : colors)
			queue.offer(n);

		popStack(queue);		
	}

	public void popStack(Queue<String>q){ //출력
		while(q.peek()!=null)
			System.out.println(q.poll());
	}
	
	
public static void main(String[] args) {
	new QueueEx2();
	
	
}
}
