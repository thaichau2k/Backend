package OOP_review;

public class Cat extends Animal {
	
	private static int population;
	public void getPopulation() {
		super.getPopulation();
		System.out.println("Cat population: "+population);
	}

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		System.out.println("Create a cat!");
		population++;
	}

	public void makeASound() {
		System.out.print("Meow Meow, ");
	}

	@Override
	protected void finalize() throws Throwable
	{
	    try{
	        population--;
	    }catch(Throwable t){
	        throw t;
	    }finally{
	        super.finalize();
	    }
	}

	@Override
	public Cat giveBirth() {
		return new Cat(this.getName()+"'s baby");
	}

}
