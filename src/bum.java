import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class bum {
	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		String col = JOptionPane.showInputDialog("What color would you like? (only red blue and yellow)");
		if (col.equals("red")) {

			Tortoise.setPenColor(Color.red);
		} else if (col.equals("blue")) {

			Tortoise.setPenColor(Color.blue);
		} else if (col.equals("yellow")) {

			Tortoise.setPenColor(Color.yellow);
		}
		String shape = JOptionPane.showInputDialog(
				"What shape do you want?( make sure it is not capital and can only be a square triangle or a square or even a circle)");
		if (shape.equals("square")) {
			chimpus();
		} else if (shape.equals("triangle")) {
			wimpus();

		} else if (shape.equals("circle")) {
			limpus();
		} else {
			JOptionPane.showMessageDialog(null, "This shape is invalid. Make sure you use no caps in the name.");
		}
	}

	private static void chimpus() {
		for (int i = 0; i < 4; i++) {
			Tortoise.move(30);
			Tortoise.turn(90);

		}

	}

	private static void wimpus() {
		for (int i = 0; i < 3; i++) {
			Tortoise.move(30);
			Tortoise.turn(120);

		}

	}

	private static void limpus() {
		for (int i = 0; i < 360; i++) {
			Tortoise.move(1);
			Tortoise.turn(1);

		}

	}
}
