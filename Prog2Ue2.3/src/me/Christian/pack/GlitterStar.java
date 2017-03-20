package me.Christian.pack;

public class GlitterStar extends Star implements Mobile{

	public GlitterStar(double star1) {
		super(star1);
	}
	
	public void decorate(){
		setGewicht(getGewicht()+1);
	}

}
