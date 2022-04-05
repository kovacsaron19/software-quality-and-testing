package ro.csie.cts.g1098.hw1.stage3;

public class AccountStage3 {
	public double loan_value, rate;	
	public int daysActive;
	public AccountType account_Type;
	public static final float BROKER_FEE = 0.125f;
	public static final int YEAR_DAYS = 365;
	
	public double getLoan() {
		return this.loan_value;
	}
	
	public double getRate() {
		return this.rate;
	}
	
	//must have method - the lead has requested it in all classes
	public double getMonthlyRate() {
		return loan_value*rate;
	}
	
	public void setValue(double value) throws Exception {
		if(value<0)
			throw new Exception();
		else
		{
			loan_value = value;
		}
	}
	
	@Override
	public String toString() {
		return "Loan: " + this.loan_value + "; rate: " + this.rate + "; days active:" + daysActive + "; Type: " + account_Type + ";";
	}
	
	public static double calculate(AccountStage3[] accounts)
	{
		double totalFee = 0.0;
		AccountStage3 account;
		for	(int i = 0; i<accounts.length; i++)	{
			account=accounts[i];
			if(account.account_Type==AccountType.PREMIUM||account.account_Type==AccountType.SUPER_PREMIUM)	
				totalFee+=BROKER_FEE	* (	//	1.25%	broker's	fee
						account.loan_value*Math.pow(account.rate,(account.daysActive/YEAR_DAYS)) - account.loan_value);	//	interest-principal
		}
		return totalFee;
	}

	public AccountStage3(double value, double rate, AccountType account_Type) throws Exception {
		this.setValue(value);
		this.rate = rate;
		this.account_Type = account_Type;
	}
	
	
}
