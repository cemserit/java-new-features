package com.cemserit.java8.lambda_expression;

/**
 * Created by cemserit on 2019-08-14.
 */
interface HelloInterFace {
	void displayHelloWorld();
}

class HelloInterFaceImpl implements HelloInterFace {
	@Override
	public void displayHelloWorld() {
		System.out.println("Hello World!");
	}
}

public class LambdaExpressionSyntax4 {
	public static void main(String[] args) {
		HelloInterFace helloInterFace = new HelloInterFaceImpl();
		helloInterFace.displayHelloWorld();

		//Lambda
		HelloInterFace hello = () -> System.out.println("Hello World!");
		hello.displayHelloWorld();
	}
}
