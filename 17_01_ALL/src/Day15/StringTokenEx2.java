package Day15;
import java.util.StringTokenizer;

public class StringTokenEx2 {
	
	/*String 클래스의 split()메소드와 StringTokenizer의  차이
	 * 
	 * split() : 이 메소드의 경우 무의미한 공백(white space)도 자리를 차지함
	 * StringTokenizer : 이 경우에는 무의미한 공백은 무시하고 제거함
	 * 
	 * 
	 */
public static void main(String[] args) {
	
	String str = "람보르기니, 아우디,, 페라리, 포르쉐, 링컨";
	StringTokenizer tokens = new StringTokenizer(str, ",");
	for(int i = 1; tokens.hasMoreTokens();i++)
	{
		System.out.println("문자"+i+":"+tokens.nextToken()+"\t");
	}
	System.out.println();
	System.out.println("==========================================");
	
	String[] values = str.split(",");
	for(int i=0; i<values.length;i++)
		System.out.println("문자"+(i+1)+":"+values[i]+"\t");
	
	System.out.println("==========================================");
	double da;
	da = Math.pow(2,3);
	System.out.println(da);
	
	
	
}
}
