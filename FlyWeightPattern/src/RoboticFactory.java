import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {
	
	private static Map<String  , IRobot> 	roboticObjectcache = new HashMap<>();
	
	public static IRobot createRobot(String robotType) {
			if(roboticObjectcache.containsKey(robotType)) {
				return roboticObjectcache.get(robotType);
			}
			else {
				if(robotType == "HUMANOID") {
					Sprites humanoidsprites = new Sprites();
					IRobot humanoidObject = new HumanoidRobot(robotType, humanoidsprites);
					roboticObjectcache.put(robotType, humanoidObject);
					return humanoidObject;
				}
				else if(robotType == "ROBOTICDOG") {
					Sprites roboticDogsprites = new Sprites();
					IRobot roboticdogObject = new RoboticDog(robotType, roboticDogsprites);
					roboticObjectcache.put(robotType, roboticdogObject);
					return roboticdogObject;
				}
			}
		return null;
	}
}
