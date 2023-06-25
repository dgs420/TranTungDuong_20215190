package hust.soict.globalict.swing;

import java.awt.*;
import javax.swing.*;

import hust.soict.globalict.swing.AWTAccumulator.WindowListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SwingAccumulator extends JFrame{
	private JTextField tfInput;
	private JTextField tfOutput;
	private int sum = 0;
	
	public SwingAccumulator() {
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(2,2));
		
		cp.add(new JLabel("Enter an Integer: "));
		
		tfInput = new JTextField(10);
		cp.add(tfInput);
		tfInput.addActionListener(new TFInputListener());
		
		cp.add(new Label("The Acummulated Sum is: "));
		
		tfOutput = new JTextField(10);
		tfOutput.setEditable(false);
		cp.add(tfOutput);
		
		setTitle("AWT Accumulator");
		setSize(350, 120);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingAccumulator accumulator= new SwingAccumulator();
		accumulator.addWindowListener (new WindowListener());
		}
	
	static class WindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	private class TFInputListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			int numberIn =Integer.parseInt(tfInput.getText());
			sum+=numberIn;
			tfInput.setText("");
			tfOutput.setText(sum + "");
			
		}
	}
}
