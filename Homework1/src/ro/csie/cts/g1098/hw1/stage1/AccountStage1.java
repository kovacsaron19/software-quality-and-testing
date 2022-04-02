package ro.csie.cts.g1098.hw1.stage1;

public class AccountStage1 {
	public double loan_value, rate;	
	public int daysActive, account_Type;
	public static final int	STANDARD=0,BUDGET=1,PREMIUM=2,SUPER_PREMIUM=3;
	public static final float BROKER_FEE = 0.125f;
	public static final int YEAR_DAYS = 365;
	
	public double loan() {
		System.out.println("The loan value is " + this.loan_value);
		return loan_value;
	}
	
	public double getRate() {
		System.out.println("The rate is "+rate);
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
	
	public String to_string() {
		return "Loan: "+this.loan_value+"; rate: "+this.rate+"; days active:"+daysActive+"; Type: "+account_Type+";";
	}
	
	public void print() {
		System.out.println("This is an account");
	}

	public static double calculate(AccountStage1[] accounts)
	{
		double totalFee=0.0;
		AccountStage1 account;
		for	(int i=0;i<accounts.length;i++)	{
		account=accounts[i];
		if(account.account_Type==AccountStage1.PREMIUM||account.account_Type==AccountStage1.SUPER_PREMIUM)	
			totalFee+=BROKER_FEE	* (	//	1.25%	broker's	fee
					account.loan_value*Math.pow(account.rate,(account.daysActive/YEAR_DAYS)) - account.loan_value);	//	interest-principal
		}
		return totalFee;
	}

	public AccountStage1(double value, double rate, int account_Type) throws Exception {
		if(value<0)
			throw new Exception();
		else
		{
			loan_value = value;
		}
		this.rate = rate;
		this.account_Type = account_Type;
	}
	
	
}
