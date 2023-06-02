import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
		//COTENT - ORANGE JUICE
		PhoneLog log1 = new PhoneLog("Reeta","missed",    LocalDateTime.of(2023, 6, 1, 10, 00, 20));
		PhoneLog log2 = new PhoneLog("Amit","dailled",    LocalDateTime.of(2023, 6, 1, 10, 20, 27));
		PhoneLog log3 = new PhoneLog("Deepak","recieved", LocalDateTime.of(2023, 6, 2, 10, 30, 21));
		PhoneLog log4 = new PhoneLog("Kashish","recieved",LocalDateTime.of(2023, 6, 2, 10, 45, 25));
		PhoneLog log5 = new PhoneLog("Dev","recieved",    LocalDateTime.of(2023, 6, 2, 11, 30, 30));
		System.out.println("Content is ready.....");
		
		//CONTAINER - GLASS
		ArrayList logList  = new ArrayList();
		System.out.println("Container is ready.....");
		
		logList.add(log1);
		logList.add(log2);
		logList.add(log3);
		logList.add(log4);
		logList.add(log5);
		System.out.println("Content is added to the Container....");
		
		Iterator iter = logList.iterator(); //got the STRAW
		System.out.println("Got the Iterator from the Container");

		System.out.println("Stepping thru the Iterator.....");
		while(iter.hasNext()) { //check if Iterator has contents in it
			PhoneLog x =(PhoneLog) iter.next();  //pickup the first objec which was added
			System.out.println("The Log : "+x);
		}
		System.out.println("--END--");
		
	}
}

class PhoneLog
{
	String name;
	String type; //missed,recieved,dialled
	LocalDateTime dateAndTime;
	
	public PhoneLog(String name, String type, LocalDateTime dateAndTime) {
		super();
		this.name = name;
		this.type = type;
		this.dateAndTime = dateAndTime;
	}
	@Override
	public String toString() {
		return "PhoneLog [name=" + name + ", type=" + type + ", dateAndTime=" + dateAndTime + "]";
	}
	
	
	
}
