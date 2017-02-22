package DB_Day3;

import java.awt.Dimension;
import javax.swing.*;
import javax.swing.JTabbedPane;

public class MainFrame extends JFrame{

	private JTabbedPane tp; 
	private AddPane ap;
	private FindPane fp;
	private TotalPane tpa;
	
	
	
	public MainFrame() {
		/*
		 * 프레임에 사원정보 입력 탭과 사원정보 조회 탭 객체를 생성하고 프레임에 추가함
		 * 탭을 구현하기 위해 jTabbedPane 객체를 생성하고, JTabbedPane객체인 
		 * tp에 사원정보 입력패널과 사원정보 조회 패널을 추가한 후 프레임에 tp를 추가함
		 * 
		 */
		
		tp = new JTabbedPane();
		ap = new AddPane();
		fp = new FindPane();
		tpa = new TotalPane();
		
		tp.addTab("사원정보입력",ap);
		tp.addTab("사원정보조회",fp);
		tp.addTab("사원정보전체보기",tpa);
		
		getContentPane().add(tp);
		setTitle("사원관리");
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
	public static void main(String[] args) {
		
		MainFrame mf = new MainFrame();
		mf.setSize(600,600);
	}
}
