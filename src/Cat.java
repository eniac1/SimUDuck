
public class Cat extends Animal {
	String name;
	
	public Cat(String catName) {
		name = catName;
	}
	
	public void makeSound() {
		meow();
	}
	
	public void meow() {
		System.out.println("Meow meow from " + name);
	}
}
