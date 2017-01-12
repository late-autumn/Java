package Day16;

import static java.lang.System.out;

import java.util.*;
public class StackEx2 {
	
	private static final String colors[] ={
			"����","��ȫ","��Ȳ","�Ķ�","����","����"
	};
	public StackEx2() {
		// TODO Auto-generated constructor stub
		Stack<String>stack = new Stack<>();
		//���׸����
		
		for(String n : colors)
			stack.push(n);
		popStack(stack);
		
	}

	public void popStack(Stack<String>st){ //���
		while(!st.isEmpty())
			System.out.println(st.pop());
	}
	
	
public static void main(String[] args) {
	
	new StackEx2();
	
}
}
