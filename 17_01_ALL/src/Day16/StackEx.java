package Day16;

import static java.lang.System.out;
import java.util.*;

public class StackEx {
public static void main(String[] args) {
	
	//LIFO : ���� ���� ��� 
	String [] groupA = {"���ѹα�","�Ϻ�","�߱�","����","�����Ʈ"};
	Stack<String>stack = new Stack<>();
	//���׸� ��� 
	
	for(String n : groupA)
		stack.push(n);
	//�迭�� �ִ� �����͵��� ���ÿ� �����Ѵ�.
	
	//���ÿ� �ִ� �����͸� ����� ���� pop()�޼ҵ带 �̿�
/*	for(int i=0; i<groupA.length;i++)
		out.println(stack.pop());*/
	while(!stack.isEmpty())
		out.println(stack.pop());
	
	
	
	
}
}
