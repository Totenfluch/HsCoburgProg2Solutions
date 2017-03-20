package me.Christian.pack;

public class Star implements Mobile{
	public double Gewicht;
	public Star(double star1){
		if(star1 < 0)
			throw new IllegalArgumentException();
		Gewicht = star1;
	}
	
	@Override
	public double weigh() {
		return Gewicht;
	}

	@Override
	public void balance() {}
	
	public String toString(){
		return "Star Gewicht: " + Gewicht;
	}

	public double getGewicht() {
		return Gewicht;
	}

	public void setGewicht(double gewicht) {
		Gewicht = gewicht;
	}

}
