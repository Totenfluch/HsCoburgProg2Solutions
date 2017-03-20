package me.Christian.pack;

public class Wire implements Mobile{

	private Mobile a;
	private Mobile b;
	private double länge;
	private double al;
	private double bl;
	
	public Wire(Mobile a, Mobile b, double länge){
		this.a = a;
		this.b = b;
		this.länge = länge;
	}
	
	
	@Override
	public double weigh() {
		return a.weigh()+b.weigh();
	}

	@Override
	public void balance() {
		a.balance();
		b.balance();
		bl = a.weigh()*länge/(a.weigh()+b.weigh());
		al = b.weigh()*länge/(a.weigh()+b.weigh());
	}
	
	public String toString(){
		return a.toString() + " \n" + b.toString() + " \nlänge links:" + al + " \nlänge rechts:" + bl;
	}

}
