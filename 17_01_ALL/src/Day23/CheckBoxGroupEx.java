package Day23;
import java.awt.*;
public class CheckBoxGroupEx extends Frame{

	GridLayout gl = new GridLayout(4, 1);
	Label la = new Label("당신의 성별은?");
	CheckboxGroup cg = new CheckboxGroup();
	Checkbox man = new Checkbox("남",cg,true);	//실행되자마자 v표로 체크 되려면 true 
	Checkbox woman = new Checkbox("여",cg,false);
	Button bt = new Button("확인");
	
	public CheckBoxGroupEx() {
		super("라디오 버튼");
		
		setLayout(gl);
		add(la);
		add(man);
		add(woman);
		add(bt);
		pack();
		setVisible(true);

		 man.setFont(new Font("굴림체",Font.BOLD,40));
		 woman.setFont(new Font("굴림체",Font.BOLD,40));
		 WinEvent event = new WinEvent();
		 addWindowListener(event);
		 
		 
	 }
	
	
	public static void main(String[] args) {
		new CheckBoxGroupEx();
	}
}
