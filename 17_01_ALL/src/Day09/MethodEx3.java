package Day09;

public class MethodEx3 {
	
	int var;
	
public int getVar() {
		return var;
	}

	public void setVar(int var) {
		this.var = var;
		var = var;	//�̷� ��쿣 �޼ҵ��� ����θ� �ν��ϰ� �ȴ�.
	}

public static void main(String[] args) {
	MethodEx3 ex = new MethodEx3();
	
	ex.setVar(1000);
	System.out.println(ex.getVar());
}
}
