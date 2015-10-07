// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class M8_ball {

	public static void main(String[] args) {

		int randomNum = new Random().nextInt(4);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(randomNum);
		String yo = JOptionPane.showInputDialog("What would you like to know?");
		if (yo.contains("sacrifice")) {
			JOptionPane.showMessageDialog(null, "Sacrifice June!");}
			else{
		

		if (randomNum == 0) {
			JOptionPane.showMessageDialog(null, "Yes!");
		}

		if (randomNum == 1) {
			JOptionPane.showMessageDialog(null, "No");
		}

		if (randomNum == 2) {
			JOptionPane.showMessageDialog(null, "You should ask Siri");
		}

		if (randomNum == 3) {
			JOptionPane.showMessageDialog(null,
					"Ask Vish instead. Vish knows best. Vish legion out!");
		}
			}
	}
}
