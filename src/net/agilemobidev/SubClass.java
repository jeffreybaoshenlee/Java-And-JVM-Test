package net.agilemobidev;

import com.agilemobidev.BaseClass;

@SuppressWarnings("deprecation")
public class SubClass extends BaseClass {
	public static void main(String[] args) {
		SubClass sub = new SubClass();
		// BaseClass base = sub;
		// System.out.println(base.value);
		System.out.println(sub.value);
	}
}