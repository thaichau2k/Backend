package OOP_review;

public class Dog extends Animal {
	
	private static int population;

	public void getPopulation() {
		super.getPopulation();
		System.out.println("Cow population: "+population);
	}

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		System.out.println("Create a dog!");
		population++;
	}

	@Override
	public void makeASound() {
		// TODO Auto-generated method stub
		System.out.print("Woof Woof, ");
	}

	@Override
	public Dog giveBirth() {
		// TODO Auto-generated method stub
		 return new Dog(this.getName()+"'s baby");
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

}
