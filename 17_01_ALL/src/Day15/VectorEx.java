package Day15;

import java.util.*;

/*
 * vector : ���� ������ �Է� �ޱ�
 * �ݵ�� import java.util.*; ���� �ؾ��Ѵ�.
 * object�� ���ѹ迭�� �߰����� ������ Ŭ���� ������ ȿ�����̴�.
 * 
 */


class AA{
	
	int a;
	public AA(int a)
	{
		this.a = a;
		
	}
}


public class VectorEx {
public static void main(String[] args) {
	
	Vector ve = new Vector<>();

	ve.add(new AA(10));
	ve.add(new AA(20));	
	ve.add(new AA(30));
	ve.add(new AA(40));
	ve.add(new AA(50));	
	ve.add(new AA(60));
	
	for(int i=0; i<ve.size();i++)
	{
	AA aa =(AA)ve.elementAt(i); 
	System.out.println(aa.a);
	}
	
	ve.removeElementAt(4);
	
	for(int i=0; i<ve.size();i++)
	{
	AA aa =(AA)ve.elementAt(i); 
	System.out.println(aa.a);
	}
	
}
}
