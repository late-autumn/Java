package Day03;

public class OperEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 20, b = 30,max;
		max = a>b ? ++a:++b;
		
		if(a>b)
			++a;
		else
			++b;
		
		
		System.out.println(max);
		System.out.println(a);
		System.out.println(b);
		
		int te =12;
		int ed = 6;
		System.out.println(te&ed);
		
	}

}
