package Day06;

public class ArraryCopyEx {
public static void main(String[] args) {
	
	String[] src = {"JAVA","DB","IoT","Linux"};
	String[] des = new String[6];
	des[0] = "os";
	des[1] = "network";
	
	System.arraycopy(src, 0, des, 2, 4);  //����, ��ġ, ������ ���, ������ �ε���, �Ѱ�
	for(String te : des)
	System.out.println(te);
	
}
	
	
}
