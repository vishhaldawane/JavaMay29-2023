
public class AbstractMethodTest {
	public static void main(String[] args) {
		
		GeometricalShape  gs = new Circle(55);
		gs.draw();
		
		gs = new Square(5);
		gs.draw();
		
		gs = new Triangle(10,4);
		gs.draw();
	}
}

abstract class GeometricalShape //incomplete
{
	float area;
	static final float PI=3.14f;
	
	abstract void draw(); //abstract
	
	void fillColor() { //non-abstract
		
	}
}
class Circle extends GeometricalShape
{
	int radius;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	void draw() { //mandatory implementation
		area =  PI * radius *radius;
		System.out.println("Drawing the Circle ...."+area);
	}
	//void fillColor is inherited - 
	//and not mandatory to be overridden
}

class Ellipse extends Circle //derivation
{
	int verticalradius;

	public Ellipse(int radius, int verticalradius) {
		super(radius);
		this.verticalradius = verticalradius;
	}
	void draw() { //mandatory implementation
		area =  PI * radius * verticalradius;
		System.out.println("Drawing the Ellipse ...."+area);
	}
}

class Square extends GeometricalShape
{
	int side;
	
	public Square(int side) {
		super();
		this.side = side;
	}
	void draw() { //mandatory implementation
		area = side * side; 
		System.out.println("Drawing the Square ...."+area);
	}
	//void fillColor is inherited - 
	//and not mandatory to be overridden
}
class Triangle extends GeometricalShape
{
	float base;
	float height;
		
	public Triangle(float base, float height) {
		super();
		this.base = base;
		this.height = height;
	}

	void draw() { //mandatory implementation
		area = 0.5f * base * height;
		System.out.println("Drawing the Triangle ...."+area);
	}
	//void fillColor is inherited - 
	//and not mandatory to be overridden
}

