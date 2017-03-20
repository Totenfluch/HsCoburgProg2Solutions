import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Artikelverwaltung a1 = new Artikelverwaltung(create(10));
		//a1.write("Artikel.dat");
		a1.read("Artikel.dat");
		//Artikelverwaltung a1 = new Artikelverwaltung();
		//a1.read("Artikel.dat");
		//System.out.println(a1);
	}

	public static Artikel[] create(int anzahl){
		Artikel[] artikel = new Artikel[anzahl];
		for(int i = 0; i<anzahl; i++){
			Random r = new Random();
			artikel[i] = new Jeans(r.nextInt(20)+10, Kleidungsstück.Farbe.values()[r.nextInt(5)], "blub", r.nextInt(40)+400);
		}
		return artikel;
	}

}
