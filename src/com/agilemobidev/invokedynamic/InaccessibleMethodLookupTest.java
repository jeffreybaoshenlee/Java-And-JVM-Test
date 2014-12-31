package com.agilemobidev.invokedynamic;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

class MyClass{
	public void hello1() {
		System.out.println("hello from hello1");
	}

	@SuppressWarnings("unused")
	private void hello2() {
		System.out.println("hello from hello2");
	}
}

public class InaccessibleMethodLookupTest {
	public static void main(String[] args) throws Throwable {
		MyClass myClass = new MyClass();
		MethodHandles.Lookup lookup = MethodHandles.lookup();
		MethodHandle mh = lookup.findVirtual(MyClass.class, "hello1",
				MethodType.methodType(void.class));
		mh.invoke(myClass);
		mh = lookup.findVirtual(MyClass.class, "hello2",
				MethodType.methodType(void.class));
	}
}