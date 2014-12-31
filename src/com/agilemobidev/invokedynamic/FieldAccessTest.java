package com.agilemobidev.invokedynamic;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

class Point {
	int x;
	int y;
}

public class FieldAccessTest {
	public static void main(String[] args) throws Throwable {
		MethodHandles.Lookup lookup = MethodHandles.lookup();

		Point point = new Point();

		// Set the x and y fields.

		MethodHandle mh = lookup.findSetter(Point.class, "x", int.class);
		mh.invoke(point, 15);

		mh = lookup.findSetter(Point.class, "y", int.class);
		mh.invoke(point, 30);

		mh = lookup.findGetter(Point.class, "x", int.class);
		int x = (int) mh.invoke(point);
		System.out.printf("x = %d%n", x);

		mh = lookup.findGetter(Point.class, "y", int.class);
		int y = (int) mh.invoke(point);
		System.out.printf("y = %d%n", y);
	}
}