package Day23;

import java.awt.*;
public class TextEx extends Frame{

	private TextField textfield = new TextField("����:");
	private TextArea textarea = new TextArea("�޸�:",5,10);
	
	private Button button = new Button("Ȯ��");
	private Label label = new Label("����");
	
	public TextEx() {
		// TODO Auto-generated constructor stub
		super("�޸���");
	
		setLayout(new BorderLayout());
		add("North",textfield);
		add("South",button);
		add("Center",textarea);
		add("West",label);
		
		setSize(300,400);
		setVisible(true);
		WinEvent event = new WinEvent();
		addWindowListener(event);
		
		
	}
	
	
	public static void main(String[] args) {
		new TextEx();
		
	}
}
