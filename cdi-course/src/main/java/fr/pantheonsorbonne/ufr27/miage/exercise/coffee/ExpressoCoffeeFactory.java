package fr.pantheonsorbonne.ufr27.miage.exercise.coffee;

public class ExpressoCoffeeFactory {
	
	private static ExpressoCoffee ExpressoCoffee;
	
	public static void setExpressoCoffee(ExpressoCoffee ExpressoCoffee) {
		this.ExpressoCoffee = ExpressoCoffee;
	}
	
	public static ExpressoCoffee getExpressoCoffee() {
		if (ExpressoCoffee == null) {
			return new ExpressoCoffee();
		}
		return ExpressoCoffee;
	}
}