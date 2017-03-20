import java.util.Random;

public class Main {

	public static void main(String[] args) {

		//Artikelverwaltung a1 = new Artikelverwaltung(create(10));
		// a1.write("Artikel.txt");
		Artikelverwaltung a1 = new Artikelverwaltung();
		a1.read("Artikel.txt");
		System.out.println(a1);
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
