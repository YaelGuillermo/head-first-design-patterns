package Strategy;

public class SimUDuck {

	public static void main(String[] args) {
		Duck rubberDuck = new RubberDuck();
		rubberDuck.display();
		rubberDuck.performQuack();
		rubberDuck.performFly();
		rubberDuck.setQuackBehavior(new MuteQuack());
		rubberDuck.performQuack();
		rubberDuck.setFlyBehavior(new FlyNoWay());
		rubberDuck.performFly();
		
		System.out.println("");
		Duck redheadDuck = new RedheadDuck();
		redheadDuck.display();
		redheadDuck.performQuack();
		redheadDuck.performFly();
		
		System.out.println("");
		Duck decoyDuck = new DecoyDuck();
		decoyDuck.display();
		decoyDuck.performFly();
		decoyDuck.performQuack();
		decoyDuck.setFlyBehavior(new FlyWithRockets());
		decoyDuck.setQuackBehavior(new Squeak());
		decoyDuck.performFly();
		decoyDuck.performQuack();
	}
}
