package fr.pantheonsorbonne.ufr27.miage.exercise;

import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.BlackCoffee;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.BlackCoffeeFactory;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.Coffee;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.ExpressoCoffee;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.ExpressoCoffeeFactory;
import fr.pantheonsorbonne.ufr27.miage.exercise.machines.CoffeeMachine;

class Waiter {
	
	private final BlackCoffee c1;
	private final ExpressoCoffee c2;
	private final CoffeeMachine machine;
	
	public Waiter() {
		c1 = BlackCoffeeFactory.getBlackCoffee();
		c2 = ExpressoCoffeeFactory.getExpressoCoffee();
	}
	
	public Waiter(BlackCoffee BlackCoffee, ExpressoCoffee ExpressoCoffee, CoffeeMachine machine) {
		this.c1 = BlackCoffee;
		this.c2 = ExpressoCoffee;
		this.machine = machine;
	}


	public Coffee serveCoffee(Client client) {
		
		return machine.getCoffee();
	}

}