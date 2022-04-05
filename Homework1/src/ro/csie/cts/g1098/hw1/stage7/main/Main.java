package ro.csie.cts.g1098.hw1.stage7.main;

import ro.csie.cts.g1098.hw1.stage7.models.AccountStage7;
import ro.csie.cts.g1098.hw1.stage7.models.AccountType;
import ro.csie.cts.g1098.hw1.stage7.models.AccountsFeeCalculator;

public class Main {

	public static void main(String[] args) throws Exception {
		AccountStage7 testAccount = new AccountStage7(1000, 3, AccountType.PREMIUM);
		AccountStage7 testAccount2 = new AccountStage7(900, 4, AccountType.SUPER_PREMIUM);
		AccountStage7 testAccount3 = new AccountStage7(400, 2, AccountType.STANDARD);
		
		testAccount.setDaysActive(10);
		testAccount2.setDaysActive(11);
		testAccount3.setDaysActive(12);
		
		AccountStage7[] accounts = {testAccount, testAccount2, testAccount3};
		double check = AccountsFeeCalculator.calculate(accounts);
		System.out.println("the total fees are: " + check);
		double test = Math.pow(testAccount.rate, (testAccount.daysActive / 365));
		System.out.println(test);
	}

}
