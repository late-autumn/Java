package Day17;

public class Test8 {
public static void main(String[] args) {
	

	int a[]= {2,3,7,10,11};
	int b[] = {3,6,10,14};

	for(int i=0; i<a.length;i++){
		System.out.printf("%3d",a[i]);
	}	
		//집합 b는 집합 a와 중복되는 데이터는 제거하면서 출력
	for(int i=0;i<b.length;i++){
		boolean flag = false;
		
		//중복이 되었을 경우
		for(int j =0; j<a.length;j++){
			if(b[i]==a[j])
			{
				flag = true;
				break;
			}
		}
			//중복이 일어나지 않았을 경우 계속 진행
			if(flag) continue;
			System.out.printf("%3d",b[i]);
		}//end for문
	System.out.println();
	//두번째 방법
	/*
	 * 임시 배열을 만들고 그 안에 중복되지 않은 배열을 요소로 저장한 다음 임시 배열을 전체 데이터로 출력한다. 
	 */
	int c[] = {2,3,7,10,11};
	int d[] = {3,6,10,14};
	int[] temp = new int[a.length+b.length];
	int n;
	for(n = 0; n<c.length;n++){
		temp[n] = c[n];
	}
	for(int k =0;k<d.length;k++){
		
		boolean flag = false;
		
		for(int j=0;j<a.length;j++)
		{
			if(d[k]==c[j])
			{
				flag = true;
				break;
			}
		}
		if(flag)
			continue;
		
		//temp에 담는다.
		temp[n] = d[k];
		n++;
	}
	for(int i=0; i<temp.length;i++){
		if(temp[i]==0) continue;
		System.out.printf("%3d",temp[i]);
	}
		
	
	
	
	
}
}
