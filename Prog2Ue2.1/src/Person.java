
public class Person {
	private String vorname, nachname, strassennummer, hausnummer, ort;
	int postleitzahl, gehalt;
	public Person(String vorname, String nachname, String strassennummer, String hausnummer, String ort, int postleitzahhl, int gehalt ){
		this.vorname = vorname;
		this.nachname = nachname;
		this.strassennummer = strassennummer;
		this.hausnummer = hausnummer;
		this.ort = ort;
		this.postleitzahl = postleitzahhl;
		this.gehalt = gehalt;
	}
	
	public int gehalt(){
		return gehalt;
	}
	
	public String toString(){
		return "vorname: " + vorname + "\nnachname: " + nachname + "\nstrassennummer: "+ strassennummer + "\nhausnummer: " + hausnummer + "\nort: "+ort + "\nPLZ: " + postleitzahl + "\ngehalt: " + gehalt; 
	}
	
	
}
