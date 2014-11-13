public interface MyInterface {
	default void foo() {
		System.out.println("Default Implementation Method?");
	}
}