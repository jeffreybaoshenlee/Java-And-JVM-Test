import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.PARAMETER,
		ElementType.TYPE_PARAMETER, ElementType.LOCAL_VARIABLE,
		ElementType.TYPE_USE })
public @interface MyAnnotation2 {
	int NUM_OF_TESTCASE();
}