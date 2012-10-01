package g8;

import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;

public class iBot extends AdvancedRobot {
	public void run() {
		while(true) {
			ahead(30);
			turnRight(20);
			// Her kommer logikk for robotens bevegelser
		}
	}
	
	public void onScannedRobot(ScannedRobotEvent event) {
		// SKYT når man ser en fiende
		fire(1);
	}
}
