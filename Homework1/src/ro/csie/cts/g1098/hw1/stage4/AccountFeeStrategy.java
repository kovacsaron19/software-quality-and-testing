package ro.csie.cts.g1098.hw1.stage4;

public class AccountFeeStrategy {
	public static final float BROKER_FEE = 0.125f;
	public static final int YEAR_DAYS = 365;
	
	public double getAccountFee(AccountStage4 account) {
		return BROKER_FEE * (
				account.loan_value * Math.pow(account.rate, (account.daysActive / YEAR_DAYS)) - account.loan_value);	//	interest-principal
	}
}
