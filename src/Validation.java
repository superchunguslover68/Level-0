import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		
for (int i = 0; i < 10 ; i++) {
	int randomNumber = new Random().nextInt(5);
		// 2. On paper, write all the numbers that get printed when you run this class
		System.out.println(randomNumber);

		// 3. Use the randomNumber to give the user a random compliment.
if(randomNumber==0){JOptionPane.showMessageDialog(null, "u r tote bag me goat bag kewl mang");
}
if(randomNumber==1){JOptionPane.showMessageDialog(null, "u r dembo aka delicious edible monster beating orangatang");
}
if(randomNumber==2){JOptionPane.showMessageDialog(null, "u be cooler than the D. O. double G.");
}
if(randomNumber==3){JOptionPane.showMessageDialog(null, "you have a healthy tail bone");
}
if(randomNumber==4){JOptionPane.showMessageDialog(null, "I will not snap you over my leg like a bag of potato chips");
}
		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
	}
}
