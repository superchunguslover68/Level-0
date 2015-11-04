

	import javax.swing.JOptionPane;

	/*
	 * I have a pocket full of change. I hate doing math. Make me a program that
	 * will calculate how much money I have without me having to use my noggin. Then
	 * make me a sandwich.
	 */
	
public class pooba {
		public static void main(String[] args) {

		String nickel= JOptionPane.showInputDialog("How many nickels you got?");
				// Ask the user how many nickels they have
             
			// Convert their answer to an int using Integer.parseInt()
      int n = Integer.parseInt(nickel);
			// Ask the user how many dimes they have, and convert their answer
      String dime= JOptionPane.showInputDialog("How many dimes you got?");
      int d= Integer.parseInt(dime);
			// Ask the user how many quarters they have, and convert their answer
      String quarter= JOptionPane.showInputDialog("How many quarters you got?");
      int q= Integer.parseInt(quarter);
			// Calculate how much money the user has and save it in a double variable 
      double money = (n * 5 + d * 10 + q * 25);
			// Tell the user how much money they have
      JOptionPane.showInputDialog("You have 1 million dollars! Nah you only have "+money/100);

		}
	}



