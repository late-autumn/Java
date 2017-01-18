package Day10;

class Animal{
	
	public String Scream(){
		return "µ¿¹° ¿ïÀ½¼Ò¸®";
	}
	public String getName(){
		return null;
	}
}

//°­¾ÆÁö, °í¾çÀÌ, È£¶ûÀÌ

class Dog extends Animal{
	private String name;
	public Dog() {
		name = getClass().getSimpleName();
		
	}
	@Override
	public String Scream() {
		return "¸Û¸Û¸Û";
	}
	public String getName() {
		return name;
	}
}
class Cat extends Animal{
	private String name;
	public Cat() {
		name = getClass().getSimpleName();
		
	}
	@Override
	public String Scream() {
		return "³Ä¾Æ¿Ë";
	}
	public String getName() {
		return name;
	}
}
class Tigger extends Animal{
	private String name;
	public Tigger() {
		name = getClass().getSimpleName();
		
	}
	@Override
	public String Scream() {
		return "Å©¾Æ¾Ó";
	}
	public String getName() {
		return name;
	}
	
}
class Hospital 
{
	public void inject(Animal animal)
	{
	System.out.println(animal.getName()+"ÀÌ ¿î´Ù."+animal.Scream());	
	}
}
public class HospitalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital hp = new Hospital();
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tigger = new Tigger();
		
		hp.inject(dog);
		hp.inject(cat);
		hp.inject(tigger);
	
			
	}
}
