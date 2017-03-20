package me.Christian.pack;
import javax.swing.JFrame;

import me.Christian.pack.Calculator;

public class CalculatorGUI {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		CalculatorView view = new CalculatorView(c);
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
