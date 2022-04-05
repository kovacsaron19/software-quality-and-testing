package ro.csie.cts.g1098.hw1.stage6;

public class AccountFeeStrategy {
	public static final float BROKER_FEE = 0.125f;
	public static final int YEAR_DAYS = 365;
	
	public double getAccountFee(AccountStage6 account) {
		return BROKER_FEE * (
				account.loanValue * Math.pow(account.rate, (account.daysActive / YEAR_DAYS)) - account.loanValue);	//	interest-principal
	}
}
