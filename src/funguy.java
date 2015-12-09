import org.jointheleague.graphical.robot.Robot;

public class funguy {
public static void main(String[] args) {
Robot d = new Robot();
d.moveTo(30, 500);
for (int i = 0; i < 5; i++) {
d.setSpeed(30000000);	

d.penDown();
d.turn(144);
d.move(30);
d.turn(144);
d.move(30);
d.turn(144);
d.move(30);
d.turn(144);
d.move(30);
d.turn(144);
d.move(30);
d.penUp();
int x =d.getX();
int y =d.getY();
d.moveTo(x=x+50, y);
d.penDown();
}
}
}
