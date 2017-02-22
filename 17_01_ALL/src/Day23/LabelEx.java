package Day23;
import java.awt.*;
import java.awt.event.WindowEvent;

public class LabelEx extends Frame{

	Label la1, la2, la3, la4;
	
	Font f1, f2;
	
	public LabelEx() {
		// TODO Auto-generated constructor stub
		super("라벨");
		
		f1 = new Font("굴림체",Font.BOLD,20);
		f2 = new Font("바탕체",Font.ITALIC,25);
		
		la1 = new Label("홍길동");
		la2 = new Label("강감찬",Label.CENTER);
		la3 = new Label("라벨3",Label.RIGHT);
		la4 = new Label("요거 4");
		
		setLayout(new GridLayout(4,4)); 				//레이아웃 관리자에 의한 그리드 레이아웃 생성
		
		la1.setFont(f1);
		la2.setFont(f1);
		la3.setFont(f2);
		la4.setFont(f2);
		
		//레이아웃에 추가
		
		add(la1);add(la2);add(la3);add(la4);
		
		//라벨에 바탕색 적용
		la1.setBackground(Color.CYAN);
		la2.setBackground(Color.LIGHT_GRAY);
		la3.setBackground(Color.blue);
		la4.setBackground(Color.green);
		//프레임 크기 설정
		setSize(400, 300);
		setVisible(true);
		WinEvent event = new WinEvent();
		addWindowListener(event);
		
	}
	public static void main(String[] args) {
		new LabelEx();
	}
}
