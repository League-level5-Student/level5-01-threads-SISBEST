package _02_Advanced_Robot_Race;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	public static void main(String[] args) {
		Robot rbts[] = new Robot[5];
		for(int i = 0; i<rbts.length; i++) {
			Random r = new Random();
			rbts[i] = new Robot();
			rbts[i].setSpeed(Integer.MAX_VALUE);
			rbts[i].setX(0);
			rbts[i].setY(500);
			rbts[i].move(i*100);
			rbts[i].turn(90);
			rbts[i].setSpeed(100);
			rbts[i].penDown();
			rbts[i].setPenColor(r.nextInt(255), r.nextInt(255), r.nextInt(255));
		}	
		boolean finished = false;
		while(!finished) {
				Random r = new Random();
				Thread r1 = new Thread(()->rbts[0].move(r.nextInt(50)));
				Thread r2 = new Thread(()->rbts[1].move(r.nextInt(50)));
				Thread r3 = new Thread(()->rbts[2].move(r.nextInt(50)));
				Thread r4 = new Thread(()->rbts[3].move(r.nextInt(50)));
				Thread r5 = new Thread(()->rbts[4].move(r.nextInt(50)));
				r1.start();
				r2.start();
				r3.start();
				r4.start();
				r5.start();
				for(int i = 0; i<rbts.length; i++) {
				if(rbts[i].getX() >= 1000) {
					finished = true;
					rbts[i].sparkle();
					JOptionPane.showMessageDialog(null, "And we have a winner!");
				}
			}
		}	
}

}
