package me.Christian.pack;

public class Main {

	public static void main(String[] args) {
		Bibliothek hsBib = new Bibliothek();
		hsBib.einf�gen(new Buch("Reinhard Schiedermeier","Java Praktikum", "9784898645133"));
		hsBib.einf�gen(new Buch("Harvey Deitel", "How to program Java", "01303451517"));
		hsBib.einf�gen(new Buch("Bertrand Meyer", "Object Oriented Software Construction", "0136290310"));
		hsBib.einf�gen(new Buch("Bertrand Meyer", "Software Engineering Approaches for Offshore and Outsourced Development", "9783642018558"));
		hsBib.einf�gen(new Buch("Kathy Sierra", "Java von Kopf bis Fuss", "9783897214484"));
		hsBib.einf�gen(new Buch("Reinhard Schiedermeier", "Java Praktikum ", "9784898645133"));
		hsBib.einf�gen(new Buch("Harvey Deitel", "How to program Java", "01303451517"));
		hsBib.einf�gen(new Buch("Bertrand Meyer", "Object Oriented Software Construction","0136290310"));
		hsBib.einf�gen(new Buch("Bertrand Meyer", "Software Engineering Approaches for Offshore and Outsourced Development", "9783642018558"));
		hsBib.einf�gen(new Buch("Kathy Sierra", "Java von Kopf bis Fuss", "97838972144824"));
		hsBib.einf�gen(new Buch("Mark Utting", "Pratical Model based Testing", "9780123725011 "));
		System.out.println(hsBib.bestandNachAutor());
		
		TreeBibliothek hsBib2 = new TreeBibliothek();
		hsBib2.einf�gen(new Buch("Reinhard Schiedermeier","Java Praktikum", "9784898645133"));
		hsBib2.einf�gen(new Buch("Harvey Deitel", "How to program Java", "01303451517"));
		hsBib2.einf�gen(new Buch("Bertrand Meyer", "Object Oriented Software Construction", "0136290310"));
		hsBib2.einf�gen(new Buch("Bertrand Meyer", "Software Engineering Approaches for Offshore and Outsourced Development", "9783642018558"));
		hsBib2.einf�gen(new Buch("Kathy Sierra", "Java von Kopf bis Fuss", "9783897214484"));
		hsBib2.einf�gen(new Buch("Reinhard Schiedermeier", "Java Praktikum ", "9784898645133"));
		hsBib2.einf�gen(new Buch("Harvey Deitel", "How to program Java", "01303451517"));
		hsBib2.einf�gen(new Buch("Bertrand Meyer", "Object Oriented Software Construction","0136290310"));
		hsBib2.einf�gen(new Buch("Bertrand Meyer", "Software Engineering Approaches for Offshore and Outsourced Development", "9783642018558"));
		hsBib2.einf�gen(new Buch("Kathy Sierra", "Java von Kopf bis Fuss", "97838972144824"));
		hsBib2.einf�gen(new Buch("Mark Utting", "Pratical Model based Testing", "9780123725011 "));
		System.out.println(hsBib2.toString());
		//System.out.println(hsBib);
	}

}
