package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		while(true) {
		Robot ro1 = new Robot(400, 700);
		Robot ro2 = new Robot(800, 700);
		Robot ro3 = new Robot(1200, 700);
		Robot ro4 = new Robot(800, 700);
		Robot ro5 = new Robot(1200, 700);
		Thread r1 = new Thread(()->draw(60, 180, Color.BLUE, ro1));
		Thread r2 = new Thread(()->draw(120, 240, Color.YELLOW, ro2));
		Thread r3 = new Thread(()->draw(180, 180, Color.BLACK, ro3));
		Thread r4 = new Thread(()->draw(240, 240, Color.GREEN, ro4));
		Thread r5 = new Thread(()->draw(300, 180, Color.RED, ro5));
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
		ro1.setWindowColor(Color.CYAN);
		}
	}
	private static Object draw(int x, int y, Color c, Robot r) {
		r.sparkle();
		r.setPenColor(c);
		r.moveTo(x, y);
		r.penDown();
		r.setSpeed(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.move(20);
		r.turn(10);
		r.unSparkle();
		r.hide();
		r.clear();
		return null;
	}
	
}

