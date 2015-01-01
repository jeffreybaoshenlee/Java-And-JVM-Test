public class AmbiguousInterfaceMethodsTest {
	static public class MyBaseClass implements A {
		// public void fun() {
		// System.out.println("MyBaseClass's function.");
		// }
	}

	static class MyClass extends MyBaseClass implements A, B {
		void myFun() {
			B.super.fun();
		}

		void myFun2() {
			super.fun();
		}

		public void fun() {
			System.out.println("MyClass's function.");
		}
	}

	interface A {
		default void fun() {
			System.out.println(this);
			System.out.println("A's function.");
		}
	}

	interface B extends A {
		default void fun() {
			System.out.println("B's function.");
			A.super.fun();
		}
	}

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.fun();
		myClass.myFun();
		myClass.myFun2();
	}
}