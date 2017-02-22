package Day22;

//버블 정렬

public class Bouble_sort {

	public static void main(String[] args) {
		
		int a[] = {52,42,12,62,50,67,21,1};
		int temp;
		System.out.println("정렬전 ");
		for(int n :a){
			System.out.print(n+" ");
		}
		
		for(int i= a.length-1;i>0;i--){
			for(int j=0; j<i; j++){
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j] =a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("정렬후 ");
		for(int n :a){
			System.out.print(n+" ");
		}
	}
}
