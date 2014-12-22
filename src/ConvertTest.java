public class ConvertTest {
	public static void main(String[] args) {
		Object o = new Integer(1);
		System.out.println(o);

		Object obj = null;
		obj = (Integer) obj;
	}
}