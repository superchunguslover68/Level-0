import javax.swing.JOptionPane;

public class MedLibs {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a Shia-infested river, here's how to do it...");
		// If you find yourself having to cross a piranha-infested river, here's how to do it...

		// Get the user to enter an adjective
String ad= JOptionPane.showInputDialog("Adjective");
		// Get the user to enter a type of liquid
String li= JOptionPane.showInputDialog("Liquid");

		// Get the user to enter a body part
String bp= JOptionPane.showInputDialog("Body Part");

		// Get the user to enter a verb
String ve= JOptionPane.showInputDialog("Verb");

		// Get the user to enter a place
String pl= JOptionPane.showInputDialog("Place");

		 
		 JOptionPane.showMessageDialog(null, "Shia Lebouf is more "+ ad+"during the \n"
		 		+ " day, so cross "
		 		+ "the river at night. Shia Leboufs are attracted \n "
		 		+ "to fresh "+ li+" and will most likely "
		 		+ "take a bite out of your "+bp+" \n if you "+ve+". Whatever "
		 		+ "you do, if you have an open wound, try to find "
		 		+ "another way to getback to the "+pl+". Good luck!");
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		

	}
}

