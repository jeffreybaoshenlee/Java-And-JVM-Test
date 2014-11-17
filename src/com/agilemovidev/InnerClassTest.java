package com.agilemovidev;

public class InnerClassTest {
	private class MyInnerClass {
		private void foo() {
			System.out.println("Hello, Inner Class.");
		}
	}

	public static void main(String[] args) {
		InnerClassTest innerClassTest=new InnerClassTest();
		MyInnerClass myInnerClass=innerClassTest.new MyInnerClass();
		myInnerClass.foo();
	}
}