/**
 * 
 */
package com.shashank.java8.programming_idioms;


interface Expression<T, R> {
	
	T x(R i);
	
}

/**
 * @author pooja
 *
 */
public class FunctionalInterface {
	
	public static String compute(int i, Expression<String, Integer> expr) {
		return expr.x(i);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compute(2, x -> "String Representaion " + x));

	}

}
