public class PrivateAndNonPrivateMethodResolve {
	static class SuperClass {
		public void fun() {
			myMethod();
		}

		private void myMethod() {
			System.out.println("The private method of SuperClass.");
		}
	}

	static class SubClass extends SuperClass {
		// public void fun(){
		// myMthod();
		// }

		public void myMethod() {
			System.out.println("The private method of SubClass.");
		}
	}

	public static void main(String[] args) {
		SuperClass superClass = new SubClass();
		superClass.fun();
	}
}