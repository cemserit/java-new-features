/**
 * Created by cemserit on 2019-08-14.
 */

interface DefaultMethodInterface {
	default int addTwoNumber(int number1, int number2) {
		return number1 + number2;
	}
}

class DefaultMethodInterfaceImpl implements DefaultMethodInterface {
}

class DefaultMethodInterfaceImpl2 implements DefaultMethodInterface {
	@Override
	public int addTwoNumber(int number1, int number2) {
		return number1 + number2;
	}
}

public class DefaultMethodInInterface {
	public static void main(String[] args) {
		DefaultMethodInterface defaultMethod = new DefaultMethodInterfaceImpl();
		defaultMethod.addTwoNumber(2, 3);

		defaultMethod = new DefaultMethodInterfaceImpl2();
		defaultMethod.addTwoNumber(2, 3);
	}
}