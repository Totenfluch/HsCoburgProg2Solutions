package me.Christian.pack;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import me.Christian.pack.Calculator.OpCode;


@SuppressWarnings("serial")
public class CalculatorView extends JFrame implements KeyListener{

	protected Calculator c;
	
	private JTextField displayText;

	public CalculatorView(Calculator c){
		super();
		this.c = c;

		setFocusable(true);
		requestFocus();
		addKeyListener(this);
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});

		setTitle("Calculator");
		
		JMenuBar menuBar = new JMenuBar();
		JMenu ansicht = new JMenu("Ansicht");
		JMenuItem ansicht_normal = new JMenuItem("normal");
		ansicht_normal.addActionListener(a -> System.out.println("normal"));
		JMenuItem ansicht_wissen = new JMenuItem("Wissenschaftlich");
		ansicht_wissen.addActionListener(a -> System.out.println("wissen"));
		ansicht.add(ansicht_normal);
		ansicht.add(ansicht_wissen);
		
		JMenu resetmenu = new JMenu("Reset");	
		JMenuItem reset_reset = new JMenuItem("Reset");
		reset_reset.addActionListener(a -> {
			c.reset();
			displayText.setText("0.0");
		});
		resetmenu.add(reset_reset);
		
		menuBar.add(ansicht);
		menuBar.add(resetmenu);
		
		setJMenuBar(menuBar);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container_main = getContentPane();
		
		displayText = new JTextField("0.0");
		container_main.add(displayText, BorderLayout.NORTH);
		displayText.setHorizontalAlignment(JTextField.RIGHT);
		displayText.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		displayText.setEditable(false);

		Container inputNumbers = new Container();
		inputNumbers.setLayout(new GridLayout(3, 4));

		JButton seven = new JButton("7");
		seven.addActionListener(a -> c.setOperand(7));
		inputNumbers.add(seven);

		JButton eight = new JButton("8");
		eight.addActionListener(a -> c.setOperand(8));
		inputNumbers.add(eight);

		JButton nine = new JButton("9");
		nine.addActionListener(a -> c.setOperand(9));
		inputNumbers.add(nine);

		JButton four = new JButton("4");
		four.addActionListener(a -> c.setOperand(4));
		inputNumbers.add(four);

		JButton five = new JButton("5");
		five.addActionListener(a -> c.setOperand(5));
		inputNumbers.add(five);

		JButton six = new JButton("6");
		six.addActionListener(a -> c.setOperand(6));
		inputNumbers.add(six);

		JButton one = new JButton("1");
		one.addActionListener(a -> c.setOperand(1));
		inputNumbers.add(one);

		JButton two = new JButton("2");
		one.addActionListener(a -> c.setOperand(2));
		inputNumbers.add(two);

		JButton three = new JButton("3");
		three.addActionListener(a -> c.setOperand(3));
		inputNumbers.add(three);

		JButton zero = new JButton("0");
		zero.addActionListener(a -> c.setOperand(0));
		inputNumbers.add(zero);

		JButton dot = new JButton(".");
		dot.addActionListener(a -> a.getSource());
		inputNumbers.add(dot);

		JButton reset = new JButton("reset");
		reset.addActionListener(a -> {
			c.setOpcode(OpCode.NO_OPERATOR);
			c.setOperand(0);
			c.setOperand(0);
			displayText.setText("0.0");
		});
		inputNumbers.add(reset);


		Container operatorContainer = new Container();
		operatorContainer.setLayout(new GridLayout(5, 1));

		JButton plus = new JButton("+");
		plus.addActionListener(a -> c.setOpcode(OpCode.PLUS));
		operatorContainer.add(plus);

		JButton minus = new JButton("-");
		minus.addActionListener(a -> c.setOpcode(OpCode.MINUS));
		operatorContainer.add(minus);

		JButton mult = new JButton("*");
		mult.addActionListener(a -> c.setOpcode(OpCode.MULT));
		operatorContainer.add(mult);

		JButton divide = new JButton("/");
		divide.addActionListener(a -> c.setOpcode(OpCode.DIV));
		operatorContainer.add(divide);

		JButton equals = new JButton("=");
		equals.addActionListener(a -> {
			c.calculate();
			displayText.setText(""+c.getResult());
		});
		operatorContainer.add(equals);

		container_main.add(inputNumbers, BorderLayout.WEST);
		container_main.add(operatorContainer);



		pack();
		setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {
		switch(e.getKeyCode()){
		case KeyEvent.VK_NUMPAD0:
			c.setOperand(0); break;
		case KeyEvent.VK_NUMPAD1:
			c.setOperand(1); break;
		case KeyEvent.VK_NUMPAD2:
			c.setOperand(2); break;
		case KeyEvent.VK_NUMPAD3:
			c.setOperand(3); break;
		case KeyEvent.VK_NUMPAD4:
			c.setOperand(4); break;
		case KeyEvent.VK_NUMPAD5:
			c.setOperand(5); break;
		case KeyEvent.VK_NUMPAD6:
			c.setOperand(6); break;
		case KeyEvent.VK_NUMPAD7:
			c.setOperand(7); break;
		case KeyEvent.VK_NUMPAD8:
			c.setOperand(8); break;
		case KeyEvent.VK_NUMPAD9:
			c.setOperand(9); break;
		case KeyEvent.VK_PLUS:
			c.setOpcode(OpCode.PLUS);
		case KeyEvent.VK_MINUS:
			c.setOpcode(OpCode.MINUS);
		case KeyEvent.VK_MULTIPLY:
			c.setOpcode(OpCode.MULT);
		case KeyEvent.VK_DIVIDE:
			c.setOpcode(OpCode.DIV);
		case KeyEvent.VK_ENTER:{
			c.calculate();
			displayText.setText(""+c.getResult());
			break;
		}
		case KeyEvent.VK_BACK_SPACE:
			displayText.setText("0.0");
			break;
		}

	}
}
