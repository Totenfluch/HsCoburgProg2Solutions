import java.io.Serializable;

public class Jeans extends Kleidungsst�ck implements Serializable{ 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -92686156695154671L;
	private static String  typId="567407";
	protected int schrittl�nge;
 
	
	public static String typNummer() {
		return typId;
	}
	
	public Jeans(int groesse, Farbe f, String bezeichnung, int schrittl�nge) {
		super(groesse,f,bezeichnung);
		artNr = typId + super.groesse;
		this.schrittl�nge = schrittl�nge;
	}
	
	public String artikelNummer() {
		return artNr;
	}

	public String toString() {
		return artNr +  " " + super.toString() + " " + schrittl�nge;
	}
}
