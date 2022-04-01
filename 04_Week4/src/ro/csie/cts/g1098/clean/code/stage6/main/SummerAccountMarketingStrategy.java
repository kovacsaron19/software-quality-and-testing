package ro.csie.cts.g1098.clean.code.stage6.main;

import ro.csie.cts.g1098.clean.code.stage6.interfaces.MarketingStrategyInterface;

public class SummerAccountMarketingStrategy implements MarketingStrategyInterface{

	@Override
	public float getAccountDiscount(int accountAgeInYears) {
		return 0.2f;
	}
	

}
