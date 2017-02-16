package Day05;

public class ForEx01 {
public static void main(String[] args) {
	
	String[] arr = {"AA","BB","CC","DD","EE","FF"};
	
	for(String s:arr)  //새로운 for문 기법 
	{
		System.out.print(s+"\t");
	}
	System.out.println();
	for(int i=0;i<arr.length;i++) //기존의 for문 기법
	{
		System.out.print(arr[i]+"\t");
	}
	
}
}
