public class Calculator {

	interface IntegerMath {
		int operation(int a, int b);
	}

	public int operateBinary(int a, int b, IntegerMath op) {
		return op.operation(a, b);
	}

	public static void main(String... args) {
		Calculator myApp = new Calculator();
		IntegerMath addition = (a, b) -> a + b;
		IntegerMath subtraction = (a, b) -> a - b;
		IntegerMath mulplication = (a, b) -> a*b;
		System.out.println(mulplication.getClass());
		IntegerMath mulplication2 = (a, b) -> a*b;
		System.out.println(mulplication2.getClass());
		IntegerMath division = new IntegerMath(){
			@Override
			public int operation(int a, int b) {
				return a/b;
			}		
		};
		System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, addition));
		System.out.println("20 - 10 = "
				+ myApp.operateBinary(20, 10, subtraction));
		System.out.println("53 * 17 = " + myApp.operateBinary(53, 17, mulplication));
		System.out.println("1024 * 16 = " + myApp.operateBinary(1024, 16, division));
		System.out.println("152 * 9 = " + myApp.operateBinary(152, 9, (a,b)-> a % b));
	}
}