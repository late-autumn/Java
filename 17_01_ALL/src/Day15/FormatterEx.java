package Day15;

import java.util.Formatter;

public class FormatterEx {
public static void main(String[] args) {
	
	Formatter f = new Formatter();
	f.format("%1$b,%3$h,%2$5s",null,5,"a");
	System.out.println(f.toString());
}
}
