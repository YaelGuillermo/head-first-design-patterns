package Strategy;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior  = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a RubberDuck");
		
	}

}
