
public class Student extends Person{
	private int matrikelnummer;
	public Student(String vorname, String nachname, String strassennummer, String hausnummer, int postleitzahhl,
			String ort, int matrikelnummer, int gehalt) {
		super(vorname, nachname, strassennummer, hausnummer, ort, postleitzahhl, gehalt);
		this.matrikelnummer = matrikelnummer;
	}
	
	public String toString(){
		return super.toString() + "\nmatrikelnummer: " + matrikelnummer;
	}
	
}
