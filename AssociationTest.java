
public class AssociationTest {
	public static void main(String[] args) {
		Human human = new Human();
		human.feelHappy();
		human.think();
		human.generous();
		human.courageous();
	
	}
}

class Heart
{
	void pump() {
		System.out.println("Heart is pumping....");
	}
}
class Liver
{
	void produceBlood() {
		System.out.println("Producing blood...");
	}
}
class Kidney {
	void purifyBlood() {
		System.out.println("Purifying blood....");
	}
}
class Lung {
	void oxygenateBlood() {
		System.out.println("Oxygenate blood...");
	}
}
class Brain {
	void analyze() {
		System.out.println("Analyzing.....");
	}
}

class Human // <-- WHOLE entity 
{
	private Heart heart = new Heart(); //hasA - PART ENTITY - composition
	
	private Brain brain = new Brain();

	private Lung leftLung = new Lung();
	private Lung rightLung = new Lung();

	private Kidney leftKidney = new Kidney();
	private Kidney rightKidney = new Kidney();
	
	void courageous() {
		leftKidney.purifyBlood();
		rightKidney.purifyBlood();
	}
	void generous() {
		leftLung.oxygenateBlood();
		rightLung.oxygenateBlood();
	}
	void think() { 
		System.out.println("thinking....");
		brain.analyze();
	}
	void feelHappy() { 
		System.out.println("feeling....");
		heart.pump();
	}
}

class Person extends Human //using inheritance
{
	
}
