/**
 * 
 */
package com.shashank.java8.programming_idioms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author pooja
 *
 */
public class PipelinePattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		List<Person> persons = createPeople();
		List<String> names = persons.stream()
			   .filter(person -> person.getGender() == Gender.FEMALE)
			   .filter(person -> person.getAge() >= 32)
			   .map(person -> person.getName())
			   .map(name -> name.toUpperCase())
			   .collect(Collectors.toList());
		System.out.println(names);

	}
	
	private static List<Person> createPeople() {
		return Arrays.asList(
			new Person("Sara", 12, Gender.FEMALE),
			new Person("Paula", 32, Gender.FEMALE));
	}

}

