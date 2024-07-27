package AbstractFactory;

public abstract class Pizza {
	String name;

	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;

	abstract void prepare();

	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("Ingredients\n");
		if (dough != null) {
			result.append("Tossing... " + dough);
			result.append("\n");
		}
		if (sauce != null) {
			result.append("Adding... " + sauce);
			result.append("\n");
		}
		if (cheese != null) {
			result.append("Adding... " + cheese);
			result.append("\n");
		}
		if (veggies != null) {
			result.append("Toppings... ");
			for (int i = 0; i < veggies.length; i++) {
				result.append(veggies[i]);
				if (i < veggies.length-1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (clam != null) {
			result.append("Adding... " + clam);
			result.append("\n");
		}
		if (pepperoni != null) {
			result.append("Adding... " + pepperoni);
			result.append("\n");
		}
		return result.toString();
	}
}
