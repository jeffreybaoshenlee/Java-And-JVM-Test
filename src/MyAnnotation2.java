import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.PARAMETER,
		ElementType.TYPE_PARAMETER, ElementType.LOCAL_VARIABLE,
		ElementType.TYPE_USE })
public @interface MyAnnotation2 {
	int NUM_OF_TESTCASE();
}