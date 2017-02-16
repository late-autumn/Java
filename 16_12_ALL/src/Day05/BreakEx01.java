package Day05;

public class BreakEx01 {
	public static void main(String[] args) {

		int i = 0;
		while (i < 100) {

			System.out.print(i+" ");
			if (i == 20){
				break;
			}
			i++;
		}
	}
}
