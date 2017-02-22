package Day10;

class Animal{
	
	public String Scream(){
		return "동물 울음소리";
	}
	public String getName(){
		return null;
	}
}

//강아지, 고양이, 호랑이

class Dog extends Animal{
	private String name;
	public Dog() {
		name = getClass().getSimpleName();
		
	}
	@Override
	public String Scream() {
		return "멍멍멍";
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
		return "냐아옹";
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
		return "크아앙";
	}
	public String getName() {
		return name;
	}
	
}
class Hospital 
{
	public void inject(Animal animal)
	{
	System.out.println(animal.getName()+"이 운다."+animal.Scream());	
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
