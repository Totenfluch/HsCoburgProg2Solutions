package sort;
import java.util.Comparator;

class Person implements Comparator<Person>{  
	private final  String firstName;  
	private String lastName;  
	private final  int age;  
	public Person(String f, String l, int a){   
		firstName = f;   
		lastName = l;   
		age = a;  }  
	public String toString() {  
		return "Person [firstName=" + firstName + ", lastName=" + lastName     + ", age=" + age + "]";  
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public int getAge(){
		return age;
	}
	
	public static int compareByFirstName(Person a, Person b){
		return a.firstName.compareTo(b.firstName);
	}
	@Override
	public int compare(Person o1, Person o2) {
		return o1.getFirstName().compareTo(o2.getFirstName());
	}
}  