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
public class LambdaAsGlue {
	
	public static void main(String[] args) {
		
		List<Person> people = createPeople();
		
		//Below is wrong way to code lambda
		people.forEach(person -> {
			if(person.getGender() == Gender.FEMALE || person.getGender() == Gender.MALE && person.getAge() > 18) {
				System.out.println(person.getName().toUpperCase());
			}
		});
		
		//below is right way to code lambda
		
		people.stream()
		      .filter(LambdaAsGlue::isMaleOrFemaleOverNumberOfYears)
		      .map(Person::getName)
		      .map(String::toUpperCase)
		      .forEach(System.out::println);
	}
	
	private static List<Person> createPeople() {
		return Arrays.asList(
				new Person("Sara", 12, Gender.FEMALE),
				new Person("Paula", 32, Gender.FEMALE));
	}
	
	public static boolean isMaleOrFemaleOverNumberOfYears(Person person) {
		
		return person.getGender() == Gender.FEMALE || person.getGender() == Gender.MALE && person.getAge() > 18;
		
	}

}
