import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot r = new Robot();
	static int height = 0;

	public static void main(String[] args) {
		r.setSpeed(100);
		r.setX(1);
		r.setY(580);
		r.penDown();

		for (int i = 1; i < 11; i++) {
			int random = new Random().nextInt(3);
			if (random == 0) {
				house("small", 1);

			}
			if (random == 1) {
				house("medium", 1);

			}
			if (random == 2) {
				house("large", 0);

			}

		}
	}

	public static void house(String size, int pointedroof) {
		int random1 = new Random().nextInt(255);

		r.setPenColor(random1, random1, random1);
		if (size.equals("small")) {
			height = 60;

		} else if (size.equals("medium")) {
			height = 120;

		} else if (size.equals("large")) {
			height = 250;

		}

		// create left side
		r.move(height);
		// Create roof
		if (pointedroof == 1) {
			drawPointyRoof();
		} else if (pointedroof == 0) {
			drawFlatRoof();
		}
		// create right side
		r.move(height);
		r.turn(270);
		r.setPenColor(13, 216, 82);
		r.move(30);
		r.turn(270);
	}

	public static void drawPointyRoof() {
		r.turn(45);
		r.move(30);
		r.turn(90);
		r.move(30);
		r.turn(45);
	}

	public static void drawFlatRoof() {
		r.turn(90);
		r.move(30);
		r.turn(90);
	}
}
