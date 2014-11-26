public class ArrayTest {
	private static int[][] array = { {}, { 1, 2, 5, 9, 10 }, {} };

	public static void main(String... args) {
		System.out.println(array);

		int[][][] myArr1 = new int[8][][];
		int[][][] myArr2 = new int[1][9][10];
		System.out.println(myArr1.getClass());
		System.out.println(myArr2.getClass());
	}

	public void foo() {
		Object[][] myArr = new Object[10][12];
		myArr[5][6] = new Object();

		Object o;
		try {
			o = new Object();
			System.out.println(o);
		} finally {
			o = null;
		}
	}
}