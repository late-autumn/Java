package Day15;
import java.util.StringTokenizer;

public class StringTokenEx2 {
	
	/*String Ŭ������ split()�޼ҵ�� StringTokenizer��  ����
	 * 
	 * split() : �� �޼ҵ��� ��� ���ǹ��� ����(white space)�� �ڸ��� ������
	 * StringTokenizer : �� ��쿡�� ���ǹ��� ������ �����ϰ� ������
	 * 
	 * 
	 */
public static void main(String[] args) {
	
	String str = "���������, �ƿ��,, ���, ������, ����";
	StringTokenizer tokens = new StringTokenizer(str, ",");
	for(int i = 1; tokens.hasMoreTokens();i++)
	{
		System.out.println("����"+i+":"+tokens.nextToken()+"\t");
	}
	System.out.println();
	System.out.println("==========================================");
	
	String[] values = str.split(",");
	for(int i=0; i<values.length;i++)
		System.out.println("����"+(i+1)+":"+values[i]+"\t");
	
	System.out.println("==========================================");
	double da;
	da = Math.pow(2,3);
	System.out.println(da);
	
	
	
}
}
