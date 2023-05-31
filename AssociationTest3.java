import java.util.Arrays;

public class AssociationTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*FarmHouse myFarmHouse = new FarmHouse();
		Cow myCow 			  = myFarmHouse.getACow();
		Milk m 				  = myCow.milkACow();*/
		
		Cloth cloth1 = new Cloth("Jean", "Blue", "Jean", 2500);
		Cloth cloth2 = new Cloth("TShirt", "White", "Cotton", 1500);
		Cloth cloth3 = new Cloth("Pant", "Black", "Cotton", 3000);
		Cloth cloth4 = new Cloth("Shirt", "Yellow", "Linen", 3500);
		
		Cloth cloths[] = new Cloth[4];
		cloths[0]=cloth1;
		cloths[1]=cloth2;
		cloths[2]=cloth3;
		cloths[3]=cloth4;
		
		Water water = new Water(150, "SoftWater");
		Electricity elect = new Electricity("BEST", 30, 220);
		WashingPowder powder = new WashingPowder(50, "FrontLoad", 10,"Tide"); //50gm 10/- cost
		
		WashingMachine washingMachine = new WashingMachine();
		
		System.out.println("Cloths : "+Arrays.toString(cloths));
		
		Laundry laundry = washingMachine.wash(cloths,powder,water,elect);
				
		System.out.println("Laundry : "+laundry);
		
	}

}
class FarmHouse
{
	Cow getACow() {
		Cow cow = new Cow();
		return cow;
	}
}
//25 - unique 10 - 250
class Electricity {
	String type;
	float time;
	float volatage;
	public Electricity(String type, float time, float volatage) {
		super();
		this.type = type;
		this.time = time;
		this.volatage = volatage;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getTime() {
		return time;
	}
	public void setTime(float time) {
		this.time = time;
	}
	public float getVolatage() {
		return volatage;
	}
	public void setVolatage(float volatage) {
		this.volatage = volatage;
	}
	
	
	
}

class Powder { }

class WashingPowder extends Powder {
	int quantity;
	String type; //frontload / topload
	float cost;
	String brand;
	
	
	public WashingPowder(int quantity, String type, float cost, String brand) {
		super();
		this.quantity = quantity;
		this.type = type;
		this.cost = cost;
		this.brand = brand;
	}
	
	
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	
	
}

class Water {
	int quantity;
	String type;
	public Water(int quantity, String type) {
		super();
		this.quantity = quantity;
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}

class Cloth {
	String type; // T Saree Jean Pant 
	String color; //
	String fabric;
	float cost;
	public Cloth(String type, String color, String fabric, float cost) {
		super();
		this.type = type;
		this.color = color;
		this.fabric = fabric;
		this.cost = cost;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFabric() {
		return fabric;
	}
	public void setFabric(String fabric) {
		this.fabric = fabric;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Cloth [type=" + type + ", color=" + color + ", fabric=" + fabric + ", cost=" + cost + "]";
	}
	
	
	
	
}

class Laundry { 
	int numberOfCloths;
	int pricePerCloth;
	int totalCost;
	
	
	public int getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	public Laundry(int numberOfCloths, int pricePerCloth) {
		super();
		this.numberOfCloths = numberOfCloths;
		this.pricePerCloth = pricePerCloth;
	}
	public int getNumberOfCloths() {
		return numberOfCloths;
	}
	public void setNumberOfCloths(int numberOfCloths) {
		this.numberOfCloths = numberOfCloths;
	}
	public int getPricePerCloth() {
		return pricePerCloth;
	}
	public void setPricePerCloth(int pricePerCloth) {
		this.pricePerCloth = pricePerCloth;
	}
	@Override
	public String toString() {
		return "Laundry [numberOfCloths=" + numberOfCloths + ", pricePerCloth=" + pricePerCloth + ", totalCost="
				+ totalCost + "]";
	}
	
	
} 
class Machine { }
class Tub { }
class WashingTub extends Tub { } //isA
class WashingMachine extends Machine { //isA
	
	WashingTub washTub = new WashingTub(); //hasA
	
	//producesA			usesA				usesA		usesA		usesA
	Laundry wash(Cloth cloth[], WashingPowder wp, Water w, Electricity elect) {
	
		System.out.println("Water being used : "+w.getQuantity()+" ltr");
		System.out.println("Power being used : "+elect.getVolatage()+" volts for "+elect.getTime()+" mnts");
		System.out.println("Washing powder   : "+wp.getQuantity()+" grams of "+wp.getBrand()+" of "+wp.getType()+" type");
		Laundry laundry = new Laundry(cloth.length, 15);
		laundry.setTotalCost(cloth.length * 15);
		return laundry;
	}
}

class Cow
{
	//producesA
	Milk 	    milkACow() {
		Milk m = new Milk(5); 
		return m;
	}
}


