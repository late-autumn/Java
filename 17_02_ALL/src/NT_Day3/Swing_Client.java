package NT_Day3;
//사용자가 입력한 메세지를 서버에 전송한다.
//서버 포트번호 : 3000

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Swing_Client extends JFrame implements ActionListener, Runnable {

	private Socket socket;				//서버랑 연결된 Socket 
	
	private BufferedReader in;			//서버가 보낸 메세지를 읽어들일 스트림
	
	private PrintWriter out;			//서버로 메세지를 전송할 스트림
	
	private BufferedReader keyboard;	//키보드로 입력내용을 읽어들일 스트림
	
	private Thread thread;
	
    private String ip;
    private String id;	
	
    JTextArea text_area = new JTextArea("",10,10);
	JTextField text_field = new JTextField(15);
	JTextField text_field2 =new JTextField(5);
	
	JButton okb	= new JButton("전송");
	JButton clb = new JButton("나가기");
	JButton inb = new JButton("입력");
	JLabel l1 = new JLabel("ID");
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
    
	private JPanel tp; 

    // 카드 레이아웃 관련
    private Container tab;
    private CardLayout clayout;
    // 상태 플래그
    boolean status;
	
	public Swing_Client(String ip) {
        this.ip = ip;

	setLayout(new GridLayout(5,2));
		
		p1.add(text_field);
		p1.add(okb);
		p1.add(clb);
		p2.add(l1);
		p2.add(text_field2);
		p2.add(inb);
		add("North",p2);
		add("Center",text_area);
		add("South",p1);
		
		okb.addActionListener(this);
		clb.addActionListener(this);
  		
		tp = new JPanel();

		getContentPane().add(tp);
		setTitle("채팅방");
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
	
    public void connectServer() {
        try {
            // 소켓 생성
            socket = new Socket(ip, 4000);
            System.out.println("[Client]Server 연결 성공!!");

            // 입출력 스트림 생성
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            // 서버에 로그인 메시지 전달
            out.println(id+"/"+"login");

            // 메시지 수신을 위한 스레드 생성
            thread = new Thread(this);
            thread.start();
        } catch(Exception e) {
            // e.printStackTrace();
            System.out.println("[MultiChatClient]connectServer() Exception 발생!!");
        }
    }

    // 이벤트 처리
    public void actionPerformed(ActionEvent arg0) {
        Object obj = arg0.getSource();

        connectServer();
        
       /* // 종료 버튼 처리
        if(obj == exitButton) {
            System.exit(0);
        } else if(obj == loginButton) {
            id = idInput.getText();

            label2.setText("대화명 : " + id);
            clayout.show(tab, "logout");
            connectServer();
        } else if(obj == logoutButton) {
            // 로그아웃 메시지 전송
            outMsg.println(id + "/" + "logout");
            // 대화 창 클리어
*/            //msgOut.setText("");
            // 로그인 패널로 전환
         //   clayout.show(tab, "login");
          //  out.close();
        if(obj == text_field) {
            // 메시지 전송
            out.println(id + "/" + text_field.getText());
            // 입력 창 클리어
            text_field.setText("");
        }
    }

    public void run() {
        // 수신 메시지를 처리하는 변수
        String msg;
        String[] rmsg;

        status = true;

        while(status) {
            try {
                // 메시지 수신과 파싱
                msg = in.readLine();
                rmsg = msg.split("/");

                // JTextArea에 수신된 메시지 추가
                text_area.append(rmsg[0] + ">"+rmsg[1] + "\n");

                // 커서를 현재 대화 메시지에 표시
                text_area.setCaretPosition(text_area.getDocument().getLength());
            } catch(IOException e) {
                // e.printStackTrace();
                status = false;
            }
        }

        System.out.println("[MultiChatClient]" + thread.getName() + "종료됨");
    }

    public static void main(String[] args) {
    	Swing_Client mcc = new Swing_Client("127.0.0.1");
    }
}
	
