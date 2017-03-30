package me.Christian.pack;

public class PkwOAbs extends Pkw{
	private static double PkwOAbsacceleration = 2.0;
	private static double PkwOAbshoechstGeschwindigkeit = 160.0;
	public PkwOAbs(String name) {
		super(name, PkwOAbsacceleration, PkwOAbshoechstGeschwindigkeit);
	}
	
	public double stoppen(){
		double sa = ((geschwindigkeit/10.0)*(geschwindigkeit/10.0)) + (geschwindigkeit/10.0)*3; 
		return sa+getPosition();
	}
}
