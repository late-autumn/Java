package Day17;

public class Test4 {
public static void main(String[] args) {
	
	char [] spell = new char[26];
	char start = 'A';
	
/*	for(int i=0; i<spell.length;i++)
	{
		spell[i] =' ';
		spell[i] = start;
		start++;
	}*/
	
	for(char a = 'A';a<='Z';a++)
	{
		spell[a-65] =start;
		start++;
		
		
	}
	
	for(int i=0; i<spell.length;i++)
	{
		System.out.print(spell[i]+" ");
	}
	
}
}
