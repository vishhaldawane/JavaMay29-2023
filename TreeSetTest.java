import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		
		TreeSet<Integer> myNumSet = new TreeSet<Integer>();
		System.out.println("Container is ready....");
		
		System.out.println("adding 1st value");
		myNumSet.add(50);
		
		System.out.println("adding 2nd value");
		myNumSet.add(30);
		
		System.out.println("adding 3rd value");
		myNumSet.add(40);
		
		System.out.println("adding 4th value");
		myNumSet.add(90);
		
		System.out.println("adding 5th value");
		myNumSet.add(60);
		
		System.out.println("adding 6th value");
		myNumSet.add(20);
		
		System.out.println("adding 7th value");
		myNumSet.add(95);
		
		System.out.println("Content is added....");
		
		Iterator<Integer> iter = myNumSet.iterator();
		while(iter.hasNext()) {
			Integer inum = iter.next();
			System.out.println("value : "+inum);
		}
		
		
	}
}
