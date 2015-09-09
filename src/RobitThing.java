import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class RobitThing {
	
	Robot Ro = new Robot();	

	void go() {
		// 4. Make the robot move as fast as possible

		// 5. Set the pen width to 5

		// 6. Do steps #7 to #8 four times...

			// 7. Set the pen color to random
	
		drawSquare();
	
			// 8. Turn the robot 90 degrees to the right

	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		Ro.getX(rox);
		Ro.getY(roy);
		Ro.penDown();
		Ro.setSpeed(1000000);
	for (int i = 0; i < 4; i++) {
		
	}	
		Ro.setPenColor(rox, roy, 60 );
		Ro.move(100);
		Ro.turn(90);
		}
		JOptionPane.showMessageDialog(null "you dun messed up scrub");

		
		
	

	public static void main(String[] args) {
		new RobitThing().go();
	}

}



