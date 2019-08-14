package com.cemserit.java8.lambda_expression;

/**
 * Created by cemserit on 2019-08-14.
 */

interface AddInterface {
	public int add(int x, int y);
}

public class LambdaExpressionSyntax2 {
	public static void main(String[] args) {
		int result = add(5, 7);
		System.out.println(result);

		// lambda syntax
		AddInterface add = (x, y) -> x + y;
		int resultLambda = add.add(5, 7);

		System.out.println(resultLambda);
	}

	private static int add(int x, int y) {
		return x + y;
	}
}
