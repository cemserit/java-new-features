/**
 * Created by cemserit on 2019-08-14.
 */
public class LambdaExpressionSyntax {
	public static void main(String[] args) {
		final Runnable hello = () -> System.out.println("Hello");
		hello.run();
	}
}
