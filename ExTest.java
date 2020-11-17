package Homework1911;

import java.util.Scanner;

public class ExTest {
	public static void main(String[] args) throws Exception {
		
		CoffeeCup cup = new CoffeeCup(100);	
		VirtualPerson p = new VirtualPerson();
		
		try {
			p.drinkCoffee(cup);
		} catch (TooHotException e) {
			System.out.println("Coffe too hot!!!");
		} catch (TooColdException e) {
			System.out.println("Coffe too cold!!!");
		} 
		
		System.out.println("-----------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		boolean loop= true;
		do {
			try {
				double a = scanner.nextDouble();
				double b = scanner.nextDouble();
				double c = scanner.nextDouble();
				QuadraticEquation f = new QuadraticEquation(a,b,c);
				f.solve();
			}
			catch(ArithmeticException e) {
				scanner.nextLine();
				System.out.println("a must not be equal to 0!");
			}
			catch(Exception e) {
				System.out.println("No solution!!!");
			}
		} while(loop);	
	}
}
