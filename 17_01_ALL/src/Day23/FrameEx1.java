package Day23;
import java.awt.Frame;



public class FrameEx1 {

	public static void main(String[] args) {
		
		Frame f = new Frame();				//������ ��ü ����
		WinEvent event = new WinEvent();	//������ �̺�Ʈ ��ü ����
		f.addWindowListener(event);			//������ �����ʸ� ���� �̺�Ʈ�� �־��ش�. 

		f.setSize(800, 600);				//�������� ����,���μ���
		f.setVisible(true);					//������ ���̱� ���� true�ϴ�� ����
		
		
		/*JFrame j = new JFrame();
		j.setSize(800, 600);
		j.setVisible(true);
		*/
		
		
	}
}
