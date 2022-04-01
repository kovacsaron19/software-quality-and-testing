package ro.csie.cts.g1098.clean.code.stage6.models.product;

import ro.csie.cts.g1098.clean.code.stage3.ProductType;
import ro.csie.cts.g1098.clean.code.stage5.AccountMarketingStrategy;
import ro.csie.cts.g1098.clean.code.stage6.exceptions.MissingMarketingStrategyException;
import ro.csie.cts.g1098.clean.code.stage6.interfaces.MarketingStrategyInterface;

//stage 6 - DIP dependency inversion principle



public class DiscountStrategy {
	
	
	MarketingStrategyInterface accountDiscountStrategy;
	
	public void setAccountDiscountStrategy(MarketingStrategyInterface accountDiscountStrategy) {
		if(accountDiscountStrategy == null) {
			throw new MissingMarketingStrategyException();
		}
		this.accountDiscountStrategy = accountDiscountStrategy;
	}

	public float getPriceDiscount(float initialPrice, ProductType productType) {
		return initialPrice * productType.getDiscount();
	}
	
	public float getPriceWithDiscount(float initialPrice, ProductType productType) {
		return initialPrice - this.getPriceDiscount(initialPrice, productType);
	}
	
	
	public float getFinalPrice(ProductType productType, float productPrice, int accountAgeInYears)
	  {
	    float finalPrice = 0;
	    float accountDiscount = 0;
	    
	    if(productType != ProductType.NORMAL) {
	    	if(this.accountDiscountStrategy == null) {
	    		throw new MissingMarketingStrategyException();
	    	}
	    	accountDiscount = accountDiscountStrategy.getAccountDiscount(accountAgeInYears);
	    }
	    
	    finalPrice = (this.getPriceWithDiscount(productPrice, productType)) - accountDiscount * (productPrice - this.getPriceDiscount(productPrice, productType));
	    
//	    switch(productType) {
//	    case NORMAL:
//	    	finalPrice = productPrice;
//	    	break;
//	    case NEW:
//	    	finalPrice = (productPrice - (productType.getDiscount() * productPrice)) - accountDiscount * (productPrice - (productType.getDiscount() * productPrice));
//	    	break;
//	    case ON_SALE:
//	    	finalPrice = (productPrice - (productType.getDiscount() * productPrice)) - accountDiscount * (productPrice - (productType.getDiscount() * productPrice));
//	    	break;
//	    case FINAL_SALE:
//	    	finalPrice = (productPrice - (productType.getDiscount() * productPrice)) - accountDiscount * (productPrice - (productType.getDiscount() * productPrice));
//	    	break;
//	    	
//	    }
	    
	    return finalPrice;
	  }
}
