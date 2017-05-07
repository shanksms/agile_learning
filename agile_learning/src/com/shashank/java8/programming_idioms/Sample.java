/**
 * 
 */
package com.shashank.java8.programming_idioms;

import java.util.Arrays;
import java.util.List;

/**
 * @author pooja
 *
 */
public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = Arrays.asList("Dory", "Gill", "Nemo");
		//below is imperative style of  coding
		
		boolean foundNemo = false;
		for (String name : names) {
			if (name.equals("Nemo")) {
				foundNemo = true;
				break;
			}
			
		}
		
		if (foundNemo) {
			System.out.println("Found Nemo");

		} else {
			System.out.println("Still Looking");

		}
		
		//Below is declarative style of coding
		if (names.contains("Nemo")) {
			System.out.println("Found Nemo");
		} else {
			System.out.println("Still Looking");
		}
		
	}

}
