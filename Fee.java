
public class Fee extends Account {

	public Fee(double balance) throws Exception {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void endMonthCharge() {
		// TODO Auto-generated method stub
		this.balance-=5;
		if(balance<0) this.balance =0;
	}
	
}
