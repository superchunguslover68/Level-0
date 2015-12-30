// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class buhnana
{
	
	public static void main(String[] args)
	{
		String swer = null;
		//1. ask the user if they like bananas
		String an = JOptionPane.showInputDialog(null, "Du u leik teh bananas?");
		//2. if they say no,
		if(an.equalsIgnoreCase("no")){ 
		JOptionPane.showMessageDialog(null, "why u gotta be h8ing on the blanabas?");
		}
		
		else{
swer =JOptionPane.showInputDialog("Wutz ur fav hobby?");
		
		JOptionPane.showMessageDialog(null, swer+ " would be much better with cockroaches... i mean bananas");
		}//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
	
	}

}
