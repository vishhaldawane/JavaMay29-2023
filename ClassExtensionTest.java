
public class ClassExtensionTest {
	public static void main(String[] args) {
		Doctor x = new Doctor();
		x.diagnose(); // early binding - x.Doctor.diagnose();
		
		Surgeon s = new Surgeon();
		s.diagnose(); // early binding - s.Surgeon.diagnose();
		
		HeartSurgeon hs = new HeartSurgeon();
		hs.diagnose(); // early binding -  hs.HeartSurgeon.diagnose();
		
		System.out.println("--------------------------");
		
		Doctor d = new Doctor();
		d.diagnose(); // binding is of d.Doctor.diagnose();
		
		d = new Surgeon(); // an "object reference to super class" 
						//can hold the memory address of its child too
		
		d.diagnose(); // d.Doctor.diagnose(); this assingment is
					//changed at runtime, since it points to a Surgeon now
					// d.Surgeon.diagnose();
		
		d = new HeartSurgeon();
		
		d.diagnose(); // d.Doctor.diagnose(); - COMPILE TIME - EARLY
						//d.HeartSurgeon.diagnose() - RUNTIME - LATE
	}
}
class Doctor {
	void diagnose() { //overridden - hidden
		System.out.println("Doctor:diagnose() called...ENT/BP check");
	}
}
class Surgeon extends Doctor { //isA
	/*void diagnose() { //overriding by the child class
		System.out.println("Surgeon:diagnose() called...CT scan...");
	}*/
}
class HeartSurgeon extends Surgeon { //isA
	/*void diagnose() { //overriding by the child class
		System.out.println("HeartSurgeon:diagnose() called...ECG scan...");
	}*/
}
