package Day20;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) {

		FileWriter writer = null;

		try {
			// 파일에 한문자 단위로 기록할 수 있는 FileWriter 객체 생성
			writer = new FileWriter("c:/비둘기/song.txt");
			// writer는 문자열을 바로 기록할 수 있다.
			String str = "조팝나무는 세상에서 제일 강한 나무다.";
			writer.write(str);
			/*
			 * 한글자 단위로 읽고 쓸수 있는 Reader, Writer계열의 스트림의 내부적으로 버퍼에 저장한다. 저장된 버퍼는
			 * 버퍼가 가득 채워 질때만 스트림을 통해 밖으로 내보낸다. flush(): 버퍼가 가득차지 않아도 비우게 한다.
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
