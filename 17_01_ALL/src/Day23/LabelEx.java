package Day23;
import java.awt.*;
import java.awt.event.WindowEvent;

public class LabelEx extends Frame{

	Label la1, la2, la3, la4;
	
	Font f1, f2;
	
	public LabelEx() {
		// TODO Auto-generated constructor stub
		super("��");
		
		f1 = new Font("����ü",Font.BOLD,20);
		f2 = new Font("����ü",Font.ITALIC,25);
		
		la1 = new Label("ȫ�浿");
		la2 = new Label("������",Label.CENTER);
		la3 = new Label("��3",Label.RIGHT);
		la4 = new Label("��� 4");
		
		setLayout(new GridLayout(4,4)); 				//���̾ƿ� �����ڿ� ���� �׸��� ���̾ƿ� ����
		
		la1.setFont(f1);
		la2.setFont(f1);
		la3.setFont(f2);
		la4.setFont(f2);
		
		//���̾ƿ��� �߰�
		
		add(la1);add(la2);add(la3);add(la4);
		
		//�󺧿� ������ ����
		la1.setBackground(Color.CYAN);
		la2.setBackground(Color.LIGHT_GRAY);
		la3.setBackground(Color.blue);
		la4.setBackground(Color.green);
		//������ ũ�� ����
		setSize(400, 300);
		setVisible(true);
		WinEvent event = new WinEvent();
		addWindowListener(event);
		
	}
	public static void main(String[] args) {
		new LabelEx();
	}
}
