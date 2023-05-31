
public class FinalDataTest {
	public static void main(String[] args) {	
		//final float PI=3.14f; // LOCAL VARIABLE
		//System.out.println("PI : "+PI);
		//PI=3.18f;
		//System.out.println("PI : "+PI);
		//final Account a = new Account(); // a is read only
		
		Circle circle = new Circle(50);
		circle.calcArea();
		
		Car car1 = new Car("MH-01-XW-9988");
		Car car2 = new Car("MH-02-TW-1188");
		Car car3 = new Car("MH-03-RW-3388");
		System.out.println("car1 "+car1);
		System.out.println("car2 "+car2);
		System.out.println("car3 "+car3);
		
	}
}
//class Account { }
class Car
{
	final String numberPlate;
	
	Car(String np) {
		numberPlate = np; //can set only once per object
	}
	void changeNumber(String np) {
		//numberPlate = np; //error - cannot change final
	}
	@Override
	public String toString() {
		return "Car [numberPlate=" + numberPlate + "]";
	}
	
}

class Circle
{
	final float PI=3.14f; // DATA MEMBER - static means once, final means read only = universal constant
	float radius;
	
	public Circle(float radius) {
		super();
		this.radius = radius;
	}
	void calcArea() {
		float area = PI * radius * radius;
		System.out.println("Area of circle : "+area);
	}
}
