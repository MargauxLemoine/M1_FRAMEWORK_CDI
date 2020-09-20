package fr.pantheonsorbonne.ufr27.miage.exercise.coffee;

public class BlackCoffeeFactory {
	
	private static BlackCoffee BlackCoffee;
	
	public static void setBlackCoffee(BlackCoffee BlackCoffee) {
		this.BlackCoffee = BlackCoffee;
	}
	
	public static BlackCoffee getBlackCoffee() {
		if (BlackCoffee == null) {
			return new BlackCoffee();
		}
		return BlackCoffee;
	}
}