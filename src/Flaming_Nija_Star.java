import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;


/*** Teacher's note ***/
 /* Before beginning recipe: 
 * 1. ask students to find and explain the variable in this recipe. 
 * 2. ask students what robot commands they think they will use to make picture in the laminated hand-outs. */

public class Flaming_Nija_Star {
	public static void main(String[] args) {
		int R = new Random().nextInt(600);
		int baseSize = 400 ;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms

		// 1. Make a new robot, and set it's pen down.
		Robot guy = new Robot("batman");
		
		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		guy.moveTo(1000, 300);
		// *15. Make some adjustments to see what other kinds of shapes you can make.

		// 12. Set the robot speed to 10
		guy.setSpeed(10);
		// 13. Make all the code below repeat 25 times
		for (int i = 0; i <  25; i++) {
			
		
			// 2. Turn the robot 1/8 of a circle
		guy.turn(360/8);
			// 3. Move the robot 64 pixels
		guy.move(18);
		guy.penDown();
			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
		guy.turn(-4);
		guy.setPenColor(Color.CYAN);
			// 5. Move the robot the distance in the variable flameSize
		guy.move(10);
			// 6. Turn the robot 170 degrees
		guy.turn(24);
			// 7. Move the robot the distance in the variable flameSize (again)
		guy.move(flameSize);
			// 8. Turn the robot 64 degrees to the right
		guy.setPenColor(Color.BLACK);
		guy.turn(64);
			// 9. Move the robot the distance in the variable baseSize
		guy.move(baseSize);
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			// 11. Color your ninja star like Figure 2.
		}
	}

}




