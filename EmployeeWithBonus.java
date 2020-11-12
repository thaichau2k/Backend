
public class EmployeeWithBonus {
	
	private Employee eWithBonus;
	private double bonus;
	
	public EmployeeWithBonus(Employee eWithBonus, double bonus) {
		this.eWithBonus = eWithBonus;
		setBonus(bonus);
		
	}
	
	
	public double getBonus() {
		return bonus;
	}
	
	public double earnings() {
		return eWithBonus.getBaseSalary()+bonus;
	}

	public void setBonus(double bonus) {
		if(bonus>0) {
		this.bonus = bonus;
		return;}
		throw  new IllegalArgumentException("Bonus salary must > 0");
	}

}
