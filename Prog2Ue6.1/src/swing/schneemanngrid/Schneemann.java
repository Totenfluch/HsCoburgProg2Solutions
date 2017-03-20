package swing.schneemanngrid;

import java.awt.Graphics;
import java.awt.Color;

import javax.swing.*;

@SuppressWarnings("serial")
public class Schneemann extends JPanel {
	
	public Schneemann() {
		this.setBackground(Color.green);
		setBounds(20, 20, 400, 600);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	
		g.fillRect(220, 40, 60, 60); 
		g.fillRect(190, 100, 120, 30); 	// Hut
		g.setColor(Color.white);
		g.fillOval(190, 128, 120, 120);	// kopf
		g.setColor(Color.black);
		g.fillOval(220, 148, 12, 12); 	// linkes Auge
		g.fillOval(268, 148, 12, 12); 	// rechtes Auge
		g.setColor(Color.ORANGE);
		g.fillOval(240, 178, 20, 20); 	// Nase
		g.setColor(Color.black);
		g.drawArc(228,198, 40, 30, 0, -180); // Mund
		g.setColor(Color.WHITE);
		g.fillOval(140, 246, 220, 220); 	// Bauch
		g.setColor(Color.BLUE);
		int[] xP = {395,415,385, 365 };
		int[] yP = {180, 185,365, 360};
		g.fillPolygon(xP, yP, 4);
		g.setColor(Color.WHITE);
		g.fillRect(88, 280, 100, 45); 	// linker Arm
		g.fillRect(320, 280, 100, 45); 	// rechter Arm
		g.fillRect(180, 430, 40, 130); 	//linker Fuss
		g.fillRect(280, 430, 40, 130); 	// rechter Fuss
		g.setColor(Color.black);
		g.fillOval(240, 400, 17,17); 	// Bauchnabel
		g.setColor(Color.WHITE);
		g.setColor(new Color(151,125,105));
		g.drawLine(180, 560, 220, 560);
		g.drawLine(280, 560, 320, 560);		
	}

	
}
