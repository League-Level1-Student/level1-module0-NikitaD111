import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
static Robot r = new Robot();
public static void main(String[] args) {
		
	r.setX(50);
	r.penDown();
	r.setSpeed(100);
house();
	
	
}
static void house(){
	r.move(100);
	r.turn(90);
	r.move(50);
	r.turn(90);
	r.move(100);
	r.turn(270);
	r.setPenColor(0,255,0);
	r.move(50);
}
}
