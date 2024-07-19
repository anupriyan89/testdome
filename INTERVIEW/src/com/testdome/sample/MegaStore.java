package com.testdome.sample;

public class MegaStore {
	
	/*
	 * Standard Weight= any discount = 6%
	 * Seasonal Weight= any discount = 12%
	 * Weight Weight<= 10 discount = 6%
	 * Weight Weight > 10 discount = 18%   */

    public enum DiscountType {
        Standard,
        Seasonal,
        Weight;
    }
    
    public static double getDiscountedPrice(double cartWeight,
                                            double totalPrice,
                                            DiscountType discountType) {
       double result = 0.0;
       double rate = 0.0;
       if(discountType.equals(DiscountType.Standard)) {
    	   rate = .06;
       } else if (discountType.equals(DiscountType.Seasonal)) {
    	   rate = .12;
       } else if (discountType.equals(DiscountType.Weight) && cartWeight<= 10) {
    	   rate = .06;
       } else if (discountType.equals(DiscountType.Weight) && cartWeight > 10) {
    	   rate = .18;
       }
       
       result = totalPrice - (totalPrice * rate);
       
       return result;
    }
    
    public static void main(String[] args) {        
        System.out.println(getDiscountedPrice(12, 100, DiscountType.Weight));
    }
}