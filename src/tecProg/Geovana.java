package tecProg;

import java.awt.Color;

import robocode.AdvancedRobot;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;

public class Geovana extends AdvancedRobot{
	
	public void run() {
		setBulletColor(Color.BLUE);
		setGunColor(Color.MAGENTA);
		setRadarColor(Color.PINK);
		setBodyColor(Color.BLACK);
//		setAdjustRadarForGunTurn(true);
//		setAdjustGunForRobotTurn(true);
//		int x = getWidth();
//		int y = getHeight();
		while(true) {
//			setTurnRadarRight(360);
		//	setTurnGunRight(360);
			ahead(150);
			turnRight(360);
			ahead(100);
			turnLeft(30);
			execute();
			}
	}
	public void onScannedRobot(ScannedRobotEvent e) {
//		double angulo=e.getBearing();
//		stop();
//		turnGunLeft(angulo);
//		if(e.getDistance()<200) {
//			fire(3);
//		}
//		else {
//			fire(1);
//		}
		fire(3);
	}
	public void onHitWall(HitWallEvent e) {
		back(100);
		turnLeft(90);
		setAhead(50);
	}
	public void onHitRobot(HitRobotEvent e) {
		double angulo=e.getBearing();
		stop();
		turnGunLeft(angulo);
		fire(3);
	}
	public void onHitByBullet(HitByBulletEvent e) {
		turnLeft(90);
		ahead(100);
	}

}
