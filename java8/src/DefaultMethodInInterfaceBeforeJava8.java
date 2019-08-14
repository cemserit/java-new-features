/**
 * Created by cemserit on 2019-08-14.
 */

interface DefaultMethodInterfaceBeforeJava8 {
	int add(int x, int y);
}

class DefaultMethodInterfaceBeforeJava8Impl implements DefaultMethodInterfaceBeforeJava8 {
	@Override
	public int add(int x, int y) {
		return x + y;
	}
}

class DefaultMethodInterfaceBeforeJava8Impl2 implements DefaultMethodInterfaceBeforeJava8 {
	@Override
	public int add(int x, int y) {
		return x + y;
	}
}

public class DefaultMethodInInterfaceBeforeJava8 {
	public static void main(String[] args) {
		DefaultMethodInterfaceBeforeJava8 defaultMethodInterfaceBeforeJava8 = new DefaultMethodInterfaceBeforeJava8Impl();
		defaultMethodInterfaceBeforeJava8.add(1, 2);

		defaultMethodInterfaceBeforeJava8 = new DefaultMethodInterfaceBeforeJava8Impl2();
		defaultMethodInterfaceBeforeJava8.add(1, 2);
	}
}
