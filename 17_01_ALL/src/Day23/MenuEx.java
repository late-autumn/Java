package Day23;
import java.awt.*;
public class MenuEx extends Frame {

	private MenuBar mb = new MenuBar();			//메뉴바 인스턴스 생성
	
	private Menu file = new Menu("파일");
	private Menu edit = new Menu("도구");
	private Menu view = new Menu("보기");
	private Menu help = new Menu("도움말");
	
	private MenuItem fnew = new MenuItem("새 파일");
	private MenuItem fopen = new MenuItem("파일 열기");
	private MenuItem fsave = new MenuItem("파일 저장");
	private MenuItem fsaveas = new MenuItem("다른이름으로 저장");
	private MenuItem fexit = new MenuItem("나가기");
	
	private Menu ecolor = new Menu("색상");
	private Menu esize = new Menu("크기");
	
	private CheckboxMenuItem ecred = new CheckboxMenuItem("레드");
	private CheckboxMenuItem ecgreen = new CheckboxMenuItem("그린");
	private CheckboxMenuItem ecblue = new CheckboxMenuItem("블루");
	
	private CheckboxMenuItem es10 = new CheckboxMenuItem("10");
	private CheckboxMenuItem es20 = new CheckboxMenuItem("20");
	private CheckboxMenuItem es30 = new CheckboxMenuItem("30");
	
	
	
	
	public MenuEx() {
		super("메뉴와 패널");
		
		setMenuBar(mb);
		mb.add(file);
		mb.add(edit);
		mb.add(view);
		mb.add(help);
		
		ecolor.add(ecred);
		ecolor.add(ecgreen);
		ecolor.add(ecblue);
		
		esize.add(es10);
		esize.add(es20);
		esize.add(es30);
		
		edit.add(ecolor);
		edit.addSeparator();		//줄 생성 해주기.
		edit.add(esize);
		
		file.add(fnew);
		file.addSeparator();
		file.add(fopen);
		file.add(fsave);
		file.add(fsaveas);
		file.addSeparator();
		file.add(fexit);
		
		setLayout(new BorderLayout());
		
		add("North",new Label("hello, Java",Label.CENTER));
		add("Center",new TextArea());
		
		Panel p = new Panel(new GridLayout(1, 2));
		p.add(new Button("확인"));
		p.add(new Button("취소"));
		
		add("South",p);
		
		setSize(400,300);
		
		setVisible(true);

		 WinEvent event = new WinEvent();
		 addWindowListener(event);
		 

	}
	
	public static void main(String[] args) {
		new MenuEx();
		
	}
}
