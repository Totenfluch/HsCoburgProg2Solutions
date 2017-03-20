package me.Christian.pack;

import me.Christian.pack.Calculator.OpCode;

public class CalculatorTest {
	public static void main(String[] args) {

		Calculator t = new Calculator();
		
		
		t.setOperand(4); 						// 4
		System.out.println(t.calculate()); 		// 4
		t.setOpcode(OpCode.MULT); 				// 4 * 
		t.setOperand(5); 						// 4 * 5
		t.setOperand(8); 						// 4 * 8 
		System.out.println(t);
		System.out.println(t.calculate()); 		// = 32
		t.setOpcode(OpCode.MINUS); 				// 32 - 
		t.setOperand(3); 						// 32 - 3
		System.out.println(t.calculate()); 		// = 29 
		t.setOpcode(OpCode.DIV); 				// 29 /
		t.setOpcode(OpCode.DIV); 				// 29 /
		t.setOpcode(OpCode.MULT); 				// 29 *
		System.out.println(t.calculate()); 		// 29 *
		t.setOperand(5); 						// 29 * 5
		t.setOpcode(OpCode.DIV); 				// 145 
		System.out.println(t.getResult()); 		// = 145
		t.setOperand(10); 						// 145 / 10 
		t.setOpcode(OpCode.DIV); 				// 14.5 / 
		System.out.println(t.getResult());
		System.out.println(t.calculate());		// 14.5 /
		t.setOpcode(OpCode.MINUS); 				// 14.5 -
		t.setOpcode(OpCode.PLUS); 				// 14.5 + 
		t.setOperand(.5);						// 14.5 + 0.5
		System.out.println(t.calculate()); 		// 15

		t.setOperand(4); 						// 4
		System.out.println(t.calculate()); 		// 15
		t.setOpcode(OpCode.MULT); 				// 4 *
		t.setOpcode(OpCode.MULT); 				// 4 *
		t.setOperand(0);						// 4 * 0
		System.out.println(t.calculate());		// 0
		
		t.setOperand(8); 						// 8
		t.setOpcode(OpCode.MULT); 				// 8 * 
		t.setOperand(5);						// 8 * 5
		System.out.println(t.calculate());		// 40 
		
		new CalculatorGUI();
		
	}
}
