package Day24.awt;

import java.awt.*;

public class FileDialogEx extends Frame{

	FileDialog fd = new FileDialog(this, "내꺼 저장", FileDialog.LOAD);	//mode : save, load
			
	
	public FileDialogEx() {
		// TODO Auto-generated constructor stub
		super("파일 대화 상자");
		setSize(300,200);
		setVisible(true);
		fd.setVisible(true);
		
		System.out.println(fd.getFile());
		System.out.println(fd.getDirectory());
		WinEvent event = new WinEvent();
		addWindowListener(event);
		
	}
	
	public static void main(String[] args) {
		
		new FileDialogEx();
	}
}
