
public class InterfaceTest {
	public static void main(String[] args) {
		Reactive x = new Person();
		x.react();
		x.respond();
		x.proact();
		x.think();
	}
}
interface Reactive
{
	void react(); //default public and abstract 
}
interface Responsive 
{
	void respond();
}
interface Proactive {
	void proact();
}
class Human {
	void think() {
		System.out.println("Human is thinking.....");
	}
}
class Person extends Human implements Reactive, Responsive, Proactive {

	
	public void proact() {	
		System.out.println("Person is proactive...");
	}
	
	public void respond() {
		System.out.println("Person is responsive...");
	}

	public void react() {
		System.out.println("Person is reactive...");
	}

}



/*
class Animal
{
	void breathing() { }
}
class Bird extends Animal {
	
}
class Mammal extends Animal {
	
}
class Fish extends Bird,Mammal {
	
}
*/











