package Day23;
import java.awt.*;
public class CheckBoxEx extends Frame{

	private Label label = new Label("�����ϴ� ����?");
	
	private Checkbox[] cb = {new Checkbox("�ٳ���"),
			new Checkbox("����"),new Checkbox("���ξ���",true),
			new Checkbox("���"),new Checkbox("����")
	};
	
	private Button button = new Button("Ȯ��");
	
	public CheckBoxEx() {
		super("CheckBox");
		
		
		setLayout(new GridLayout(7, 1));
		
		add(label);
		for(int i=0;i<5;i++){
			add(cb[i]);
		}
		add(button);
		
		
		setSize(300,200);
		setVisible(true);
		
		WinEvent event = new WinEvent();
		addWindowListener(event);
	
	}
	
	public static void main(String[] args) {
		new CheckBoxEx();
	}
}
