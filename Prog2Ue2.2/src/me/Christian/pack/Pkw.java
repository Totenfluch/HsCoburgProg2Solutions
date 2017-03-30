package me.Christian.pack;

public class Pkw extends Fahrzeug{
	private static double Pkwacceleration = 2.0;
	private static double PkwhoechsteGeschwindigkeit = 160.0;
	
	public Pkw(String name){
		super(name, Pkwacceleration, PkwhoechsteGeschwindigkeit);
	}
	
	public Pkw(String name, double acc, double hoechst){
		super(name, acc, hoechst);
	}
	
	public double stoppen(){
		double sa = 0.5 * (geschwindigkeit*10.0)*(geschwindigkeit*10.0)+(geschwindigkeit/10.0)*3; 
		return sa+getPosition();
	}
}
