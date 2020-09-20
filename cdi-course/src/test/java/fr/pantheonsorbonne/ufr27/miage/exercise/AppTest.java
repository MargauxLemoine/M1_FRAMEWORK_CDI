package fr.pantheonsorbonne.ufr27.miage.exercise;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.Coffee;
import fr.pantheonsorbonne.ufr27.miage.exercise.machines.BlackCoffeeMachine;
import fr.pantheonsorbonne.ufr27.miage.exercise.machines.CoffeeMachine;
import fr.pantheonsorbonne.ufr27.miage.exercise.machines.ExpressoMachine;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.BlackCoffee;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.BlackCoffeeFactory;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.Coffee;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.ExpressoCoffee;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.ExpressoCoffeeFactory;

public class AppTest {
	
	private final BlackCoffee BlackCoffee = new BlackCoffee();
	private final ExpressoCoffee ExpressoCoffee = new ExpressoCoffee();
	
	@Before
	public void setUp() {
		BlackCoffeeFactory.setBlackCoffee(BlackCoffee);
		ExpressoCoffeeFactory.setExpressoCoffee(ExpressoCoffee);
	}
	
	@After
	public void tearDown() {
		BlackCoffeeFactory.setBlackCoffee(null);
		ExpressoCoffeeFactory.setExpressoCoffee(null);
	}

	@Test
	public void testCase1() {

		try {
			
			
			Client client = new Client(-3);
			
			CoffeeMachine machine = null;
			
			if (client.getAwakenessLevel() > -15) {
				machine = new BlackCoffeeMachine();
			} else {
				machine = new ExpressoMachine();
			}
			
			Waiter waiter = new Waiter(BlackCoffee, ExpressoCoffee, machine);
			
			int profit = 3;

			while (!client.isAwake()) {
				Coffee coffee = waiter.serveCoffee();
				client.drink(coffee);
				profit -= 1;
			}

			assertTrue("we are loosing money", profit > 0);

		} catch (CoffeeOverLoadException e) {
			fail("Customer had too much coffee, went on a rampage in his first morning meeting");
		}

	}

	@Test
	public void testCase2() {

		try {

			Client client = new Client(-20);
			
CoffeeMachine machine = null;
			
			if (client.getAwakenessLevel() > -15) {
				machine = new BlackCoffeeMachine();
			} else {
				machine = new ExpressoMachine();
			}
			
			Waiter waiter = new Waiter(BlackCoffee, ExpressoCoffee, machine);
			
			int profit = 3;

			while (!client.isAwake()) {
				Coffee coffee = waiter.serveCoffee();
				client.drink(coffee);
				profit -= 1;
			}

			assertTrue("we are loosing money", profit > 0);

		} catch (CoffeeOverLoadException e) {
			fail("Customer had too much coffee, went on a rampage in his first morning meeting");
		}

	}

}
