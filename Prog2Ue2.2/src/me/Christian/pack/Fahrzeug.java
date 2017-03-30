package me.Christian.pack;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Fahrzeug {
	private double TimeConvertValue = 3.6;
	protected double position;
	protected double geschwindigkeit;
	protected double acceleration = -1;
	protected double hoechstegeschwindigkeit = -1;
	private String name;
	
	public Fahrzeug(String name, double acceleration, double hoechstegeschwindigkeit){
		this.name = name;
		this.acceleration = acceleration;
		this.hoechstegeschwindigkeit = hoechstegeschwindigkeit;
	}
	
	// Getters und Setters
	public double getTimeConvertValue() {
		return TimeConvertValue;
	}

	public void setTimeConvertValue(double timeConvertValue) {
		TimeConvertValue = timeConvertValue;
	}

	public double getPosition() {
		return position;
	}

	public void setPosition(double position) {
		this.position = position;
	}

	public double getGeschwindigkeit() {
		return geschwindigkeit;
	}

	public void setGeschwindigkeit(double geschwindigkeit) {
		this.geschwindigkeit = geschwindigkeit;
	}

	public double getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(double acceleration) {
		this.acceleration = acceleration;
	}

	public double getHoechstegeschwindigkeit() {
		return hoechstegeschwindigkeit;
	}

	public void setHoechstegeschwindigkeit(double hoechstegeschwindigkeit) {
		this.hoechstegeschwindigkeit = hoechstegeschwindigkeit;
	}
	// Getters und Setters ende

	public double beschleunigen(double sekunden){
		if(position != 0 || geschwindigkeit != 0){
			System.out.println("FEHLER");
			return -1;
		}
		// v = (a*t)*Umrechnungs faktor m/s -> km/h
		// geschwindigkeit = v in km/h
		geschwindigkeit = (acceleration*sekunden)*TimeConvertValue;
		if(geschwindigkeit <= hoechstGeschwindigkeit()){
			double position = (0.5 * acceleration * (sekunden*sekunden))/1000.0;
			//System.out.println(sekunden);
			//System.out.printf("%.15f\n", position);
			//System.out.printf("%.5f\n", geschwindigkeit);
			return position;
		}else if(geschwindigkeit > hoechstGeschwindigkeit()){
			geschwindigkeit = hoechstGeschwindigkeit();
			double t1 = hoechstGeschwindigkeit()/(TimeConvertValue*acceleration);
			double t2 = sekunden - t1;
			double pos1 = 0.5 * acceleration * t1 * t1;
			double pos2 = hoechstGeschwindigkeit()/TimeConvertValue * t2;
			position = (pos1+pos2)/1000;
			//System.out.println(name + ":~ Erreichte Geschwindigkeit. " + t1 + "s " + t2 + "s " + pos1 + "m " + pos2 + "m");
			return position;
		}
			
		return -1;
	}
	
	public double fahren(double minuten){
		position = position + ((geschwindigkeit/TimeConvertValue)*(minuten*60)/1000.0);
		//System.out.println(name + ":~ Position: " + position + "km");
		return position;
	}
	
	
	public double hoechstGeschwindigkeit(){
		return hoechstegeschwindigkeit;
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		geschwindigkeit = round(geschwindigkeit, 2);
		position = round(position, 2);
		sb.append(name + ":::\nGeschwindigkeit: " + geschwindigkeit + "km/h\n");
		sb.append("Position: " + position + "km\n");
		return sb.toString();
	}
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
}
