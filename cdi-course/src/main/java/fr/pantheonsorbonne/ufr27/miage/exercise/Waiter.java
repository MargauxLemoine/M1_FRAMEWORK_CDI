package fr.pantheonsorbonne.ufr27.miage.exercise;

import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.BlackCoffee;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.BlackCoffeeFactory;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.Coffee;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.ExpressoCoffee;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.ExpressoCoffeeFactory;
import fr.pantheonsorbonne.ufr27.miage.exercise.machines.CoffeeMachine;

class Waiter {
	
	private final CoffeeMachine machine;

	public Waiter(CoffeeMachine machine) {
		this.machine = machine;
	}


	public Coffee serveCoffee(Client client) {
		
		return machine.getCoffee();
	}

}