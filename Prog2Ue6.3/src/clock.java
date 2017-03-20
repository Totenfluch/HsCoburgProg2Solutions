import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Date;

import javax.swing.JPanel;
import javax.swing.Timer;

public class clock extends JPanel{
	public clock() {
		this.setBackground(Color.green);
		setBounds(20, 20, 400, 600);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(new Font("Impact", 0, 26));
		g.setColor(Color.red);
		g.drawString(new Date().toString(), 260, 130);
	}
}
