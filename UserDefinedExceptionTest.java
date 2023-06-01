import java.util.Iterator;

public class UserDefinedExceptionTest {
	public static void main(String[] args) {
		
		
			Car car;
			
			try {
				car = new Car();
				car.longDrive();	
			} 
			catch (TyrePressureException e) {
				System.out.println("Caught the problem 1 : goto authorized pump to refill the air : "+e); // exception name + message
			} 
			catch(BrakeFailedException e) {
				System.out.println("Caught the Problem 2 : goto the mechanic : "+e);
			}
			catch(TyrePuncturedException e) {
				System.out.println("Caught the Problem 3 :  goto the pucturewala : "+e);
			}
			
		
	}
}
class Car {

	
	Car() throws TyrePressureException // it is madantory for checked exceptions 
	{

		double val = Math.random()%10;
		if(val>=0.25 && val<=0.30) { //expecting 33/32 valid pressure 
			TyrePressureException tpe = new TyrePressureException("Oh no!!...I suspect the tyre pressure is low....");
			throw tpe; //literally throwing it
		}
		
	}
	
	void longDrive() {
		for (int i = 1; i <=35; i++) {
			System.out.println("driving..."+i);	
			double val = Math.random()%10;
			if(val>0.98) {
				//System.out.println("Tyre puctured.....");
				//RuntimeException rte = new RuntimeException("Oh No!!! tyre purctured.....");
				TyrePuncturedException tpe = new TyrePuncturedException("Oh No!!! tyre purctured.....");
				throw  tpe; //literally throwing it 
			}
			
			if(val>0.50 && val<0.52) {
				//System.out.println("Tyre puctured.....");
				//RuntimeException rte = new RuntimeException("Oh No!!! Brakes failed.....");
				BrakeFailedException rte = new BrakeFailedException("Oh No!!! Brakes failed.....");
				throw rte;
			}
		}
		
	}

}

class TyrePuncturedException extends RuntimeException {
	TyrePuncturedException(String str) {
		super(str);
	}
}
class BrakeFailedException extends RuntimeException {
	BrakeFailedException(String str) {
		super(str);
	}
}

//checked
class FuelException extends Exception {
	FuelException(String str) {
		super(str);
	}
}
class TyrePressureException extends Exception {
	TyrePressureException(String str) {
		super(str);
	}
}


