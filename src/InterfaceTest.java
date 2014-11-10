public class InterfaceTest implements MySubInterface {
	public static void main(String[] args) {
		InterfaceTest interfaceTest = new InterfaceTest();
		Class<?> clazz = interfaceTest.getClass();
		Class<?>[] interfaces = clazz.getInterfaces();
		Class<?> firstInterface = interfaces[0];
		System.out.println(firstInterface);
		System.out.println(firstInterface.getSuperclass());
	}
}