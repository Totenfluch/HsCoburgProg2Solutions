package me.Christian.pack;

public class Zaehler {
	private int einer, zehner;
	void erhoeheUmEins() throws EinerUeberlauf{
		einer++;
		if(einer > 9)
			throw new EinerUeberlauf();
	}
	void erhoeheUmZehn() throws Ueberlauf{
		zehner++;
		if(zehner > 9)
			throw new Ueberlauf();
		System.out.println("Zehner" + zehner);
	}
	
	void zaehlen(){
		try{
			erhoeheUmEins();
		}catch(EinerUeberlauf eu){
			einer = 0;
			try{
				erhoeheUmZehn();
			}catch(Ueberlauf ue){
				System.out.println("Fehler aufgetreten: Ueberlauf!");
			}
		}
	}
	
	

}
