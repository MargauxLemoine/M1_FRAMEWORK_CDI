package fr.pantheonsorbonne.ufr27.miage.exercise;

import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.BlackCoffee;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.BlackCoffeeFactory;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.Coffee;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.ExpressoCoffee;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.ExpressoCoffeeFactory;

class Waiter {
	
	private final BlackCoffee c1;
	private final ExpressoCoffee c2;
	
	public Waiter() {
		c1 = BlackCoffeeFactory.getBlackCoffee();
		c2 = ExpressoCoffeeFactory.getExpressoCoffee();
	}
	
	public Waiter(BlackCoffee BlackCoffee, ExpressoCoffee ExpressoCoffee) {
		this.c1 = BlackCoffee;
		this.c2 = ExpressoCoffee;
	}


	public Coffee serveCoffee(Client client) {
		
		if (client.getAwakenessLevel() + Math.max(c1.caffeineLevel(), c2.caffeineLevel()) <= 6)
			return c1.caffeineLevel() > c2.caffeineLevel() ? c1 : c2;
		else
			return c1.caffeineLevel() < c2.caffeineLevel() ? c1 : c2;
	}

}