import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

class MyGenericClass<MyA, B> {
}

@MyAnnotation(NAME = "Jeffrey LEE", DATE = "2014/11/19", ANNO = @MyAnnotation2(NUM_OF_TESTCASE = 12))
@MyAnnotation2(NUM_OF_TESTCASE = 0)
public class TestAnnotation<@MyAnnotation2(NUM_OF_TESTCASE = 18) T> extends
		@MyAnnotation2(NUM_OF_TESTCASE = 18) Object {
	@MyAnnotation2(NUM_OF_TESTCASE = 18)
	private int myInt;

	@MyAnnotation2(NUM_OF_TESTCASE = 18)
	private T @MyAnnotation2(NUM_OF_TESTCASE = 18) [] myObj;

	@MyAnnotation2(NUM_OF_TESTCASE = 18)
	private ArrayList<@MyAnnotation2(NUM_OF_TESTCASE = 19) Integer> myObj2;

	@MyAnnotation2(NUM_OF_TESTCASE = 108)
	private MyGenericClass<@MyAnnotation2(NUM_OF_TESTCASE = 21) Integer, @MyAnnotation2(NUM_OF_TESTCASE = 20) String> myObj3;

	<@MyAnnotation2(NUM_OF_TESTCASE = 18) Q extends @MyAnnotation2(NUM_OF_TESTCASE = 0) List<?> & @MyAnnotation2(NUM_OF_TESTCASE = 0) Serializable> T foo(
			@MyAnnotation2(NUM_OF_TESTCASE = 24) int parameter1,
			@MyAnnotation2(NUM_OF_TESTCASE = 5) Object[] parameter2,
			Q parameter3) {
		@MyAnnotation2(NUM_OF_TESTCASE = 101)
		T myObj = null;
		@MyAnnotation2(NUM_OF_TESTCASE = 102)
		T myObj2 = myObj;
		return myObj2;
	}

	public int fun() {
		{
			@MyAnnotation2(NUM_OF_TESTCASE = 108)
			int var1 = 8;
			System.out.println(var1);
		}
		@MyAnnotation2(NUM_OF_TESTCASE = 109)
		int var1 = 9;

		return var1;
	}

	private void fun3() throws ClassNotFoundException, IllegalAccessException {
	}

	public void fun2() {
		try {
			fun3();
		} catch (@MyAnnotation2(NUM_OF_TESTCASE = 10) ClassNotFoundException
				| @MyAnnotation2(NUM_OF_TESTCASE = 9) IllegalAccessException ex) {
			System.out.println(ex);
		}
	}

	public static void main(String[] args) {
		System.out.println(MyAnnotation.class);
		Annotation[] annotations = TestAnnotation.class.getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println(annotation.getClass());
			System.out.println(annotation.annotationType());
		}
	}
}