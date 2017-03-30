package me.Christian.pack;

public class Lkw extends Fahrzeug{
	private double ladung;
	private double maxLadung;
	private static double Lkwacceleration = 0.5;
	private static double Lkwhoechstegeschwindigkeit = 105.0;
	public Lkw(String name, double maxLadung){
		super(name, Lkwacceleration, Lkwhoechstegeschwindigkeit);
		this.maxLadung = maxLadung;
	}
	
	public double stoppen(){
		double bremsfaktor = 5.0;
		if(istVollBeladen())
			bremsfaktor = 3.0;
		double sa = 0.5 * (geschwindigkeit*geschwindigkeit)/bremsfaktor + (geschwindigkeit/10.0)*3; 
		return sa+getPosition();
	}
	
	public double ladung(){
		return ladung;
	}
	
	public double maxLadung(){
		return maxLadung;
	}
	
	public void beladen(double ladungInTonnen){
		if(ladung+ladungInTonnen > maxLadung){
			ladung = maxLadung;
			System.out.println("Ein Teil der Ladung konnte nicht eingeladen werden weil der Laster voll ist. ");
		}else
			ladung+=ladungInTonnen;
	}
	
	public void entladen(double ladungInTonnen){
		if(ladung-ladungInTonnen < 0)
			System.out.println("ERROR LADUNG < 0");
		else
			ladung-=ladungInTonnen;
	}
	
	public boolean istVollBeladen(){
		if(ladung==maxLadung)
			return true;
		return false;
	}
	
	public String toString(){
		return super.toString() + "Ladung: " + ladung + "t\nMaxLadung: " + maxLadung + "t\n";
	}
}
