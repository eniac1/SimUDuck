package duckStuff;

public abstract class Duck {
	FlyBehavior flyBeahavior;
	QuackBehavior quackBehavior;
	public Duck() {
		
	}
	
	public abstract void display();
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBeahavior.fly();
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBeahavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
}
