package Homework1911;

public class VirtualPerson {
	final private int tooCold = 65;
	private final int tooHot = 85;
	public int getTooCold() {
		return tooCold;
	}
	public int getTooHot() {
		return tooHot;
	}
	
	public void drinkCoffee(CoffeeCup cup) throws Exception {
		if (cup.getTemperature() >= tooHot) throw new TooHotException();
		if (cup.getTemperature() <= tooCold) throw new TooColdException();
		System.out.println("Good coffee");
	}
}
