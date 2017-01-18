package Day10;

class Animal{
	
	public String Scream(){
		return "���� �����Ҹ�";
	}
	public String getName(){
		return null;
	}
}

//������, �����, ȣ����

class Dog extends Animal{
	private String name;
	public Dog() {
		name = getClass().getSimpleName();
		
	}
	@Override
	public String Scream() {
		return "�۸۸�";
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
		return "�ľƿ�";
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
		return "ũ�ƾ�";
	}
	public String getName() {
		return name;
	}
	
}
class Hospital 
{
	public void inject(Animal animal)
	{
	System.out.println(animal.getName()+"�� ���."+animal.Scream());	
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
