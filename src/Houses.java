import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot r = new Robot();

	public static void main(String[] args) {
		r.setSpeed(100);
		r.setX(1);
		r.setY(580);
		r.penDown();

		for (int i = 1; i < 11; i++) {
        
			house(i*50);
			//small();
			//medium();
			//large();
		}
	}

	public static void house(String height) {
		r.setPenColor(0, 45, 255);
		if(height.equals("small")) {
		height = 60;
		}
		// create left side
		r.move(height);
		r.turn(90);
		// Create roof
		r.move(30);
		r.turn(90);
		// create right side
		r.move(height);
		r.turn(270);
		r.setPenColor(3, 255, 71);
		r.move(30);
		r.turn(270);
	}
	public static void small() {
		r.setPenColor(255, 3, 233);
		r.move(60);
		r.turn(90);
		r.move(30);
		r.turn(90);
		r.move(60);
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
