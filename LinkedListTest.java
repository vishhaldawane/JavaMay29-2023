import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		//COTENT - ORANGE JUICE
		PhoneContact contact1 = new PhoneContact("Reeta","8292876543","reeta@gmail.com");
		PhoneContact contact2 = new PhoneContact("Seeta","7792876543","seeta@gmail.com");
		PhoneContact contact3 = new PhoneContact("Dev","8892876543","dev@gmail.com");
		PhoneContact contact4 = new PhoneContact("Kashish","5592876543","kashish@gmail.com");
		PhoneContact contact5 = new PhoneContact("Deepak","7792876543","deepak@gmail.com");
		
		System.out.println("Content is ready.....");
		
		//CONTAINER - GLASS
		LinkedList<PhoneContact> logList  = new LinkedList<PhoneContact>();
		System.out.println("Container is ready.....");
		
		logList.add(contact1);
		logList.add(contact2);
		logList.add(contact3);
		logList.add(contact4);
		logList.add(contact5);
		
		System.out.println("Content is added to the Container....");
		
		Iterator<PhoneContact> iter = logList.iterator(); //got the STRAW
		System.out.println("Got the Iterator from the Container");

		System.out.println("Stepping thru the Iterator.....");
		while(iter.hasNext()) { //check if Iterator has contents in it
			PhoneContact x= iter.next(); //pickup the first objec which was added
			System.out.println("The Contact: "+x);
		}
		System.out.println("--END--");
		
	}
}

class PhoneContact
{
	String name;
	String mobile; //missed,recieved,dialled
	String email;
	public PhoneContact(String name, String mobile, String email) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}
	@Override
	public String toString() {
		return "PhoneContact [name=" + name + ", mobile=" + mobile + ", email=" + email + "]";
	}
	
	
	
}
