public class ExceptionTest {
	public static class TestExc extends Exception {
		private static final long serialVersionUID = 1L;
	}

	public static void main(String[] args) {
		ExceptionTest exceptionTest = new ExceptionTest();
		exceptionTest.catchOne();
		exceptionTest.tryCatchFinally();
	}

	void cantBeZero(int i) throws TestExc {
		if (i == 0) {
			throw new TestExc();
		}
	}

	void catchOne() {
		try {
			tryItOut();
		} catch (TestExc e) {
			handleExc(e);
		}
	}

	void tryItOut() throws TestExc {
		cantBeZero(0);
	}

	void handleExc(TestExc e) {
	}

	void tryCatchFinally() {
		try {
			tryItOut();
		} catch (TestExc e) {
			handleExc(e);
		} finally {
			wrapItUp();
		}
	}

	void wrapItUp() {
	}

	void onlyMe(Object f) {
		synchronized (f) {
			doSomething();
		}
	}

	void doSomething() {
	}
}