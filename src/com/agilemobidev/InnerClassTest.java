package com.agilemobidev;

public class InnerClassTest {
	private class MyInnerClass {
		private void foo() {
			System.out.println("Hello, Inner Class.");
		}
	}

	@Deprecated
	public static void main(String[] args) {
		InnerClassTest innerClassTest = new InnerClassTest();
		MyInnerClass myInnerClass = innerClassTest.new MyInnerClass();
		myInnerClass.foo();
	}
	
	@Deprecated
	private static void foo(){		
	}

	@Deprecated
	public InnerClassTest() {
		foo();
	}
}