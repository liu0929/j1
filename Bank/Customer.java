package Bank;

public class Customer {
	private String ssn;
	private String name;
	private CheckingAccount ca;
	private SavingsAccount sa;
	
	public Customer() {
		super();
	}

	public Customer(String ssn, String name, CheckingAccount ca, SavingsAccount sa) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.ca = ca;
		this.sa = sa;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CheckingAccount getCa() {
		return ca;
	}

	public void setCa(CheckingAccount ca) {
		this.ca = ca;
	}

	public SavingsAccount getSa() {
		return sa;
	}

	public void setSa(SavingsAccount sa) {
		this.sa = sa;
	}

	@Override
	public String toString() {
		String msg = "";
		msg = "ssn=" + this.ssn + "\n";
		msg += "name=" + this.name + "\n";
		msg += "CheckingAccount=" + this.ca.toString() + "\n";
		msg += "CheckingAccount=" + this.sa.toString() + "\n";
		return msg;
	}
	

}
