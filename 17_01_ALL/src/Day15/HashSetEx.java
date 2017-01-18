package Day15;

import java.util.*;
import static java.lang.System.out;
class AData{
	int x,y;

 public AData(int x, int y) {
	// TODO Auto-generated constructor stub
	 this.x = x; 
	 this.y = y;
}
 public void dispoit(){
	out.println("x="+x+"y="+y);
 }


}
public class HashSetEx {
public static void main(String[] args) {
	
	AData ap = new AData(10, 20);
	AData bp = new AData(20, 30);
	AData cp = new AData(30, 40);
	
	HashSet hs= new HashSet<>();
	
	hs.add(ap);
	hs.add(bp);
	hs.add(cp);
	System.out.println("해시코드:"+hs.hashCode());
	System.out.println("사이즈는:"+hs.size());
	Iterator it = hs.iterator();
	while(it.hasNext())
		((AData)it.next()).dispoit();
	
	
}
}
