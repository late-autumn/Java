package Day23;
import java.awt.*;
public class CheckBoxGroupEx extends Frame{

	GridLayout gl = new GridLayout(4, 1);
	Label la = new Label("����� ������?");
	CheckboxGroup cg = new CheckboxGroup();
	Checkbox man = new Checkbox("��",cg,true);	//������ڸ��� vǥ�� üũ �Ƿ��� true 
	Checkbox woman = new Checkbox("��",cg,false);
	Button bt = new Button("Ȯ��");
	
	public CheckBoxGroupEx() {
		super("���� ��ư");
		
		setLayout(gl);
		add(la);
		add(man);
		add(woman);
		add(bt);
		pack();
		setVisible(true);

		 man.setFont(new Font("����ü",Font.BOLD,40));
		 woman.setFont(new Font("����ü",Font.BOLD,40));
		 WinEvent event = new WinEvent();
		 addWindowListener(event);
		 
		 
	 }
	
	
	public static void main(String[] args) {
		new CheckBoxGroupEx();
	}
}
