package ro.csie.cts.g1098.clean.code.stage3;

import ro.csie.cts.g1098.clean.code.stage3.ProductType;
import ro.csie.cts.g1098.clean.code.stage5.AccountMarketingStrategy;

//stage 5 - outsource the implementation of the account discount computation
//outsource the computation of the discount value
//outsource the computation of the price with discount


public class DiscountStrategy {
	
	
	AccountMarketingStrategy accountDiscountStrategy = null;
	
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
