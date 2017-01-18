package Day20;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) {

		FileWriter writer = null;

		try {
			// ���Ͽ� �ѹ��� ������ ����� �� �ִ� FileWriter ��ü ����
			writer = new FileWriter("c:/��ѱ�/song.txt");
			// writer�� ���ڿ��� �ٷ� ����� �� �ִ�.
			String str = "���˳����� ���󿡼� ���� ���� ������.";
			writer.write(str);
			/*
			 * �ѱ��� ������ �а� ���� �ִ� Reader, Writer�迭�� ��Ʈ���� ���������� ���ۿ� �����Ѵ�. ����� ���۴�
			 * ���۰� ���� ä�� ������ ��Ʈ���� ���� ������ ��������. flush(): ���۰� �������� �ʾƵ� ���� �Ѵ�.
			 */

			writer.flush();

		} catch (FileNotFoundException fe) {
			// TODO: handle exception
			fe.getMessage();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
