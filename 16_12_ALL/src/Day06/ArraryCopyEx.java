package Day06;

public class ArraryCopyEx {
public static void main(String[] args) {
	
	String[] src = {"JAVA","DB","IoT","Linux"};
	String[] des = new String[6];
	des[0] = "os";
	des[1] = "network";
	
	System.arraycopy(src, 0, des, 2, 4);  //원본, 위치, 복사할 대상, 복사할 인덱스, 총값
	for(String te : des)
	System.out.println(te);
	
}
	
	
}
