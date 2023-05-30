
public class SingleLevelMultiLevelTest {
	public static void main(String[] args) {
		GrandFather gf = new GrandFather();
		gf.farming();
		
		System.out.println("-----------");
		
		Father f = new Father();
		f.farming(); //inherited from parent
		f.banking(); //exclusive
		
		
		System.out.println("-----------");
		
		Child c = new Child();
		c.farming(); // inherited
		c.banking(); // inherited
		c.surfing(); // exclusive
	}
}
class GrandFather // extends Object - parent of all the classes in JAVA
{
	//there is a default ctor
	//invisible to us
	//it does NOTHING
	
	GrandFather() { //this is not at all a default ctor/cause it is visible
			//it is known as explicit no-arg ctor
		super();
		System.out.println("GrandFather() ctor .....");
		
	}
	void farming() {
		System.out.println("GrandFather is Farming using bull");
	}
	
}
class Father extends GrandFather
{
	Father() { //this is not at all a default ctor/cause it is visible
			//it is known as explicit no-arg ctor
		super();
		System.out.println("\tFather() ctor .....");
	}
	void banking() {
		System.out.println("Father is manual banking....");
	}
	void farming() {
		System.out.println("Father is Farming using tractor...");
	}
}

class Child extends Father 
{
	Child() { //this is not at all a default ctor/cause it is visible
			//it is known as explicit no-arg ctor
		super(); //- it is a default line of every ctor
		System.out.println("\t\tChild() ctor .....");
	}
	void surfing() { 
		System.out.println("Child is surfing..."); 
	}
	void banking() {
		System.out.println("Child is net-banking....");
	}
	void farming() {
		System.out.println("Child is Farming using robotic tractor..."); // John Deere
	}

}



class Person
{
	
}
class Student extends Person
{
	
}
class Employee extends Student
{
	
}