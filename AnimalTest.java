package OOP_review;

public class AnimalTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Cat c1 = new Cat("Leo");
		Dog d1 = new Dog("Tom");
		Cow c2 = new Cow("Huy");
		Dog d2 = new Dog("Alex");
		
		c1.introduce();
		c2.introduce();
		d1.introduce();
		d2.introduce();
		Cat a1 = c1.giveBirth();
		Cat a2 = c1.giveBirth();
		Cat a3 = c1.giveBirth();
		c1.getPopulation();
		c2.getPopulation();
		d2.getPopulation();
		a1.introduce();
		a2.introduce();
		a3.introduce();
		
		a3.finalize();
		c1.getPopulation();
	}

}
