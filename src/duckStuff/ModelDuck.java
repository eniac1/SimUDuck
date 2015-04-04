package duckStuff;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBeahavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}

}
