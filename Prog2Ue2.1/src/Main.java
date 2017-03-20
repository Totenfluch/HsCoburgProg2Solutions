
public class Main {
	public static void main(String[] args){
		Student aStudent = new Student("Peter", "Müller", "Hauptstrasse",  "4a", 96450, "Coburg", 455555, 1000 );  
		Dozent aDozent = new Dozent("luter", "Meyer", "Jenaerstrasse",  "21", "Coburg", 96450, "Betriebssysteme", 1000 ); 
		Student bStudent = new Student("nieter", "Müller", "Hauptstrasse",  "4a", 96450, "Coburg", 455555, 1000 );  
		Dozent bDozent = new Dozent("loler", "Meyer", "Jenaerstrasse",  "21", "Coburg", 96450, "Betriebssysteme", 1000 ); 
		Student cStudent = new Student("napper", "Müller", "Hauptstrasse",  "4a", 96450, "Coburg", 455555, 1000 );  

		System.out.println(aStudent.toString());
		System.out.println(aDozent.toString());
		
		Person[] Personen = new Person[5];
		Personen[0] = aStudent;
		Personen[1] = aDozent;
		Personen[2] = bStudent;
		Personen[3] = bDozent;
		Personen[4] = cStudent;
		
		for(Person p : Personen)
			System.out.println(p.toString());
	}
}
