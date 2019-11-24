package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	Robot ro1 = new Robot(400, 700);
	Robot ro2 = new Robot(800, 700);
	Robot ro3 = new Robot(1200, 700);
	Robot ro4 = new Robot(800, 700);
	Robot ro5 = new Robot(1200, 700);
	Thread r1 = new Thread(()->timmy.move(400));
	Thread r2 = new Thread(()->tammy.move(400));
	Thread r3 = new Thread(()->sammy.move(400));
	
	r1.start();
	r2.start();
	r3.start();
}

