package Day16;

import static java.lang.System.out;
import java.util.*;

public class StackEx {
public static void main(String[] args) {
	
	//LIFO : 후입 선출 방식 
	String [] groupA = {"대한민국","일본","중국","사우디","쿠웨이트"};
	Stack<String>stack = new Stack<>();
	//제네릭 방식 
	
	for(String n : groupA)
		stack.push(n);
	//배열에 있는 데이터들을 스택에 저장한다.
	
	//스택에 있는 데이터를 출력할 경우는 pop()메소드를 이용
/*	for(int i=0; i<groupA.length;i++)
		out.println(stack.pop());*/
	while(!stack.isEmpty())
		out.println(stack.pop());
	
	
	
	
}
}
