package loggersdemo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DLmain {
	static Log logger = LogFactory.getLog(DLmain.class );
	public static void main(String[] args) {
		
		DrivingL dl = new DrivingL("Amisha",17, 0, 0);
		try {
			dl.checkall();
			System.out.println(dl);
			} catch (Exception e) {
				logger.error("error occure while applying driving licence for "+dl.getName());
				}
		DrivingL dl2 = new DrivingL("Sakshi",18, 1, 0);
		try {
			dl2.checkall();
			System.out.println(dl2);
			} catch (Exception e) {
				logger.error("error occure while applying driving licence for "+dl2.getName());
				}
		
		DrivingL dl3 = new DrivingL("Rita",34, 0, 1);
		try {
			dl3.checkall();
			System.out.println(dl3);
			} catch (Exception e) {
				logger.error("error occure while applying driving licence for "+dl3.getName());
				}
		DrivingL dl4 = new DrivingL("Akanksha",24, 0, 0);
		try {
			dl4.checkall();
			System.out.println(dl4);
			} catch (Exception e) {
				logger.error("error occure while applying driving licence for "+dl4.getName());
				}

		
	}
	

}
