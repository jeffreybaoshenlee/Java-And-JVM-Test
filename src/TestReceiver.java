import java.util.ArrayList;

public class TestReceiver {
	interface MyInterface {
		int fun(String str);
	}

	interface MyInterface2 {
		ArrayList<?> create();
	}

	void foo(TestReceiver this) {
		MyInterface my = String::length;

		System.out.println(my.getClass());
		System.out.println(my.fun("haha"));

		MyInterface2 my2 = ArrayList::new;
		ArrayList<?> list = my2.create();
		System.out.println(my2.getClass());
		System.out.println(list.getClass());
	}

	public static void main(String[] args) {
		new TestReceiver().foo();
	}
}