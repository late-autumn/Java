package Day23;
import java.awt.*;

public class ListEx extends Frame{

	private Label label = new Label("�ο����");
	private List list = new List(4,true);		//true�� �پ������� ���� ��� ���� ���� 

	private Button button = new Button("Ȯ��");
	private String[] name;
		
	
	public ListEx(String[] a){
		super("List");
		name = a;
		setLayout(new BorderLayout());
		
		for(int i=0; i<name.length;i++){
			list.add(name[i]);	 		//list�� �߰�
		}
		
		add("North",label);				//���� ����
		add("South",button);			//��ư�� �Ʒ���
		add("Center",list);				//����Ʈ�� �߾ӿ�
		
		list.setFont(new Font("����ü",Font.BOLD,35));
		
		
		setSize(300,200);
		setVisible(true);
		WinEvent event = new WinEvent();
		addWindowListener(event);
	}
	
	public static void main(String[] args) {
		new ListEx(args);
	}
	
}

