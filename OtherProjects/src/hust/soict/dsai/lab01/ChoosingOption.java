package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;
public class ChoosingOption {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null,"Do you want to change to the first class ticket?");
		JOptionPane.showMessageDialog(null, "You have chosen: "
			+ (option==JOptionPane.YES_OPTION?"yes":"No"));
		System.exit(0);
		}
}
//If I choose "cancel", the program will display "You've chosen: No"