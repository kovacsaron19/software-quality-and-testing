package ro.csie.cts.g1098.hw1.stage7.models;

import ro.csie.cts.g1098.hw1.stage7.exceptions.NegativeLoanValueException;
import ro.csie.cts.g1098.hw1.stage7.interfaces.MonthlyRateCalculatable;

public class AccountStage7 implements MonthlyRateCalculatable{
	public double loanValue, rate;	
	public int daysActive;
	public AccountType accountType;
	public AccountsFeeCalculator calculator;
	
	public double getLoan() {
		return this.loanValue;
	}
	
	public double getRate() {
		return this.rate;
	}
	
	//must have method - the lead has requested it in all classes
	@Override
	public double getMonthlyRate() {
		return loanValue * rate;
	}
	
	public void setValue(double value) throws Exception {
		if(value<0)
			throw new NegativeLoanValueException();
		else
		{
			this.loanValue = value;
		}
	}
	
	public void setDaysActive(int daysActive) {
		if(daysActive<0)
			throw new NegativeLoanValueException();
		else
		{
			this.daysActive = daysActive;
		}
	}

	@Override
	public String toString() {
		return "Loan: " + this.loanValue + "; rate: " + this.rate + "; days active:" + daysActive + "; Type: " + accountType + ";";
	}

	public AccountStage7(double value, double rate, AccountType accountType) throws Exception {
		this.setValue(value);
		this.rate = rate;
		this.accountType = accountType;
	}
	
	
}
