import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CastTest<K extends Collection<?>, V extends List<?>> {
	public static void main(String[] args) {
	}

	public void foo() {
		@SuppressWarnings("unchecked")
		Map<K, V> map = ((Map<K, V>) new HashMap<ArrayList<?>, ArrayList<?>>());
		System.out.println(map.getClass());
	}
}