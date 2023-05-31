
public class KiteTest {
	public static void main(String[] args) {
	
		Kite.printKiteCount();
		Kite k1 = new Kite("Amit", "Blue", "50m", true);
		Kite k2 = new Kite("Sumit", "Yellow", "70m", true);
		Kite k3 = new Kite("Suresh", "Cyan", "80m", true);
		Kite k4 = new Kite("Jack", "Green", "90m", true);
		Kite.printKiteCount();
		
		k1.kiteFight(k2);
		
		Kite.printKiteCount();
	}
}
class Kite
{
	private String owner; // Object's data
	private String color;
	private String length;
	private boolean flying;
	
	private static int kiteCount; // Class's data
	public  static void printKiteCount() {
		System.out.println("Kite count : "+kiteCount);
	}
	
	public Kite(String owner, String color, String length, boolean flying) {
		super();
		this.owner = owner;
		this.color = color;
		this.length = length;
		this.flying = flying;
		++kiteCount;
	}
	@Override
	public String toString() {
		return "Kite [owner=" + owner + ", color=" + color + ", length=" + length + ", flying=" + flying + "]";
	}
	
	void kiteFight(Kite x) { //x is a proxy for k2
		System.out.println(owner+" has started kite fight with "+x.owner);
		for(int i=1;i<=10;i++) {
			double val = Math.random()%10; // 0 to 1
			System.out.println(i+" kite fight going on..."+val);
			if(val > 0.90) {
				System.out.println(x.owner+" lost the kite");
				kiteCount--;
				break;
			}
			else if(val < 0.10) {
				System.out.println(owner+" lost the kite");
				kiteCount--;
				break;
			}
			else if(val > 0.50 && val <=0.60) {
				System.out.println(owner+" and "+x.owner+" both have lost their kites");
				kiteCount--;
				kiteCount--;
				break;
			}
		}
	}
	
	
}










