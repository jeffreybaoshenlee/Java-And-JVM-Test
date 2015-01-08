public class ConstructorTest {
	@SuppressWarnings("unused")
	private final int value = 3;
	@SuppressWarnings("unused")
	private final String myStr;
	
	public ConstructorTest() {
		super();
		int i = 0 / 0;
		System.out.println(i);
	}
	
	{
		myStr="hello";
	}

	public ConstructorTest(int value) {
	}

	public static void main(String[] args) {
		System.out.println(new A(new Object(), new A("foo")));
	}
}

class A {
	public A(Object obj, A a) {
	}

	public A(String str) {
	}
}