import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//FIXME Refactor the print methods to PersonUtils class.
//FIXME Break up the code in the main method into globalSetUp() and runTestCase0(), runTestCase1(), ....
public class Main {
	private static final int TEST_COUNT = 10;
	private static final Random random = new Random();
	private static final int MAX_AGE = 100;

	public static void main(String[] args) {
		List<Person> testees = new ArrayList<Person>();

		for (int i = 0; i < TEST_COUNT; i++) {
			int age = random.nextInt(MAX_AGE);
			Person person = new Person(age);
			testees.add(person);
		}

		int testAge = random.nextInt(MAX_AGE);
		System.out
				.println("Test Case 1: Finding the persons whose age reaches at "
						+ testAge);
		printPersonsOlderThan(testees, testAge);

		int testLowAge = random.nextInt(MAX_AGE);
		int testHighAge = random.nextInt(MAX_AGE);
		if (testLowAge > testHighAge) {
			int delta = testLowAge - testHighAge;
			testLowAge = testHighAge;
			testHighAge += delta;
		}

		System.out
				.println("Test Case 2: Finding the persons whose age is between "
						+ testLowAge + " and " + testHighAge);
		printPersonsWithinAgeRange(testees, testLowAge, testHighAge);
	}

	public static void printPersonsOlderThan(List<Person> roster, int age) {
		for (Person p : roster) {
			if (p.getAge() >= age) {
				p.printPerson();
			}
		}
	}

	public static void printPersonsWithinAgeRange(List<Person> roster, int low,
			int high) {
		for (Person p : roster) {
			if (low <= p.getAge() && p.getAge() < high) {
				p.printPerson();
			}
		}
	}
	
	public static void printPersons(
		    List<Person> roster, CheckPerson tester) {
		    for (Person p : roster) {
		        if (tester.test(p)) {
		            p.printPerson();
		        }
		    }
		}
}