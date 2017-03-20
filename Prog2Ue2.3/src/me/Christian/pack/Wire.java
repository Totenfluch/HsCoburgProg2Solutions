package me.Christian.pack;

public class Wire implements Mobile{

	private Mobile a;
	private Mobile b;
	private double l�nge;
	private double al;
	private double bl;
	
	public Wire(Mobile a, Mobile b, double l�nge){
		this.a = a;
		this.b = b;
		this.l�nge = l�nge;
	}
	
	
	@Override
	public double weigh() {
		return a.weigh()+b.weigh();
	}

	@Override
	public void balance() {
		a.balance();
		b.balance();
		bl = a.weigh()*l�nge/(a.weigh()+b.weigh());
		al = b.weigh()*l�nge/(a.weigh()+b.weigh());
	}
	
	public String toString(){
		return a.toString() + " \n" + b.toString() + " \nl�nge links:" + al + " \nl�nge rechts:" + bl;
	}

}
