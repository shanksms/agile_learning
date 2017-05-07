/**
 * 
 */
package com.shashank.java8.programming_idioms;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author pooja
 *
 */
public class CascadingLambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		/*Function<Integer, Predicate<Integer>> isGT = (Integer pivot) -> {
			Predicate<Integer> predicate = number -> number > pivot;
			return predicate;
		};*/
		//below is concise form of above code
		Function<Integer, Predicate<Integer>> isGT = pivot ->  number -> number > pivot;
		
		Predicate<Integer> isGt3 = isGT.apply(3);
		Predicate<Integer> isGt4 = isGT.apply(4);
		
		numbers1.stream()
			   .filter(isGt3)
			   .forEach(System.out::println);
		
		numbers2.stream()
		   .filter(isGt3)
		   .forEach(System.out::println);
	
		numbers1.stream()
		.filter(isGt4)
		.forEach(System.out::println);
		
		numbers2.stream()
		.filter(isGt4)
		.forEach(System.out::println);
		
		
		
	}

	

}
