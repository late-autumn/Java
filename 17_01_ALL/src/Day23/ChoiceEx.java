package Day23;
import java.awt.*;
public class ChoiceEx extends Frame{

	private Label label = new Label("생일");
	private Choice choice = new Choice();
	private Button button = new Button("확인");
	
	public ChoiceEx() {
		super("Choice");
		
		setLayout(new GridLayout(3, 1));
		
		add(label);
		for(int i=1;i<=12;i++){
			choice.add(String.valueOf(i)+"월");
		}
		add(choice);
		add(button);
		
		setSize(300,200);
		setVisible(true);
		WinEvent event = new WinEvent();
		addWindowListener(event);
	}
	
	public static void main(String[] args) {
		new ChoiceEx();
		
	}
}
