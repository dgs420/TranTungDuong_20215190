package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;
public class TwoFive {
	public static void main(String[] args)
    {
        
        String s1, s2;

		s1 = JOptionPane.showInputDialog(null, "Enter the first number: ", "Enter the first number",JOptionPane.INFORMATION_MESSAGE);
		s2= JOptionPane.showInputDialog(null, "Enter the second number: ", "Enter the second number",JOptionPane.INFORMATION_MESSAGE);
		double a = Double.parseDouble(s1);
		double b = Double.parseDouble(s2);
		
		double sum = a + b;
		double difference =  a - b ;
		double product = a * b;
		double quotient;
		
		String ans;
		if (b != 0) {
			quotient = a/b;
			ans = ("Sum: " + sum + "\nDifference: " + difference + "\nProduct: " + product + "\nQuotient: " + quotient);
			JOptionPane.showMessageDialog(null, ans, "Result", JOptionPane.INFORMATION_MESSAGE);
			}
		else {
			ans = ("Sum: " + sum + "\nDifference: " + difference + "\nProduct: " + product + "\nQuotient: Cannot divide by 0" );
		    JOptionPane.showMessageDialog(null, ans, "Result", JOptionPane.INFORMATION_MESSAGE);
		    }
		
		System.exit(0);
    }

}
