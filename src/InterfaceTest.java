public class InterfaceTest implements MySubInterface {
	private static int myInt;
	
	private interface MyPrivateInterface{
		default void foo() {
			System.out.println(myInt);
		}
	}
	
	public static void main(String[] args) {
		InterfaceTest interfaceTest = new InterfaceTest();
		Class<?> clazz = interfaceTest.getClass();
		Class<?>[] interfaces = clazz.getInterfaces();
		Class<?> firstInterface = interfaces[0];
		System.out.println(firstInterface);
		System.out.println(firstInterface.getSuperclass());
		
		interfaceTest.foo();
		MyPrivateInterface myPrivateInterface = new MyPrivateInterface() {
		};
		myPrivateInterface.foo();
	}
}