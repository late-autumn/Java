package Day07;

import java.util.Scanner;

class IN
{
	Scanner sc = new Scanner(System.in);
	int nu = sc.nextInt();
	
}

public class ClassEx {
	int add(int a, int b)
	{
		int c= a+b;
		return c;
	}
	
public static void main(String[] args) {
	
	
	int t ;
	ClassEx r = new ClassEx();
	System.out.println("입력해라");
	 t  = r.add(2,8);
System.out.println(r.add(2, 8));
	
	
}
}
