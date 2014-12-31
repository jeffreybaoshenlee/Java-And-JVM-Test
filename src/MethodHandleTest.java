import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class MethodHandleTest {
	private final int value;

	public MethodHandleTest(int value) {
		this.value = value;
	}

	@SuppressWarnings("unused")
	private void bar(int parameter, String msg) {
		System.out.println("Private Method \'bar\' successfully accessed : "
				+ value + ", " + parameter + " : " + msg + "!");
	}

	public static Method makeMethod() {
		Method method;

		try {
			Class<?>[] argTypes = new Class[] { int.class, String.class };

			method = MethodHandleTest.class.getDeclaredMethod("bar", argTypes);
			method.setAccessible(true);
		} catch (IllegalArgumentException | NoSuchMethodException
				| SecurityException e) {
			AssertionError assertionError = new AssertionError();
			assertionError.initCause(e);
			throw assertionError;
		}

		return method;
	}

	public static MethodHandle makeMethodHandle() {
		MethodHandle methodHandle;
		MethodType methodType = MethodType.methodType(void.class, int.class,
				String.class);
		try {
			methodHandle = MethodHandles.lookup().findVirtual(
					MethodHandleTest.class, "bar", methodType);
			System.out.println("method handle =" + methodHandle);
		} catch (Exception e) {
			AssertionError assertionError = new AssertionError();
			assertionError.initCause(e);
			throw assertionError;
		}
		return methodHandle;
	}
}