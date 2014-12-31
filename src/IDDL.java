

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class IDDL {
	private static MethodHandle handle;

	@SuppressWarnings("unused")
	private static void method() {
		System.out.println("Hello, World!");
	}

	public static CallSite bootstrapDynamic(MethodHandles.Lookup caller,
			String name, MethodType type) throws IllegalAccessException,
			NoSuchMethodException {
		MethodHandles.Lookup lookup = MethodHandles.lookup();
		Class<?> thisClass = lookup.lookupClass();
		handle = lookup.findStatic(thisClass, "method",
				MethodType.methodType(void.class));
		if (!type.equals(handle.type()))
			handle = handle.asType(type);

		return new ConstantCallSite(handle);
	}
}