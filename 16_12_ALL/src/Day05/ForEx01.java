package Day05;

public class ForEx01 {
public static void main(String[] args) {
	
	String[] arr = {"AA","BB","CC","DD","EE","FF"};
	
	for(String s:arr)  //���ο� for�� ��� 
	{
		System.out.print(s+"\t");
	}
	System.out.println();
	for(int i=0;i<arr.length;i++) //������ for�� ���
	{
		System.out.print(arr[i]+"\t");
	}
	
}
}
