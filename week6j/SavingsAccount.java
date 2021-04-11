package Bank;

public class SavingsAccount extends BankAccount{
	private float interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(String accountNum, float balance, float interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return super.toString() + ",rate=" + this.interestRate;
	}
	
	public void payinterest(){
		super.setBalance(super.getBalance()*(1 + this.interestRate));
	}

}
