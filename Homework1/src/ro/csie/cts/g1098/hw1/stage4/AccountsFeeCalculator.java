package ro.csie.cts.g1098.hw1.stage4;

import java.util.Arrays;
import java.util.List;

public class AccountsFeeCalculator {
	static AccountFeeStrategy accountFeeStrategy = null;
	
	public static double calculate(AccountStage4[] accounts)
	{
		double totalFee = 0.0;
		for	(int i = 0; i < accounts.length; i++)	{
			if(accounts[i].account_Type==AccountType.PREMIUM || accounts[i].account_Type==AccountType.SUPER_PREMIUM)	
				totalFee += accountFeeStrategy.getAccountFee(accounts[i]);
		}
		
		return totalFee;
	}
}
