package Day22;

//선택 정렬(selection_sort)

public class Selection_sort {

	public static void main(String[] args) {
		
		int a[] = {52,42,12,62,50,67,21,1};
		
		int i, j ,temp;
		int min;
		System.out.println("원본 데이터:");
		
		for(int n : a)
		{
			System.out.print(n+" ");
		}
		System.out.println();
		
		for(i = 0; i<a.length-1;i++){
			min = i;
			for(j=i+1;j<a.length;j++){
				
				if(a[j]<a[min]){
					min = j;
					}
			}
				temp = a[i];
				a[i] = a[min];
				a[min] = temp;

			System.out.printf("\n%d 단계 : ", i+1);
			for(int t=0; t<a.length; t++) System.out.printf("%3d ", a[t]);
		}
			
	}
}
