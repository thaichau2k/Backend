package OOP_review;

public class Cow extends Animal {
	
	private static int population;
	
	public void getPopulation() {
		super.getPopulation();
		System.out.println("Cow population: "+population);
	}
	public Cow(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		System.out.println("Create a cow!");
		population++;
	}
	
	public void makeASound() {
		System.out.print("Moo, ");
	}
	
	@Override
	public Cow giveBirth() {
		// TODO Auto-generated method stub
		return new Cow(this.getName()+"'s baby");
		
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
