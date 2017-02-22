package Day16;

import static java.lang.System.out;

import java.util.*;
public class StackEx2 {
	
	private static final String colors[] ={
			"빨강","분홍","주황","파랑","연두","남색"
	};
	public StackEx2() {
		// TODO Auto-generated constructor stub
		Stack<String>stack = new Stack<>();
		//제네릭방식
		
		for(String n : colors)
			stack.push(n);
		popStack(stack);
		
	}

	public void popStack(Stack<String>st){ //출력
		while(!st.isEmpty())
			System.out.println(st.pop());
	}
	
	
public static void main(String[] args) {
	
	new StackEx2();
	
}
}
