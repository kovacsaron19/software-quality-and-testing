package ro.csie.cts.g1098.hw1.stage5;

import java.util.Arrays;
import java.util.List;

public class AccountsFeeCalculator {
	static AccountFeeStrategy accountFeeStrategy = null;
	
	public static double calculate(AccountStage5[] accounts)
	{
		double totalFee = 0.0;
		for	(int i = 0; i < accounts.length; i++)	{
			if(accounts[i].accountType == AccountType.PREMIUM || accounts[i].accountType == AccountType.SUPER_PREMIUM)	
				totalFee += accountFeeStrategy.getAccountFee(accounts[i]);
		}
		
		return totalFee;
	}
}
