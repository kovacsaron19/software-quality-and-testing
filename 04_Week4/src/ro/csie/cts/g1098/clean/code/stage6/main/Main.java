package ro.csie.cts.g1098.clean.code.stage6.main;

import ro.csie.cts.g1098.clean.code.stage3.ProductType;
import ro.csie.cts.g1098.clean.code.stage6.interfaces.MarketingStrategyInterface;
import ro.csie.cts.g1098.clean.code.stage6.models.marketing.AccountMarketingStrategy;
import ro.csie.cts.g1098.clean.code.stage6.models.product.DiscountStrategy;

public class Main {

	public static void main(String[] args) {
		DiscountStrategy product = new DiscountStrategy();
		MarketingStrategyInterface marketingStrategy = new AccountMarketingStrategy();
		product.setAccountDiscountStrategy(marketingStrategy);
		
		float finalPrice = product.getFinalPrice(ProductType.NORMAL, 1000, 10);
		System.out.println("Final price is " + finalPrice);
		
		product.setAccountDiscountStrategy(new SummerAccountMarketingStrategy());
		finalPrice = product.getFinalPrice(ProductType.NORMAL, 1000, 10);
		System.out.println("Final price is " + finalPrice);
	}

}
