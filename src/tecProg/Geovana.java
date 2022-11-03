package tecProg;

import java.awt.Color;

import robocode.AdvancedRobot;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;
import robocode.WinEvent;

public class Geovana extends AdvancedRobot{
	
	public void run() {
		setBulletColor(Color.PINK);
		setGunColor(Color.MAGENTA);
		setRadarColor(Color.PINK);
		setBodyColor(Color.BLACK);
		setScanColor(Color.BLACK);
//		setAdjustRadarForGunTurn(true);
//		setAdjustGunForRobotTurn(true);
//		int x = getWidth();
//		int y = getHeight();
		while(true) {
//			setTurnRadarRight(360);
		//	setTurnGunRight(360);
//			ahead(150);
//			turnRight(360);
			turnGunRight(360);
			ahead(100);
			turnLeft(30);
			execute();
			}
	}
	public void onScannedRobot(ScannedRobotEvent e) {
//		double angulo=e.getBearing();
		stop();
		double distancia=e.getDistance();
		if(distancia<300) {
//			turnGunRight(angulo);
			fire(5);
			scan();
		}
		fire(3);
		scan();
	}
	public void onHitWall(HitWallEvent e) {
		back(50);
		turnLeft(180);
//		setAhead(50);
	}
	public void onHitRobot(HitRobotEvent e) {
//		double angulo=e.getBearing();
//		stop();
//		turnGunLeft(angulo);
//		fire(3);
		turnRight(e.getBearing());
		fire(10);
		scan();
	}
	public void onHitByBullet(HitByBulletEvent e) {
		ahead(100);
		turnLeft(90);
		scan();
	}
	public void onHin(WinEvent e) {
		stop();
		turnRight(36000);
	}

}
