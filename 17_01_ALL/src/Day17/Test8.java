package Day17;

public class Test8 {
public static void main(String[] args) {
	

	int a[]= {2,3,7,10,11};
	int b[] = {3,6,10,14};

	for(int i=0; i<a.length;i++){
		System.out.printf("%3d",a[i]);
	}	
		//���� b�� ���� a�� �ߺ��Ǵ� �����ʹ� �����ϸ鼭 ���
	for(int i=0;i<b.length;i++){
		boolean flag = false;
		
		//�ߺ��� �Ǿ��� ���
		for(int j =0; j<a.length;j++){
			if(b[i]==a[j])
			{
				flag = true;
				break;
			}
		}
			//�ߺ��� �Ͼ�� �ʾ��� ��� ��� ����
			if(flag) continue;
			System.out.printf("%3d",b[i]);
		}//end for��
	System.out.println();
	//�ι�° ���
	/*
	 * �ӽ� �迭�� ����� �� �ȿ� �ߺ����� ���� �迭�� ��ҷ� ������ ���� �ӽ� �迭�� ��ü �����ͷ� ����Ѵ�. 
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
		
		//temp�� ��´�.
		temp[n] = d[k];
		n++;
	}
	for(int i=0; i<temp.length;i++){
		if(temp[i]==0) continue;
		System.out.printf("%3d",temp[i]);
	}
		
	
	
	
	
}
}
