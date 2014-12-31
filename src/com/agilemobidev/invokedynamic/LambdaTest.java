package com.agilemobidev.invokedynamic;

public class LambdaTest {
	public static void main(String[] args) {
		Runnable r = () -> System.out.println("Hello");
		r.run();
	}
}