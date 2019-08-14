/**
 * Created by cemserit on 2019-08-14.
 */
interface StaticMethod {
	static void displayHelloWorld() {
		System.out.println("Hello World!");
	}

}

public class StaticMethodInterface {
	public static void main(String[] args) {
		StaticMethod.displayHelloWorld();
	}
}
