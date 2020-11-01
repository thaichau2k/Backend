
public class NickleNDime extends Account {
	
	private int withdrawCount;

	public NickleNDime(double balance) throws Exception {
		super(balance);
		// TODO Auto-generated constructor stub
		this.withdrawCount=0;
	}
	
	@Override
	public void withdraw(double amount) {
		if(balance < amount)  System.out.println("Withdraw amount must < balance");
		else {
		this.setWithdrawCount(this.getWithdrawCount() + 1);
		this.balance-=amount;
		this.transactions++;
		}
	}

	@Override
	public void endMonthCharge() {
		// TODO Auto-generated method stub
		this.balance-=(this.getWithdrawCount()*0.5);
		if(balance<0) this.balance=0;
	}

	public int getWithdrawCount() {
		return withdrawCount;
	}

	public void setWithdrawCount(int withdrawCount) {
		this.withdrawCount = withdrawCount;
	}

}
