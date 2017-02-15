package NT_Day3;
//����ڰ� �Է��� �޼����� ������ �����Ѵ�.
//���� ��Ʈ��ȣ : 3000

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

	private Socket socket;				//������ ����� Socket 
	
	private BufferedReader in;			//������ ���� �޼����� �о���� ��Ʈ��
	
	private PrintWriter out;			//������ �޼����� ������ ��Ʈ��
	
	private BufferedReader keyboard;	//Ű����� �Է³����� �о���� ��Ʈ��
	
	private Thread thread;
	
    private String ip;
    private String id;	
	
    JTextArea text_area = new JTextArea("",10,10);
	JTextField text_field = new JTextField(15);
	JTextField text_field2 =new JTextField(5);
	
	JButton okb	= new JButton("����");
	JButton clb = new JButton("������");
	JButton inb = new JButton("�Է�");
	JLabel l1 = new JLabel("ID");
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
    
	private JPanel tp; 

    // ī�� ���̾ƿ� ����
    private Container tab;
    private CardLayout clayout;
    // ���� �÷���
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
		setTitle("ä�ù�");
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
	
    public void connectServer() {
        try {
            // ���� ����
            socket = new Socket(ip, 4000);
            System.out.println("[Client]Server ���� ����!!");

            // ����� ��Ʈ�� ����
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            // ������ �α��� �޽��� ����
            out.println(id+"/"+"login");

            // �޽��� ������ ���� ������ ����
            thread = new Thread(this);
            thread.start();
        } catch(Exception e) {
            // e.printStackTrace();
            System.out.println("[MultiChatClient]connectServer() Exception �߻�!!");
        }
    }

    // �̺�Ʈ ó��
    public void actionPerformed(ActionEvent arg0) {
        Object obj = arg0.getSource();

        connectServer();
        
       /* // ���� ��ư ó��
        if(obj == exitButton) {
            System.exit(0);
        } else if(obj == loginButton) {
            id = idInput.getText();

            label2.setText("��ȭ�� : " + id);
            clayout.show(tab, "logout");
            connectServer();
        } else if(obj == logoutButton) {
            // �α׾ƿ� �޽��� ����
            outMsg.println(id + "/" + "logout");
            // ��ȭ â Ŭ����
*/            //msgOut.setText("");
            // �α��� �гη� ��ȯ
         //   clayout.show(tab, "login");
          //  out.close();
        if(obj == text_field) {
            // �޽��� ����
            out.println(id + "/" + text_field.getText());
            // �Է� â Ŭ����
            text_field.setText("");
        }
    }

    public void run() {
        // ���� �޽����� ó���ϴ� ����
        String msg;
        String[] rmsg;

        status = true;

        while(status) {
            try {
                // �޽��� ���Ű� �Ľ�
                msg = in.readLine();
                rmsg = msg.split("/");

                // JTextArea�� ���ŵ� �޽��� �߰�
                text_area.append(rmsg[0] + ">"+rmsg[1] + "\n");

                // Ŀ���� ���� ��ȭ �޽����� ǥ��
                text_area.setCaretPosition(text_area.getDocument().getLength());
            } catch(IOException e) {
                // e.printStackTrace();
                status = false;
            }
        }

        System.out.println("[MultiChatClient]" + thread.getName() + "�����");
    }

    public static void main(String[] args) {
    	Swing_Client mcc = new Swing_Client("127.0.0.1");
    }
}
	
