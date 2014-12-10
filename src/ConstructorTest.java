public class ConstructorTest {
	public ConstructorTest() {
		int i = 0 / 0;
		System.out.println(i);
	}

	public ConstructorTest(int value) {
	}

	public static void main(String[] args) {
		new A(new Object(), new A("foo"));
	}
}

class A {
	public A(Object obj, A a) {
	}

	public A(String str) {
	}
}