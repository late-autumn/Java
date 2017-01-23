package Day23;

import java.awt.*;
public class TextEx extends Frame{

	private TextField textfield = new TextField("제목:");
	private TextArea textarea = new TextArea("메모:",5,10);
	
	private Button button = new Button("확인");
	private Label label = new Label("내용");
	
	public TextEx() {
		// TODO Auto-generated constructor stub
		super("메모장");
	
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
