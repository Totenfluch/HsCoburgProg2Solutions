package me.Christian.pack;

public class Artikellager<E extends Artikel> {
	Ort<E>[] orte;
	@SuppressWarnings("unchecked")
	public Artikellager(int anzahlOrte){
		orte = (Ort<E>[])new Ort[anzahlOrte];
		for(int i = 0; i<orte.length; i++)
			orte[i] = new Ort<E>(i);
	}

	public E auslagern(String artikelnummer){
		for(int i = 0; i<orte.length; i++){
			if(orte[i].istBelegt())
				if(orte[i].getEingelagertesElement().artikelNummer().equals(artikelnummer)){
					E tempe = orte[i].getEingelagertesElement();
					orte[i].entnehmen();
					return tempe;
				}
		}
		return null;
	}

	public boolean einlagern(E e){
		for(int i = 0; i<orte.length; i++){
			if(!orte[i].istBelegt()){
				orte[i].hinzufügen(e);
				return true;
			}
		}
		return false;

	}

	public int bestandSuchen(String artikelnummer){
		int c = 0;
		for(int i = 0; i<orte.length; i++){
			if(orte[i].istBelegt()){
					if(orte[i].getEingelagertesElement().artikelNummer().equals(artikelnummer))	
					c++;
			}
		}
		return c;
	}

	public String toString(){
		StringBuffer sb = new StringBuffer();
		int belegt = 0;
		for(int w = 0; w<orte.length; w++)
			if(orte[w].istBelegt()){
				belegt++;
			}
		sb.append(belegt + " von " + orte.length + " Plätze belegt:\n");
		for(int i = 0; i<orte.length; i++)
			sb.append(orte[i].toString() + "\n");
		return sb.toString();
	}
}
