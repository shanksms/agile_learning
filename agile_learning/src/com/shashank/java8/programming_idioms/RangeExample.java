/**
 * 
 */
package com.shashank.java8.programming_idioms;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author pooja
 *
 */
public class RangeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5 exclusive
		IntStream.range(1, 5)
		         	 
				 .forEach(e -> System.out.println(e));
		//5 inclusive
		IntStream.rangeClosed(1, 5)
		
				 .forEach(System.out::println);

	}

}
