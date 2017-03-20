package me.Christian.pack;

public class Main {
	public static void main(String[] args){
		Kartenspiel ks = new Kartenspiel(10);
		System.out.println(ks.toString());
		System.out.println("--------------------");
		ks.mischen();
		System.out.println(ks.toString());
		System.out.println("--------------------");
		ks.sort();
		System.out.println(ks.toString());
		System.out.println("--------------------");
		System.out.println("+++++");
		Kartenspiel kp = new Kartenspiel(4);
		System.out.println(kp);
		System.out.println("^-^-^-^^^^^^^");
		ks.KartenspielHinzufügen(kp);
		System.out.println(ks.toString());
		
	}
}
