package Bank;

public class CheckingAccount extends BankAccount{
	private float servicecharge;

	public CheckingAccount() {
		super();
	}

	public CheckingAccount(String accountNum, float balance, float servicecharge) {
		super(accountNum, balance);
		this.servicecharge = servicecharge;
	}

	public float getServicecharge() {
		return servicecharge;
	}

	public void setServicecharge(float servicecharge) {
		this.servicecharge = servicecharge;
	}

	@Override
	public String toString() {
		return super.toString() + ",Fee=" + this.servicecharge;
	}
	
	public void assessFee(){
		super.setBalance(super.getBalance() - this.servicecharge);
	}

}
