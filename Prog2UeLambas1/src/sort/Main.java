package sort;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Person[] people = new Person[] { 
				new Person("Ted", "Neward", 41),    
				new Person("Charlotte", "Neward", 41),     
				new Person("Michael", "Neward", 19),     
				new Person("Matthew", "Neward", 13),     
				new Person("Adam", "Pfeiffer", 43) 
		};  
		
		// Sortieren
		// 1
		Arrays.sort(people, Person::compareByFirstName);

		// 2
		Arrays.sort(people, (a,b) -> a.getFirstName().compareTo(b.getFirstName()));

		// 3
		Arrays.sort(people, Comparator.comparing(Person::getFirstName));

		// 4
		Comparator<Person> firstnameComp = new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		};
		Arrays.sort(people, firstnameComp);

		// 4
		Stream.of(people).sorted();

		// 5
		Stream.of(people).sorted(Person::compareByFirstName);

		// 6
		Stream.of(people).sorted((a,b) -> a.getFirstName().compareTo(b.getFirstName()));

		// 7
		Stream.of(people).sorted(Comparator.comparing(Person::getFirstName));

		// 8
		Comparator<Person> firstnameComp2 = Person::compareByFirstName;
		Stream.of(people).sorted(firstnameComp2);

		// 9
		class PersonFirstNameComparator implements Comparator<Person>{
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		}
		Stream.of(people).sorted(new PersonFirstNameComparator());

		// (10)
		Arrays.sort(people, new PersonFirstNameComparator());

		// 11
		Arrays.sort(people,
				(Person a, Person b) -> {
					return a.getFirstName().compareTo(b.getFirstName());
				}
			);
		
		
		
		// Ausgaben
		// 1 - Arrays.toString
		System.out.println("1");
		System.out.println(Arrays.toString(people));
		
		// 2 - verkürzte for-schleife
		System.out.println("2");
		for(Person p : people)
			System.out.println(p);
		
		// 3 - lambda foreach
		System.out.println("3");
		Stream.of(people).forEach(p -> System.out.println(p.toString()));
		
		// 4 - statische methodenreferenz
		System.out.println("4");
		Stream.of(people).forEach(System.out::println);
		
		// 5 - primitive for-schleife
		System.out.println("5");
		for(int i=0;i<people.length;i++)
			System.out.println(people[i]);

	}
}
