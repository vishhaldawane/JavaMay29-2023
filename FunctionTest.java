
public class FunctionTest {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.cleanWhiteBoard();
		teacher.gotoLocation(45.3f, 90.7f);
		float foundAvg = teacher.calculateAverage(10, 11, 4);
		System.out.println("Average : "+foundAvg);
		
		double dist = teacher.whatIsTheDistanceBetweenTheEarthAndTheSun();
		System.out.println("Distance is : "+dist);
		
	}
}
class Teacher {
	//1. function without arguments and without return value
	void cleanWhiteBoard() { //rows columns
		System.out.println("1st type : clearing white board...");
	}
	
	//2. function with arguments BUT without return value
	void gotoLocation(float longitude, float lattitude) {
		System.out.println("Teacher is going to the location of longitude : "+longitude+" and lattitude : "+lattitude);
	}
	
	//3. function with arguments AND with return value
	float calculateAverage(int x, int y, int z) {
		System.out.println("Teacher is calculating average of "+x+","+y+" and "+z);
		float avg = (float) (x+y+z) / 3;
		return avg;
	}
	
	//4. function without arguments BUT with return value
	double whatIsTheDistanceBetweenTheEarthAndTheSun() {
		float SPEED_OF_LIGHT=186000.519f;
		float TIME_TO_REACH_ON_EARTH=480; //seconds
		double DISTANCE = SPEED_OF_LIGHT * TIME_TO_REACH_ON_EARTH;
		return DISTANCE;
	}
}
