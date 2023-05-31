
public class AbstractMethodTest {
	public static void main(String[] args) {
		
		GeometricalShape  gs = new Circle();
		gs.draw();
		
		gs = new Square();
		gs.draw();
		
		gs = new Triangle();
		gs.draw();
	}
}

abstract class GeometricalShape //incomplete
{
	abstract void draw(); //abstract
	
	void fillColor() { //non-abstract
		
	}
}
class Circle extends GeometricalShape
{
	void draw() { //mandatory implementation
		System.out.println("Drawing the Circle ....");
	}
	//void fillColor is inherited - 
	//and not mandatory to be overridden
}
class Square extends GeometricalShape
{
	void draw() { //mandatory implementation
		System.out.println("Drawing the Square ....");
	}
	//void fillColor is inherited - 
	//and not mandatory to be overridden
}
class Triangle extends GeometricalShape
{
	void draw() { //mandatory implementation
		System.out.println("Drawing the Triangle ....");
	}
	//void fillColor is inherited - 
	//and not mandatory to be overridden
}


