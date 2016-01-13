import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
/**
 * Fizz Buzz
 * 
 * In this project, we're going to build FizzBuzz. It's a children's game where
 * you count from 1 to 20. Easy, right? Here's the catch: instead of saying
 * numbers divisible by 3, say "Fizz". And instead of saying numbers divisible
 * by 5, say "Buzz". For numbers divisible by both 3 and 5, say "FizzBuzz".
 * 
 * So the rules are:
 * 		Any number divisible by 3 is replaced by the word fizz 
 * 		Any number divisible by 5 is replaced by the word buzz. 
 * 		Numbers divisible by both 3 and 5 become fizzbuzz.
 * 
 * Print your results to the console, or using JOptionPane if you like.
**/

public class FuzzBuzzLightyear {
	public static void main(String[] args) {
		
		int dumber = 0;
for (int i = 0; i < 20; i++) {
dumber++;

if(dumber%3 + dumber%5 ==0  ){
JOptionPane.showMessageDialog(null, "Go Buzz Lightyear");	
}	

else if(dumber%3 == 0){
JOptionPane.showMessageDialog(null, "go fish");
}
else if(dumber%5 == 0){
JOptionPane.showMessageDialog(null, "Buzz Lightyear");
}
else{
JOptionPane.showMessageDialog(null, dumber);
}
}
}




	}

