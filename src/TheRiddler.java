import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0 ;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
	String answer = JOptionPane.showInputDialog("What kind of pizza is the good one");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (answer.equals ("Pepperoni")) { score = score +1;
			JOptionPane.showMessageDialog(null, answer+" is correct! Your new score is "+score);
		}
		else{
		JOptionPane.showMessageDialog(null, answer+" is incorrect :(. The correct answer was Pepperoni. Your score is "+score);
		}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
		String answe = JOptionPane.showInputDialog("Where did June go after the explosion?");
		// 2. Make a pop up to show the score.
		if (answe.equals("Everywhere")){
			score = score +1;
			JOptionPane.showMessageDialog(null, "Correct! your new score is "+score+"!");
		}
		else {
		JOptionPane.showMessageDialog(null, "That is incorrect :(. The correct answer was everywhere. Your score is "+score);
		}
		if(score ==2){ 
			JOptionPane.showMessageDialog(null, "You win!");
		}
		else { JOptionPane.showMessageDialog(null, "You Lose!");
		}
		JOptionPane.showMessageDialog(null, "the score is "+score+"!" );
	}
}

