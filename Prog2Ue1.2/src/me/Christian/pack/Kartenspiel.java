package me.Christian.pack;

import java.util.Arrays;
import java.util.Random;

import me.Christian.pack.Karte;

public class Kartenspiel {
	Karte[] Karten;
	public Kartenspiel(int n){
		Karten = new Karte[n];
		Farbe[] fb = Farbe.values();
		Wert[] wb = Wert.values();
		Random r = new Random();
		for(int p = 0; p<n; p++){
			Karte neueKarte = new Karte(fb[r.nextInt(fb.length)], wb[r.nextInt(wb.length)]);
			Karten[p] = neueKarte;
		}
	}
	
	public void mischen(){
		Random r = new Random();
		for(int w = 0 ; w < Karten.length*20; w++){
			int eins = r.nextInt(Karten.length);
			int zwei = r.nextInt(Karten.length);
			Karte x = Karten[eins];
			Karte y = Karten[zwei];
			Karte xx = x;
			Karte yy = y;
			Karten[zwei] = xx;
			Karten[eins] = yy;
		}
	}
	
	public void KartenspielHinzufügen(Kartenspiel neu){
		Karte[] temp = new Karte[neu.Karten.length+Karten.length];
		for(int i = 0; i<Karten.length; i++){
			temp[i] = Karten[i];
		}
		System.out.println(Karten.length +" " + neu.Karten.length + " " + temp.length);
		// (Object src, int srcPos, Object dest, int destPos, int length)
		System.arraycopy(neu.Karten, 0, temp, Karten.length, neu.Karten.length);
		Karten = temp;
	}
	
	public void sort(){
		Arrays.sort(Karten);
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i<Karten.length; i++)
			sb.append(Karten[i].toString()+"\n");
		
		return sb.toString();
	}
}
