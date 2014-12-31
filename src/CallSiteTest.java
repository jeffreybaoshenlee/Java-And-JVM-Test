import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;

public class CallSiteTest {
	public static void main(String[] args) throws Throwable {
		CallSite site = new MutableCallSite(printArgs);
		System.out.println(printArgs);
		MethodHandle invoker = site.dynamicInvoker();
		invoker.invoke(new Object[] { "arg0", "arg1", 2, 3.14 });
	}

	@SuppressWarnings("unused")
	private static void printArgs(Object... args) {
		System.out.println(java.util.Arrays.deepToString(args));
	}

	private static final MethodHandle printArgs;
	static {
		MethodHandles.Lookup lookup = MethodHandles.lookup();
		Class<?> thisClass = lookup.lookupClass(); // (who am I?)
		try {
			printArgs = lookup.findStatic(thisClass, "printArgs",
					MethodType.methodType(void.class, Object[].class));
		} catch (NoSuchMethodException | IllegalAccessException e) {
			e.printStackTrace();
			AssertionError error = new AssertionError(e);
			throw error;
		}
	}
}