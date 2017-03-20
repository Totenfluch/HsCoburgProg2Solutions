import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Digitaluhr {
	public static void main(String[] args){
		new Digitaluhr();
	}
	
	public Digitaluhr(){
		JFrame jp = new JFrame("Digital Clock");
		jp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container jpp = jp.getContentPane();
		jpp.setBackground(Color.ORANGE);
		jpp.add(new clock());
		
		Timer t1 = new Timer(1, ae->{
			jpp.repaint();
		});
		t1.start();
		jp.setSize(900, 300);
		jp.setVisible(true);
	}
}
