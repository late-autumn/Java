package Day23;
import java.awt.*;
public class CheckBoxEx extends Frame{

	private Label label = new Label("좋아하는 과일?");
	
	private Checkbox[] cb = {new Checkbox("바나나"),
			new Checkbox("딸기"),new Checkbox("파인애플",true),
			new Checkbox("사과"),new Checkbox("포도")
	};
	
	private Button button = new Button("확인");
	
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
