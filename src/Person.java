import java.time.LocalDate;

public class Person {
	private String name;
	private LocalDate birthday;
	private Sex gender;
	private String emailAddress;
	private int age;
	
	Person(int age){
		this.age=age;
		this.name="NoName";
	}

	public int getAge() {
		return age;
	}

	public void printPerson() {
		System.out.println("Name: "+name+"; Age: "+age);
	}
}