package Day22;

import java.util.*;

class SungRec{

	private String name;
	private int tot;
	private int kor;
	private	int mat;
	private int eng;
	
	public SungRec() {
		// TODO Auto-generated constructor stub
	}
	
	public SungRec(String name, int kor, int mat, int eng) {
		this.name = name;
		this.kor =kor;
		this.mat = mat;
		this.eng = eng;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}
	

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = kor+eng+mat;
	}

}


public class TreeMapEx2 {

	public static void main(String[] args) {
	
		TreeMap<String,SungRec> map = new TreeMap<>();
		
		map.put("3333", new SungRec("홍길동",10,20,30));
		map.put("1111", new SungRec("김유신",20,30,40));
		map.put("5555", new SungRec("강감찬",50,80,30));
		map.put("2222", new SungRec("임꺽정",50,60,30));
		map.put("4444", new SungRec("이순신",30,90,30));
		
		//키 순서로 정렬
		
		String key;
		Set set = map.keySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()){
			
			key = (String)it.next();
			
			SungRec data = map.get(key);
			System.out.printf("%7s %10s %4d %4d %4d %d\n",key,data.getName(),
					data.getKor(),data.getEng(),data.getMat(),data.getTot());
		}
		
	}
}
