import java.io.Serializable;

public class Jeans extends Kleidungsstück implements Serializable{ 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -92686156695154671L;
	private static String  typId="567407";
	protected int schrittlänge;
 
	
	public static String typNummer() {
		return typId;
	}
	
	public Jeans(int groesse, Farbe f, String bezeichnung, int schrittlänge) {
		super(groesse,f,bezeichnung);
		artNr = typId + super.groesse;
		this.schrittlänge = schrittlänge;
	}
	
	public String artikelNummer() {
		return artNr;
	}

	public String toString() {
		return artNr +  " " + super.toString() + " " + schrittlänge;
	}
}
