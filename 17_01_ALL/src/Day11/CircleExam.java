package Day11;


public class CircleExam {
public static void main(String[] args) {
	
	Circle cr = new Circle();		//��ü = �ν��Ͻ� ���� 
	cr.input();						//�Է� �޼ҵ� ȣ��
	double a = cr.area();			//���� ���ϴ� �޼ҵ� ȣ��
	double b = cr.length();			//�ѷ� ���ϴ� �޼ҵ� ȣ��
	cr.display(a, b);
}
}
