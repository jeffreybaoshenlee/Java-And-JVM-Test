import java.lang.annotation.Annotation;

@MyAnnotation(NAME = "Jeffrey LEE", DATE = "2014/11/19", ANNO = @MyAnnotation2(NUM_OF_TESTCASE = 12))
public class TestAnnotation<@MyAnnotation2(NUM_OF_TESTCASE = 18) T> extends
		@MyAnnotation2(NUM_OF_TESTCASE = 18) Object {
	@MyAnnotation2(NUM_OF_TESTCASE = 18)
	private int myInt;

	@MyAnnotation2(NUM_OF_TESTCASE = 18)
	private T @MyAnnotation2(NUM_OF_TESTCASE = 18) [] myObj;

	<@MyAnnotation2(NUM_OF_TESTCASE = 18) Q> T foo(
			@MyAnnotation2(NUM_OF_TESTCASE = 24) int parameter1,
			@MyAnnotation2(NUM_OF_TESTCASE = 5) Object[] parameter2,
			Q parameter3) {
		@MyAnnotation2(NUM_OF_TESTCASE = 0)
		T myObj = null;
		return myObj;
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