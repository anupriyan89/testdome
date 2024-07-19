package com.testdome.sample;
public class GamePlatform {
    public static double calculateFinalSpeed(double initialSpeed, int[] inclinations) {
    	double result =  initialSpeed;
    	for (int i: inclinations) {
    		
    		if(i<0) {
    			result -= i;
    		} else if(i>0) {
    			result -= i;
    		}
    		if(result<=0) {
    			return 0;
    		}
    	}
    	return result;
       
    }

    public static void main(String[] args){
        System.out.println(calculateFinalSpeed(60.0, new int[] { 0, 30, 0, -45, 0 , 100}));
    }
}