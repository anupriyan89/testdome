package com.testdome.sample;

import java.util.HashSet;
import java.util.Set;

public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
    	Set<String> arrSet = new HashSet<>();
    	
    	for(String s1: names1) {
    		arrSet.add(s1);
    	}
    	for(String s2: names2) {
    		arrSet.add(s2);
    	}

//System.out.println("arrSet:" + arrSet );
    	
    	return arrSet.toArray(new String[arrSet.size()]);

    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}