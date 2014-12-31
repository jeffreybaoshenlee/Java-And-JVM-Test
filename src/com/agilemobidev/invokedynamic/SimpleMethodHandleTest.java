package com.agilemobidev.invokedynamic;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class SimpleMethodHandleTest {
	public static void main(String[] args) throws Throwable {
		MethodHandles.Lookup lookup = MethodHandles.lookup();
		MethodHandle methodHandle = lookup.findStatic(
				SimpleMethodHandleTest.class, "hello",
				MethodType.methodType(void.class, String.class, int.class));
		methodHandle.invoke("Jeffrey", new Integer(2015));
		methodHandle.invokeExact("Jeffrey", 2015);
	}

	static void hello(String name, int value) {
		System.out.println("Hello: " + name + "; Value: " + value);
	}
}