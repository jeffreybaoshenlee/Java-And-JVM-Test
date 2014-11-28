public class OverriddenTest {
	public static void main(String[] args) {
	}

	public static final void staticFun() {
	}

//	private final void foo() {
//	}
	
	public void fun2(){		
	}
}

class MyOverriddenTest extends OverriddenTest {
	// public static final void staticFun() {
	// }
	//
	// private final void foo() {
	// }
//
//	public static abstract void fun();
//	public static void fun2(){		
//	}
}