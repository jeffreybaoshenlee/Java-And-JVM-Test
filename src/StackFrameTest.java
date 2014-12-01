public class StackFrameTest {
	public static void main(String[] args) {
		new StackFrameTest().fun();
	}

	public void fun() {
		for (int i = 0; i < 100; i++) {
			int j = i % 2;
			Object obj;
			if (j == 0) {
				String s = new String("Even");
				obj = s;
			} else {
				Integer integer = new Integer(i);
				obj = integer;
			}
			System.out.println(obj);
		}
	}

	public int addOne(int x) {
		return x + (isSomething(0) ? 0 : 1);
	}

	public static boolean isSomething(int z) {
		return true;
	}
}