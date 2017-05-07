/**
 * 
 */
package com.shashank.java8.programming_idioms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author pooja
 *
 */
public class PureClosures {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int[] factors = new int[]{2};
		Stream<Integer> stream = numbers.stream()
										.map(number -> number*factors[0]);
		
		//stream.forEach(System.out::println); 
		//below is a bad idea as it will change the value of factors[0]
		factors[0] = 1;
		stream.forEach(System.out::println);

	}

}
