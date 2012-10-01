import robocode.Robot;
import robocode.ScannedRobotEvent;

public class iBot extends Robot {
	public void run() {
		while(true) {
		// Her kommer logikk for robotens bevegelser
		}
	}
	
	public void onScannedRobot(ScannedRobotEvent event) {
		// SKYT når man ser en fiende
		fire(1);
	}
}
