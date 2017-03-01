package com.liferay.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;

public class ArrayReverse {

	public static void main(String[] args) {

		//way1
		//The time complexity of this algorithm is O(n/2) which is O(N) because we are iterating over array till midpoint only. 
		//This should be your solution on interviews, rest of two methods are for practical use purpose.
		String[] animals = { "dog", "cat", "pig" };

		for (int i = 0; i < animals.length / 2; i++) {
			String temp = animals[i];
			animals[i] = animals[animals.length - i - 1];
			animals[animals.length - i - 1] = temp;
		}
		
		
		//way2  Collections
		List<String> lAnimals=Arrays.asList(animals);
		
		Collections.reverse(lAnimals);
		
		ArrayUtils.reverse(animals);
		 
		//way3 commons-lang3-3.4.jar
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}
	}

}
