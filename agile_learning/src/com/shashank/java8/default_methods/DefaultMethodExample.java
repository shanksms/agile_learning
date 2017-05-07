/**
 * 
 */
package com.shashank.java8.default_methods;

/**
 * @author pooja
 *
 */
public class DefaultMethodExample implements A , B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DefaultMethodExample().method1();

	}

}

interface A {
	default void method1() {
		System.out.println("in interface A. Method 1");
	}
	
}

interface B {
	default void method() {
		System.out.println("in interface B. Method 1");
	}
}
