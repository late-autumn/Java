package NT_Day4;
import java.util.*;
public class ChattingClientThread extends Thread{

	ChattingClient cc = null;
	
	public ChattingClientThread(ChattingClient cc) {
		// TODO Auto-generated constructor stub
		
		this.cc=cc;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		String message = null;
		boolean isStop = false;
		
		while(!isStop){
			
			try{
			message = (String)cc.ois.readObject();
			StringTokenizer st = null;
			
			int protocol = 0;			//100,200,300,400,500
			
			if(message!=null){			//�޼����� �������
				
				st = new StringTokenizer(message, "#");
				protocol = Integer.parseInt(st.nextToken()); 
			}
			
			switch(protocol){
			
			 //��ȭ��
			case Protocol.ROOM_IN:{
				String nickName = st.nextToken();
				Vector<String> v = new Vector<>();
				v.add(nickName);
				cc.dtm.addRow(v);
				cc.jta_display.append(nickName+"���� ���� �ϼ̽��ϴ�.");
				cc.jta_display.setCaretPosition(cc.jta_display.getDocument().getLength());
			}
			break;
			
			case Protocol.MESSAGE:{
			
				String nickName = st.nextToken(); //��ȭ��
				String msg = st.nextToken();
				cc.jta_display.append("["+nickName+"]"+msg+"\n");
				cc.jta_display.setCaretPosition(cc.jta_display.getDocument().getLength());
				
			}
			break;
			
			case Protocol.CHANGE:{
				String nickName = st.nextToken();
				String afterName = st.nextToken();
				
				//��ȭ�� �������� ���� ���̺��� ������ ��ȭ���� ���� 
				for(int i=0; i< cc.dtm.getRowCount();i++){
					
					String n1 = (String)cc.dtm.getValueAt(i, 0);
					
					//������ ��ȭ������ ���̺� ���� ��ȭ�� ����
					if(n1.equals(nickName)){
						cc.dtm.setValueAt(afterName, i, 0);
						break;
					}
					
					cc.jta_display.append(nickName+"����"+afterName+"������ ����Ǿ����ϴ�.");
					cc.jta_display.setCaretPosition(cc.jta_display.getDocument().getLength());
					
					//ä�� �˾�â�� Ÿ��Ʋ �濡�� ��ȭ�� ����
					if(nickName.equals(cc.nickName)){
						cc.setTitle(afterName+"���� ��ȭâ");
						cc.nickName = afterName;
					}
				}
			}
			break;
			
			//�ӼӸ�
			case Protocol.WHISPER :{	
				String nickName = st.nextToken();
				String otherName = st.nextToken();
				String msg = st.nextToken();
				
				cc.jta_display.append(nickName+"����"+otherName+"�Կ���"+msg+"\n");
				cc.jta_display.setCaretPosition(cc.jta_display.getDocument().getLength());
				
			}
			break;
			
			//��ȭ�� ���� 
			case Protocol.ROOM_OUT : { 
				String name = st.nextToken();
				cc.jta_display.append(name+"���� ���� �ϼ̽��ϴ�.\n");
				cc.jta_display.setCaretPosition(cc.jta_display.getDocument().getLength());
				
				for(int i=0; i<cc.dtm.getRowCount();i++){
					String n1 = (String)cc.dtm.getValueAt(i, 0);
					
					if(name.equals(n1)){
						cc.dtm.removeRow(i);
						break;
					}
				}
				
			}
			break;
			
			}//end switch
		}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	
}
