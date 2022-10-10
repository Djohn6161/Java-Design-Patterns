package decorator;

public class Cheese extends ToppingDecorator {
	public Cheese(Pizza pizza) {
		this.Lpizza = pizza;
	}
	public String getDescription() {
		return Lpizza.getDescription() + ", Cheese";
	}
	public double cost() {
		return Lpizza.cost();
	}
}
