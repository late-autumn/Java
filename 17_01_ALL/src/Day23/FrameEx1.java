package Day23;
import java.awt.Frame;



public class FrameEx1 {

	public static void main(String[] args) {
		
		Frame f = new Frame();				//프레임 객체 생성
		WinEvent event = new WinEvent();	//윈도우 이벤트 객체 생성
		f.addWindowListener(event);			//윈도우 리스너를 통해 이벤트를 넣어준다. 

		f.setSize(800, 600);				//프레임의 가로,세로설정
		f.setVisible(true);					//프레임 보이기 설정 true일대는 보임
		
		
		/*JFrame j = new JFrame();
		j.setSize(800, 600);
		j.setVisible(true);
		*/
		
		
	}
}
