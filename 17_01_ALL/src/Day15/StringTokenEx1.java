package Day15;

import java.util.*;
public class StringTokenEx1 {
	
	StringTokenizer st;
	
	
	public StringTokenEx1(String str)
	{
		System.out.println("str:"+str);
		st = new StringTokenizer(str);
	}
	public StringTokenEx1(String str,String delim)
	{
		System.out.println("str:"+str+", delim:"+delim);
		st = new StringTokenizer(str,delim);
	}
	void print()
	{
		System.out.println("Tokencount :"+st.countTokens());
		while(st.hasMoreTokens())
		{
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println("===============================");
	
	}
	
public static void main(String[] args) {
	
	StringTokenEx1 str1 = new StringTokenEx1("�츮���� ���ѹα� ����,�ƾƾ�"); //�⺻�� ���鿡�� �����ش�.
	str1.print();
	
	StringTokenEx1 str2 = new StringTokenEx1("2017/01/11","/"); //�ڿ� �ִ� ���̰� ���� ��.
	str2.print();
	
}
}
