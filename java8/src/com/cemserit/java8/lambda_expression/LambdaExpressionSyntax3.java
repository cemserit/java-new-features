package com.cemserit.java8.lambda_expression;

/**
 * Created by cemserit on 2019-08-14.
 */
interface DisplayInterface {
	void displayJavaVersion();
}

public class LambdaExpressionSyntax3 {
	public static void main(String[] args) {
		displayJavaVersion();

		//lambda syntax
		DisplayInterface javaVersion = () -> System.out.println(System.getProperty("java.version"));
		javaVersion.displayJavaVersion();
	}

	private static void displayJavaVersion() {
		System.out.println(System.getProperty("java.version"));
	}
}
