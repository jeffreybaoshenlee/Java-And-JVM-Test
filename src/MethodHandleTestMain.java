import java.lang.invoke.MethodHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodHandleTestMain {
	private static void withReflectionArgs() {
		Method method = MethodHandleTest.makeMethod();

		MethodHandleTest tester0 = new MethodHandleTest(0);
		MethodHandleTest tester1 = new MethodHandleTest(1);

		System.out.println("Invocation using Reflection");
		try {
			method.invoke(tester0, 5, "Jabba the Hutt");
			method.invoke(tester1, 7, "Boba Fett");
		} catch (IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	private static void withMethodHandleArgs() {
		MethodHandle methodHandle = MethodHandleTest.makeMethodHandle();

		MethodHandleTest tester0 = new MethodHandleTest(0);
		MethodHandleTest tester1 = new MethodHandleTest(1);

		System.out.println("Invocation using Method Handle");
		try {
			methodHandle.invokeExact(tester0, 42, "R2D2");
			methodHandle.invokeExact(tester1, 43, "C3PO");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		withReflectionArgs();
		withMethodHandleArgs();
	}
}