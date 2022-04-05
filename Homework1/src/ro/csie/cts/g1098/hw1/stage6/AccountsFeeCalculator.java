package ro.csie.cts.g1098.hw1.stage6;

public class AccountsFeeCalculator {
	static AccountFeeStrategy accountFeeStrategy = null;
	
	public static double calculate(AccountStage6[] accounts)
	{
		double totalFee = 0.0;
		for	(int i = 0; i < accounts.length; i++)	{
			if(accounts[i].accountType == AccountType.PREMIUM || accounts[i].accountType == AccountType.SUPER_PREMIUM)	
				totalFee += accountFeeStrategy.getAccountFee(accounts[i]);
		}
		
		return totalFee;
	}
}
