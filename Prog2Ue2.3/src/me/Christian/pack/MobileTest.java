package me.Christian.pack;

public class MobileTest {
	public static void main(String[] args){
		Star eins = new Star(9);
		GlitterStar zwei = new GlitterStar(4);
		Star drei = new Star(2);
		
		Mobile topWire = new Wire(new Wire(drei, zwei, 9), eins, 10);
		topWire.balance();
		System.out.println(topWire.toString());
		System.out.println();
		System.out.println("Der Glitzer Stern wurde 3x dekoriert\n");
		zwei.decorate();
		zwei.decorate();
		zwei.decorate();
		topWire.balance();
		System.out.println(topWire.toString());
	}
}
