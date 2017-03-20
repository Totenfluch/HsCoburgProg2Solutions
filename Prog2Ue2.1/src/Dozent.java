
public class Dozent extends Person{
	private String lehrgebiet;
	public Dozent(String vorname, String nachname, String strassennummer, String hausnummer, String ort,
			int postleitzahhl, String lehrgebiet, int gehalt) {
		super(vorname, nachname, strassennummer, hausnummer, ort, postleitzahhl, gehalt);
		this.lehrgebiet = lehrgebiet;
	}
	
	public String toString(){
		return super.toString() + "\nlehrgebiet: " + lehrgebiet;
	}
}
