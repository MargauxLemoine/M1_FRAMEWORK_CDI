package fr.pantheonsorbonne.ufr27.miage.exercise.machines;

import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.ExpressoCoffee;

public class ExpressoMachine implements CoffeeMachine{
	public Coffee getCoffee() {
		return new ExpressoCoffee();
	}
}