package Day22;

import java.io.IOException;

public interface Map_Sung_Iterface {

	public int insert() throws IOException;				//�߰�
	public int update() throws IOException;				//����
	public void search() throws IOException;				//�˻�
	public int delete() throws IOException;				//����
	
	public void writeAll();								//��ü ���(�й���)
	public void writeSort();							//��ü ���(����)
	
}
