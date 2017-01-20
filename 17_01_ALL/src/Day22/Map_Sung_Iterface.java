package Day22;

import java.io.IOException;

public interface Map_Sung_Iterface {

	public int insert() throws IOException;				//추가
	public int update() throws IOException;				//수정
	public void search() throws IOException;				//검색
	public int delete() throws IOException;				//삭제
	
	public void writeAll();								//전체 출력(학번순)
	public void writeSort();							//전체 출력(정렬)
	
}
