package Day17;

public class ScoreVO {

	//이름, 학번, 생년월일, 국어, 영어, 수학, 합계
	
	private String hak,name, birth;
	private int kor, eng, mat, tot;
	
	
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


	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMat() {
		return mat;
	}


	public void setMat(int mat) {
		this.mat = mat;
	}


	public int getTot() {
		tot = kor+eng+mat;
		return tot;
	}


	@Override
	public String toString() {
		return "ScoreVO [hak=" + hak + ", name=" + name + ", birth=" + birth + ", kor=" + kor + ", eng=" + eng
				+ ", mat=" + mat + ", tot=" + getTot() + ", avg=" + (float)getTot()/3 + "]";
	}
	
	
	
	
}
