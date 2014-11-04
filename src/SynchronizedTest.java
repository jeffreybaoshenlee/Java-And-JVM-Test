public class SynchronizedTest {
	public static void main(String[] args) {
		new SynchronizedTest().fun();
	}

	public synchronized void fun(){
		System.out.println("Synced fun().");
	}
}