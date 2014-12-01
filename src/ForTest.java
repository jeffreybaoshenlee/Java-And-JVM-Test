public class ForTest {
	public void fun() {
		for (float i = 0; i < 100; i++) {
			System.out.println(i);

			int k = (int) i;
			switch (k) {
			case 10:
				System.out.println("10");
				break;
			case 20:
				float q = k;
				System.out.println(q);
				break;
			default:
				float d = k;
				System.out.println(d);
				break;
			}
		}

		for (int j = 0; j < 100; j++) {
			System.out.println(j);
		}
	}
}