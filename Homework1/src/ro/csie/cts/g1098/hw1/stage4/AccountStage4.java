package ro.csie.cts.g1098.hw1.stage4;

public class AccountStage4 {
	public double loan_value, rate;	
	public int daysActive;
	public AccountType account_Type;
	public AccountsFeeCalculator calculator;
	
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

	public AccountStage4(double value, double rate, AccountType account_Type) throws Exception {
		this.setValue(value);
		this.rate = rate;
		this.account_Type = account_Type;
	}
	
	
}
