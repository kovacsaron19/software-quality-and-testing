package ro.csie.cts.g1098.clean.code.stage5;

import ro.csie.cts.g1098.clean.code.stage3.ProductType;

//stage 1 - refactor it by using a proper naming convention


public class DiscountStrategy {
	
	public final static int PREMIUM_ACCOUNT_MIN_AGE = 10;
	public final static float PREMIUM_DISCOUNT = 0.15f;
	
	
	public float getFinalPrice(ProductType productType, float productPrice, int accountAgeInYears)
	  {
	    float finalPrice = 0;
	    float accountDiscount = (accountAgeInYears > PREMIUM_ACCOUNT_MIN_AGE) ? PREMIUM_DISCOUNT : (float)accountAgeInYears/100; 
	    
	    switch(productType) {
	    case NORMAL:
	    	finalPrice = productPrice;
	    	break;
	    case NEW:
	    	finalPrice = (productPrice - (productType.getDiscount() * productPrice)) - accountDiscount * (productPrice - (productType.getDiscount() * productPrice));
	    	break;
	    case ON_SALE:
	    	finalPrice = (productPrice - (productType.getDiscount() * productPrice)) - accountDiscount * (productPrice - (productType.getDiscount() * productPrice));
	    	break;
	    case FINAL_SALE:
	    	finalPrice = (productPrice - (productType.getDiscount() * productPrice)) - accountDiscount * (productPrice - (productType.getDiscount() * productPrice));
	    	break;
	    	
	    }
	    
	    return finalPrice;
	  }
}
