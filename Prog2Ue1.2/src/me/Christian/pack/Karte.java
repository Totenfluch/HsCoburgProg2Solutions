package me.Christian.pack;

public class Karte implements Comparable<Karte>{
	private Farbe f;
	private Wert w;
	public Karte(Farbe f, Wert w){
		this.f = f;
		this.w = w;
	}
	
	public String toString(){
		return f+"-"+w;
	}
	
	public Farbe getFarbe(){
		return f;
	}

	@Override
	public int compareTo(Karte o) {
		if(f.ordinal() < o.f.ordinal())
			return -1;
		else if(f.ordinal() > o.f.ordinal())
			return 1;
		else
			return 0;
	}
}

enum Farbe{
	KREUZ,
	PIK,
	HERZ,
	KARO
}

enum Wert{
	SIEBEN,
	ACHT,
	NEUN,
	ZEHN,
	BAUER,
	DANE,
	KOENIG,
	ASS
}
