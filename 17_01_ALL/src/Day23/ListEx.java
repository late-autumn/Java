package Day23;
import java.awt.*;

public class ListEx extends Frame{

	private Label label = new Label("인원목록");
	private List list = new List(4,true);		//true가 붙어있으면 다중 모드 지원 여부 

	private Button button = new Button("확인");
	private String[] name;
		
	
	public ListEx(String[] a){
		super("List");
		name = a;
		setLayout(new BorderLayout());
		
		for(int i=0; i<name.length;i++){
			list.add(name[i]);	 		//list에 추가
		}
		
		add("North",label);				//라벨을 위로
		add("South",button);			//버튼을 아래로
		add("Center",list);				//리스트를 중앙에
		
		list.setFont(new Font("굴림체",Font.BOLD,35));
		
		
		setSize(300,200);
		setVisible(true);
		WinEvent event = new WinEvent();
		addWindowListener(event);
	}
	
	public static void main(String[] args) {
		new ListEx(args);
	}
	
}

