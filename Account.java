
public abstract class Account {
	protected double balance;
	protected int transactions;
	
	
	public Account(double balance) throws Exception {
		if(balance < 0) throw new Exception("Balance must be positive");
			this.balance = balance;
			this.transactions = 0;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance>=0) 
		this.balance = balance;
		else throw new IllegalArgumentException("Balance must be positive");
	}
	public int getTransactions() {
		return transactions;
	}
	public void setTransactions(int transactions) {
		this.transactions = transactions;
	}
	
	public void deposit(double amount) {
		this.balance+=amount;
		this.transactions++;
	}
	
	public void withdraw(double amount) {
		if(amount<=balance) {
			this.balance-=amount;
			this.transactions++;
		}
		else System.out.println("Withdraw amount must < balance");
	}
	
	public abstract void endMonthCharge();
	
	public void endMonth() {
		endMonthCharge();
		System.out.println("Balance: "+this.balance+"$");
		System.out.println("Month transactions: "+this.transactions);
		this.transactions=0;
	}
}
