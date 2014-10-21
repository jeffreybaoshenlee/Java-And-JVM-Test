import java.util.List;

public class Main {
	public static void main(String[] args) {
		System.out.print("Hello, World!");
	}

	public static void printPersonsOlderThan(List<Person> roster, int age) {
		for (Person p : roster) {
			if (p.getAge() >= age) {
				p.printPerson();
			}
		}
	}
}