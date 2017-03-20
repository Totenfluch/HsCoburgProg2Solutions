package swing.schneemanngrid;

import java.awt.Color;
import java.awt.Container;
import java.awt.Rectangle;

import javax.swing.JFrame;

public class GUIMain {

	public static void main(String args[]) {
		
		// Fenster erzeugen
		JFrame wnd = new JFrame("Schneemann");
		wnd.setResizable(true);
		wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ContentPane holen
		Container c = wnd.getContentPane();
		c.setLayout(null);		// bedeutet: die Lage der Panels richtet sich ausschließlich nach deren Koordinaten/Größe
		
		// Panels erzeugen
		// Geometrie der einzelnen Panels im jeweiligen Konstruktor
		Schneemann sm = new Schneemann();
		sm.setBounds(new Rectangle(300, 200, 600, 900));
		Grid grid = new Grid();
		grid.setBackground(Color.RED);
		
		
		
		
		// Panels in den Container
		// Reihenfolge beachten
		c.add(grid);
		c.add(sm);
	
		// Hauptfenster Geometrie setzen
		wnd.setSize(700, 900);
		wnd.setLocation(100, 100);
		
		// Sichtbarkeit enstellen
		wnd.setVisible(true);
		
		
	}

}
