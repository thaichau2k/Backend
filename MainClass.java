

public class MainClass {

	public static void main(String[] args) throws Exception {
		
		//Homework 1
		Employee e1 = new Employee("Chau","Nguyen",15000);
		Employee e2 = new Employee("Tam","Nguyen",50000);
		EmployeeWithBonus e3 = new EmployeeWithBonus(e2,123);
		
		System.out.println("First Name: "+e1.getFirstName());
		System.out.println("Last Name: "+e1.getLastName());
		System.out.println("Base Salary: "+e1.getBaseSalary()+"$");
		System.out.println(e1.getFirstName()+" earn: "+e1.earnings()+"$");
		
		System.out.println();
		
		System.out.println("First Name: "+e2.getFirstName());
		System.out.println("Last Name: "+e2.getLastName());
		System.out.println("Base Salary: "+e2.getBaseSalary()+"$");
		System.out.println("Bonus Salary: "+e3.getBonus()+"$");
		System.out.println(e2.getFirstName()+" earn: "+e3.earnings()+"$");
		
		System.out.println("---------------------------------");
		
		//Homework2
		Fee acc1 = new Fee(100);
		NickleNDime acc2 = new NickleNDime(15000);
		Gambler acc3 = new Gambler(20000);
		
		acc1.deposit(200);
		acc1.withdraw(123);
		System.out.println("Fee account:");
		acc1.endMonth();
		System.out.println();
		
		acc2.deposit(125000);
		acc2.withdraw(5400);
		acc2.withdraw(12000);
		System.out.println("NickleNDime account");
		acc2.endMonth();
		System.out.println();
		
		acc3.deposit(1000000);
		acc3.withdraw(89000);
		acc3.withdraw(675);
		acc3.withdraw(12000);
		System.out.println("Gambler account");
		acc3.endMonth();
		System.out.println();
	}

}
