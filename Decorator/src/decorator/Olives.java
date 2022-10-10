package decorator;

public class Olives extends ToppingDecorator {

	public Olives(Pizza pizza) {
		this.Lpizza = pizza;
	}
	public String getDescription() {
		return Lpizza.getDescription() + ", Olives";
	}
	public double cost() {
		return Lpizza.cost();
	}
}
