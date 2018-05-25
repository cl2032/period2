package period2;
import robocode.*;

//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * LeungChristopher - a robot by (your name here)
 */
public class LeungChristopher extends Robot
{
	/**
	 * run: LeungChristopher's default behavior
	 */
	public void run() 
	{
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) 
		{
			// Replace the next 4 lines with any behavior you would like
			
			turnGunRight(360);
			ahead(100);
		
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) 
	{
		// Replace the next line with any behavior you would like
		
			double distance = e.getDistance();
	
	        if(distance<200)
	        {
	           fire(3);
	        }
	        else if(distance<500)
	        {
	           fire(2.5);
	        }
	        else if(distance<800)
	        {
	           fire(1.5);
	        }
	        else
	        {
	           fire(.4);
	        }
		
			turnGunLeft(30);
		
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		ahead(50);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		   double bearing = e.getBearing(); //get the bearing of the wall
    		turnRight(-bearing); //This isn't accurate but release your robot.
		    ahead(50); //The robot goes away from the wall.
	}	
}
