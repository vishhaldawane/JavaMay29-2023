
public class AssociationTest2 {
	public static void main(String[] args) {
		
		Curd curd = new Curd("thick",1500);
		Sugar sugar = new Sugar("brown",200);
		
		Kitchen myKitchen = new Kitchen();
		Lassi lassi = myKitchen.makeLassi(curd, sugar);
		System.out.println("Lassi is prepapred :"+lassi);
	}
}
class Kitchen
{
	
	//producesA				//usesA   usesA
	Lassi 		makeLassi(Curd c, Sugar s) {
		System.out.println("Creating lassi from "+c.getDensity()+" curd of quantity "+c.getQuantity()+" grams");
		System.out.println("Adding "+s.getColor()+" sugar of quantity "+s.getQuantity()+" grams");
		Lassi lassi = new Lassi(c.getDensity(), c.getQuantity()+s.getQuantity(), s.getQuantity()/10);
		return lassi;
	}
}
class Lassi {
	String density;
	int weight;
	int sweetnessLevel;
	public Lassi(String density, int weight, int sweetnessLevel) {
		super();
		this.density = density;
		this.weight = weight;
		this.sweetnessLevel = sweetnessLevel;
	}
	@Override
	public String toString() {
		return "Lassi [density=" + density + ", weight=" + weight + ", sweetnessLevel=" + sweetnessLevel + "]";
	}
	
	
}

class Sugar
{
	String color;
	int quantity;
	public Sugar(String color, int quantity) {
		super();
		this.color = color;
		this.quantity = quantity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
}

class Curd
{
	String density;
	int quantity;
	public Curd(String density, int quantity) {
		super();
		this.density = density;
		this.quantity = quantity;
	}
	public String getDensity() {
		return density;
	}
	public void setDensity(String density) {
		this.density = density;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}


