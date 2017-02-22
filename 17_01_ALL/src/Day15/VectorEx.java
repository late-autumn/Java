package Day15;

import java.util.*;

/*
 * vector : 무한 데이터 입력 받기
 * 반드시 import java.util.*; 선언 해야한다.
 * object가 무한배열로 추가가능 동일한 클래스 내에서 효율적이다.
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
