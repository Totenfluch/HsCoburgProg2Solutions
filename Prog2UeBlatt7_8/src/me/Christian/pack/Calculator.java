package me.Christian.pack;

/**
 * Klasse stellt einen rudimentären Taschenrechner für *, /, - und + zur
 * Verfügung, der sich maximal 2 Operanden merkt. Der Taschenrechner unterstützt
 * die infix Notation von arithmetischen Berechnungen z.B:
 * 
 * t.setOperand(4); 			// 4 
 * t.setOpcode(OpCode.MULT); 	// 4 * 
 * t.setOperand(5); 			// 4 * 5 
 * t.calculate(); 				// = 20
 * 
 * @author Volkhard Pfeiffer
 * 
 */
public class Calculator {

	/**
	 * Konstanten für die verschiedenen arithmetischen Operationen
	 *
	 */
	public enum OpCode {
		PLUS, MINUS, DIV, MULT, NO_OPERATOR
	}

	private double result; 		// 2. operand
	private double operand; 	// 1. operand
	private int opnb; 			// anzahl der gültigen Operanden
	private OpCode opcode; 		// aktuell eingestellte Operation

	/**
	 * Konstruktor: Defaultmässig führt der Taschenrechner die Operation + durch
	 * 
	 */
	public Calculator() {
		operand = 0;
		opnb = 1;
		opcode = OpCode.PLUS;
	}

	/**
	 * Führt eine Berechnung durch sofern 2 Operanden gesetzt sind. Anschließend
	 * wird der opcode als aktueller Operationscode eingestellt
	 * 
	 * @param Operationscode
	 */
	public void setOpcode(OpCode o) {
		calculate();
		opcode = o;
	}

	/**
	 * Setzt einen Operanden des Taschenrechners
	 * 
	 * @param operand
	 */
	public void setOperand(double operand) {

		if (opnb == 1) {
			if (opcode == OpCode.NO_OPERATOR)
				result = operand;
			opnb++;
		}
		this.operand = operand;

	}

	/**
	 * Liefert aktuelles Zwischenergebnis des Taschenrechners zurück
	 * 
	 * @return aktuelles Zwischenergebnis
	 */
	public double getResult() {
		return result;
	}

	/**
	 * Liefert aktuellen operand des Taschenrechners zurück
	 * 
	 * @return aktueller Operand
	 */
	public double getOperand() {
		return operand;
	}

	/**
	 * Führt die aktuell eingestellte Operation mit dem aktuell eingestellten
	 * Zwischenergebnis sowie des aktuell eingestellten Operanden durch.
	 * Anschließend wird der opcode auf NO_OPERATOR gestellt. Falls zu wenig
	 * Operanden eingestellt sind bzw. kein gültiger Operator, wird keine Berechnung durchgeführt.
	 * 
	 * * @return aktuelles Zwischenergebnis nach Durchführung der Berechnung
	 * 
	 */
	public double calculate() {

		if (opnb == 2) {
			switch (opcode) {

			case PLUS:
				result += operand;
				break;
			case MINUS:
				result -= operand;
				break;
			case DIV:
				if (operand != 0)
					result /= operand;
				break;
			case MULT:
				result *= operand;
				break;
			default:
				break;
			}

			opcode = OpCode.NO_OPERATOR;
			operand = 0;
			opnb--;
		}
		return result;

	}

	/**
	 * Setzt den Operanden und das Zwischenergebnis auf 0 sowie die eingestellte
	 * Opcode zurück auf NO_OPERATOR
	 * 
	 */
	public void reset() {
		opcode = OpCode.NO_OPERATOR;
		operand = result = 0;
	}

	/**
	 * toString
	 * 
	 * * @return Taschenrechner Instanzvariablen als String
	 */
	public String toString() {
		String opc = "";
		switch (opcode) {

		case PLUS:
			opc = "+";
			break;
		case MINUS:
			opc = "-";
			break;
		case DIV:
			opc = "/";
			break;
		case MULT:
			opc = "*";
			break;
		case NO_OPERATOR:
			opc = "UNDEF";
			break;

		}

		return "" + opnb + ": " + operand + " " + opc + " " + result;
	}

}
