package com.cemserit.java8.functional_interface;

/**
 * Created by cemserit on 2019-08-14.
 */
@FunctionalInterface
// A functional interface can have only one method.
// If you have more than one method, you will get a compile error
interface FunctionalInterfaceExample {
	int square(int number);

	//int cube(int number);
}