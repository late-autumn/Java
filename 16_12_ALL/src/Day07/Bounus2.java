package Day07;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Bounus2 {
public static void main(String[] args)throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int human = Integer.parseInt(args[0]); //��� ��
	String name[] = new String[human];
	String[] subject = new String[args.length-1];
	//����� �ʱ�ȭ
	//������ ����ó�� �迭
	
	int[][]jumsu = new int[human][args.length];
	float[] avg = new float[human];
	char[] grade = new char[human];
	int[] rank = new int[human];
	
	for(int i=0;i<args.length-1;i++)
	{
		subject[i] = args[i+1]; //����� ��������		
	}
	for(int i=0;i<human;i++)//��� �� ��ŭ �ݺ�
	{
		System.out.print(i+1+"��° �л� �̸�:");
		name[i] = br.readLine();
		System.out.print("���ð����:");
		System.out.println(name[i]+"�л� ���� �Է�:");
		for(int j=0; j<subject.length;j++)
		{	//�������ŭ ������ ���Ѵ�.
			System.out.print(subject[j]+"����:");
			jumsu[i][j] = Integer.parseInt(br.readLine());
			
			jumsu[i][subject.length]+=jumsu[i][j];
			//���� ����
		}
	}
	//��� ���ϱ� 
	
	//���� ���ϱ�
	
	//���� ���ϱ�
	
	//����ǥ ���
	System.out.print("�̸�\t");
	for(int i=0;i<subject.length;i++)
	{
		System.out.print(subject[i]+"\t");	
	}
	System.out.println("���� \t");
	
	for(int i=0; i<human;i++)
	{
		System.out.print(name[i]+"\t");
		for(int j=0;j<subject.length+1;j++)
		{	//���������� ���� ���
			System.out.print(jumsu[i][j]+"\t");
		}
		
		System.out.print(avg[i]+"��� \t");
		System.out.println();
	}
	
}
}