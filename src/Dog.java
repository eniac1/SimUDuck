
public class Dog extends Animal {
	String name;
	public Dog (String dogName) {
		name = dogName;
	}
	
	public void makeSound() {
		bark();
	}
	
	public void bark() {
		System.out.println("Bau bau from " + name);
	}
}
