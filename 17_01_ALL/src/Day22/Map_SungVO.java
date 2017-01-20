package Day22;

public class Map_SungVO {

	private String name;
	private String hak;
	private int kor;
	private int mat;
	private int eng;
	private int tot;
	
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
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
		return eng+kor+mat;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = String.format("%7s %10s %4d %4d %4d %4d %6.1f",
				hak,name,kor,eng,mat,getTot(),(double)getTot()/3);
		return str;		
	}
	
	
	
}
