
public class ClassExtensionTest {
	public static void main(String[] args) {
		
		Doctor x = new Doctor();
		x.diagnose(); // early binding - x.Doctor.diagnose();
		
		if(x instanceof Doctor) {
			System.out.println("YES, x is pointing at Doctor...");
		}
		else {
			System.out.println("No, x is NOT pointing at Doctor...");
		}
		
		System.out.println("---------------");
		
		Surgeon s = new Surgeon(); //A Surgeon is also a Doctor
		s.diagnose(); // early binding - s.Surgeon.diagnose();
		
		if(s instanceof Doctor) {
			System.out.println("YES, s is pointing at Doctor...");
		}
		else { 
			System.out.println("No, s is NOT pointing at Doctor...");
		}
		
		if(s instanceof Surgeon) {
			System.out.println("YES, s is pointing at Surgeon...");
		}
		else { 
			System.out.println("No, s is NOT pointing at Surgeon...");
		}
		System.out.println("--------------------------");

		
		HeartSurgeon hs = new HeartSurgeon();
		
		if(hs instanceof Doctor) {
			System.out.println("YES, hs is pointing at Doctor...");
		}
		else { 
			System.out.println("No, hs is NOT pointing at Doctor...");
		}
		
		if(hs instanceof Surgeon) {
			System.out.println("YES, hs is pointing at Surgeon...");
		}
		else { 
			System.out.println("No, hs is NOT pointing at Surgeon...");
		}
		
		if(hs instanceof HeartSurgeon) {
			System.out.println("YES, hs is pointing at HeartSurgeon...");
		}
		else { 
			System.out.println("No, hs is NOT pointing at HeartSurgeon...");
		}
		
		
		
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
		System.out.println("--------------------------------");
		
		
	}
}
class Doctor {
	void diagnose() { //overridden - hidden
		System.out.println("Doctor:diagnose() called...ENT/BP check");
	}
}
class Surgeon extends Doctor { //isA
	void diagnose() { //overriding by the child class
		System.out.println("Surgeon:diagnose() called...CT scan...");
	}
}
class HeartSurgeon extends Surgeon { //isA
	void diagnose() { //overriding by the child class
		System.out.println("HeartSurgeon:diagnose() called...ECG scan...");
	}
}
