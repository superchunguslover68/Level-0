import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

import javafx.scene.paint.Color;

public class ChristmasTree {

	public static void main(String[] args) {
		ChristmasTree ohChristmasTree = new ChristmasTree();
		ohChristmasTree.drawStar();
		ohChristmasTree.drawTreeBody();
		ohChristmasTree.drawTreeTrunk();
	}

	double treeWidth = 15;
	double scale = 1.1;	//This is how much the width of the tree increases with each layer down

	void drawTreeBody() {
		// 8. Change the color of the line the tortoise draws to forest green	
		Tortoise.setPenColor(Colors.Purples.Orchid);
		// 1. Make a variable for turnAmount and set it to 175
 int tamt = 175;
 Tortoise.setSpeed(10);
		// 2. Start the Tortoise facing to the right
Tortoise.turn(90);
		// 5. Repeat steps 3 through 11, 11 times
for (int i = 0; i < 11; i++) {
	

			// 3. Move the tortoise the width of the tree
Tortoise.move(treeWidth);
			// 4. Turn the tortoise the current turnAmount to the right
Tortoise.turn(tamt);
			// 6. Set the treeWidth to the current treeWidth times the scale
treeWidth= treeWidth * scale;
			// 7. Move the tortoise the width of a tree again
Tortoise.move(treeWidth);
			// 9. Turn the tortoise the current turn amount to the LEFT
Tortoise.turn(tamt * -1);
			// 10. Set the treeWidth to the current treeWidth times the scale again
treeWidth = treeWidth * scale;
			// 11. Decrease turnAmount by 1
tamt = tamt --;
}
}
	
	void drawTreeTrunk() {
		// 1. Move the tortoise half the width of the tree
		Tortoise.move(treeWidth / 2);
		// 2. Change the tortoise so that it is pointing straight down
Tortoise.turn(90);
		// 4. Set the pen width to the tree width divided by 10
Tortoise.setPenWidth(treeWidth / 9);
		// 5. Change the color of the line the tortoise draws to brown
Tortoise.setPenColor(Colors.Yellows.Gold);
		// 3. Move the tortoise a quarter the tree width
Tortoise.move(treeWidth / 4);
	}
	
	void drawStar() {
		Tortoise.setSpeed(10);	// * Optional: Draw a red star on top of the tree. Hint: 144 degrees makes a star.
	for (int i = 0; i < 5; i++) {
		Tortoise.move(32);
		Tortoise.turn(144);
	}
	}

}
