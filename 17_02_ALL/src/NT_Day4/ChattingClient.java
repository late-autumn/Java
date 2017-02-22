package NT_Day4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class ChattingClient extends JFrame implements ActionListener {
	
	//선언부
	Socket socket = null;
	ObjectOutputStream oos = null; //내가 입력한 메시지를 서버로 보낼 때
	ObjectInputStream ois = null; //서버에서 보내온 메시지를 읽어올때

	JPanel jp_center = new JPanel();
	
	JTextArea jta_display = new JTextArea();
	JScrollPane jsp_display = new JScrollPane(jta_display);
	
	JTextField jtf_msg = new JTextField();
	JPanel jp_east = new JPanel();
	
	String cols[] = {"대화명"};
	String data[][] = new String[0][0];
	
	DefaultTableModel dtm = new DefaultTableModel(data,cols);
	JTable jtb_name = new JTable(dtm);
	JScrollPane jsp_name = new JScrollPane(jtb_name);
	
	JPanel jp_east_south = new JPanel();
	JButton jbtn_whisper = new JButton("귓속말하기");
	JButton jbtn_change = new JButton("대화명");
	JButton jbtn_fontColor = new JButton("글자색");
	JButton jbtn_exit = new JButton("나가기");
	
	//대화명을 담을 변수 선언
	String nickName = null;
	
	
	//생성자
	public ChattingClient() {
		// TODO Auto-generated constructor stub
		
		nickName = JOptionPane.showInputDialog("대화명을 입력하세요");
		
		try {
			
			socket = new Socket("192.168.0.5", 6000);
			
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
			oos.writeObject("100#"+nickName);
			ChattingClientThread cct = new ChattingClientThread(this);
			cct.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	//화면처리부
	public void initDisplay(){
		
		//이벤트 리스너
		jtf_msg.addActionListener(this);
		jbtn_change.addActionListener(this);
		jbtn_whisper.addActionListener(this);
		jbtn_exit.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent arg0){
				exitChat();
				System.exit(0);
			}
		});
		
		
		jta_display.setLineWrap(true);
		this.setLayout(new GridLayout(1,2));
		
		jp_center.setLayout(new BorderLayout());
		jp_center.add("Center", jsp_display);
		jp_center.add("South", jtf_msg);
		jp_center.setBackground(Color.orange);
		
		jp_east.setLayout(new BorderLayout());
		jp_east.setBackground(Color.green);
		
		jp_east_south.setLayout(new GridLayout(2,2));
		jp_east_south.add(jbtn_whisper);
		jp_east_south.add(jbtn_change);
		jp_east_south.add(jbtn_fontColor);
		jp_east_south.add(jbtn_exit);
		
		jp_east.add("Center", jsp_name);
		jp_east.add("South", jp_east_south);
		
		this.add(jp_center);
		this.add(jp_east);
		this.setTitle(nickName+"님의 대화창");
		this.setSize(500, 500);
		this.setVisible(true);
		
	}
	
	
	//나가기 버튼 호출시(창닫기 직전, 창닫기 버튼을 클릭시)
	public void exitChat(){
		
		try {
			
			//서버로 퇴장 정보를 통보하기
			oos.writeObject(Protocol.ROOM_OUT+"#"+this.nickName);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object obj = e.getSource(); //이벤트가 감지된 클래스의 주소번지를 받아옴
		String msg = jtf_msg.getText(); //텍스트필드로부터 메시지를 가져다가 msg에 저장
		
		if(obj==jtf_msg){
			
			//메시지를 입력후 엔터키를 쳤을 때
			System.out.println("메시지 입력 확인");
			jtf_msg.setText(""); //엔터를 치고 실행한 다음 초기화함
			
			try {
				oos.writeObject(Protocol.MESSAGE+"#"+nickName+"#"+msg);
			} catch (IOException io) {
				System.out.println(io.toString());
			}
		}//메시지 전송 끝
		else if(obj==jbtn_change){//대화명 변경 버튼 클릭했을때
			
			String afterName = JOptionPane.showInputDialog("변경할 대화명을 입력하세요:");
			
			//변경할 대화명을 입력하지 않았을 경우
			if(afterName ==null || afterName.trim().length()<1){
				//actionPerformed 메소드 빠져나감
				return;
			}
			
			try{
				
				oos.writeObject(Protocol.CHANGE+"#"+nickName+"#"+afterName);
			}catch(Exception e2){
				e2.printStackTrace();
			}
			//대화명 변경 끝
		}
		else if(obj == jbtn_whisper){
			//귓속말 할 대화 상대 선택하기
			int row = jtb_name.getSelectedRow();
			
			if(row == -1){
				JOptionPane.showMessageDialog(this, "귓속말 상대를 선택하세요","INFO",JOptionPane.INFORMATION_MESSAGE);
				return;		//actionPerformed메소드 빠져나감
				
			}
		
		else
		{
			String name = (String)dtm.getValueAt(row, 0);
			if(nickName.equals(name)){
				
				JOptionPane.showMessageDialog(this, "다른상대를 선택하세요","INFO",JOptionPane.INFORMATION_MESSAGE);
				//actionPerformed 메소드 빠져나감
				return;
			}
			
			String msg1 = JOptionPane.showInputDialog(name+"님에게 보낸 메세지 입력");
			try{
				
				oos.writeObject(Protocol.WHISPER+"#"+nickName+"#"+name+"#"+msg1);
			}catch(IOException e2){
				e2.printStackTrace();
			}
		}
	}	//귓속말 대화 끝 
		
		//나가기 버튼
		else if(obj==jbtn_exit){
			this.exitChat();
			System.exit(0);
		}
		

	}
	
	public static void main(String[] args) {
		
		ChattingClient cClient = new ChattingClient();
		cClient.initDisplay();
		
	}

}
