
	// Copyright Angus Kewl Skewls 2013
	import javax.swing.JOptionPane;

	/**
	 * Airline registration 
	 * 
	 * You are writing a program for a new airline to take their registration information at the check-in counter
	 * and print their boarding pass. You need to collect the following information: 
	 * 		First name 
	 * 		Last name
	 * 		Destination airport 
	 * 		Birthday (for security purposes) 
	 * 		Male/female (for security purposes) 
	 * 
	 * Print the boarding pass in this format:
	 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
	 * Traveling to: DESTINATION
	 * 
	 * Toolbox: main() method, JOptionPane.showInputDialog, variables
	 * 
	 **/
	public class MoneyThing {
		public static void main(String[] args) {
		String FN = JOptionPane.showInputDialog("First Name");
		String LN = JOptionPane.showInputDialog("Last Name");
		String GOPLA = JOptionPane.showInputDialog("Place you are going to");
		String BD = JOptionPane.showInputDialog("Birth Date");
		String Sex = JOptionPane.showInputDialog("What is your sex");
		JOptionPane.showMessageDialog(null, LN+ "/ " +FN+ "(" +BD+", " +Sex+ ") "+"\n"+"desination: " +GOPLA);
		}
	}






