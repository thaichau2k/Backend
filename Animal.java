package OOP_review;

public abstract class Animal {
	private String name;
	private static int population;

	public void getPopulation() {
		System.out.println("All animal population: "+population);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal(String name) {
		super();
		this.name = name;
		population++;
	}
	
	public abstract void makeASound();
	
	public void introduce() {
		makeASound();
		System.out.println("I'm "+this.getName());
	}
	
	public abstract Animal giveBirth();
	
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
