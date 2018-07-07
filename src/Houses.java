import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot r = new Robot();
int househeight;
	public static void main(String[] args) {
		r.setSpeed(100);
		r.setX(100);
		r.penDown();

		for (int i = 0; i < 3; i++) {
			house();
			small();
			medium();
			large();
		}
		r.turn(180);
		for (int i = 0; i < 3; i++) {
			house();
			small();
			medium();
			large();
		}

	}
	public static void drawhouse(String height, int colorRed, int colorGreen, int colorBlue) {
		if(height.equals("small")) {
			househeight = 60;
			small(househeight);
		}
		
		
	}

	public static void house() {
		r.setPenColor(0, 45, 255);
		// create left side
		r.move(100);
		r.turn(45);
		// Create roof
		r.move(30);
		r.turn(90);
		r.move(30);
		r.turn(45);
		// create right side
		r.move(100);
		r.turn(270);
		r.setPenColor(3, 255, 71);
		r.move(30);
		r.turn(270);
	}
	public static void small(int height) {
		r.setPenColor(255, 3, 233);
		r.move(height);
		r.turn(90);
		r.move(30);
		r.turn(90);
		r.move(height);
		r.turn(270);
		r.setPenColor(3, 255, 71);
		r.move(30);
		r.turn(270);
	}
	public static void medium() {
		r.setPenColor(213, 34, 107);
		r.move(100);
		r.turn(90);
		r.move(30);
		r.turn(90);
		r.move(100);
		r.turn(270);
		r.setPenColor(3, 255, 71);
		r.move(30);
		r.turn(270);
	}
	public static void large() {
		r.setPenColor(123, 34, 30);
		r.move(200);
		r.turn(90);
		r.move(30);
		r.turn(90);
		r.move(200);
		r.turn(270);
		r.setPenColor(3, 255, 71);
		r.move(30);
		r.turn(270);
	}
}
