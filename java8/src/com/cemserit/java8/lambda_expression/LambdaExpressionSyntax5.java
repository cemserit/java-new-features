package com.cemserit.java8.lambda_expression;

/**
 * Created by cemserit on 2019-08-14.
 */

interface Hello {
	void displayHelloWorld();
}

public class LambdaExpressionSyntax5 {
	public static void main(String[] args) {
		Hello helloInterFace = new Hello() {
			@Override
			public void displayHelloWorld() {
				System.out.println("Hello World!");
			}
		};

		helloInterFace.displayHelloWorld();

		//Lambda
		HelloInterFace hello = () -> System.out.println("Hello World!");
		hello.displayHelloWorld();
	}
}

