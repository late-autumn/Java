package Day18_member;

public class MemberVO {
	private String name;
	private String tel;
	private String addr;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean result = false;
		try{
		if(obj instanceof MemberVO){
			MemberVO rec = (MemberVO)obj;
			if(this.tel.equals(rec.getTel())&&this.name.equals(rec.getName()))
					result = true;

			}

		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	@Override
	public String toString() {
		//String str = 
		return "MemberVO [name=" + name + ", tel=" + tel + ", addr=" + addr + "]";
	}

	
}
