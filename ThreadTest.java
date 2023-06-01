
public class ThreadTest {
	public static void main(String[] args) {
		System.out.println("Begin main");
		Train train  = new Train(); //3
		Bus bus = new Bus(); //3
		Car car = new Car(); //3
		Bike bike = new Bike(); //3
		
		train.start(); // CPU scheduling
		bus.start(); // CPU scheduling
		car.start();  // CPU scheduling
		bike.start();  // CPU scheduling
		
		System.out.println("End main");
	}
}
class Train extends Thread//1
{
	public void run() { //2
		for (int i = 1; i <=50; i++) {
			System.out.println("Train is running..."+i);	
		}
	}
}

class Bus extends Thread //1
{
	public void run() { //2
		for (int i = 1; i <=50; i++) {
			System.out.println("\tBus is running..."+i);	
		}
	}
}

class Car extends Thread //1
{
	public void run() { //2
		for (int i = 1; i <=50; i++) {
			System.out.println("\t\tCar is running..."+i);	
		}
	}
}

class Bike extends Thread //1
{
	public void run() { //2
		for (int i = 1; i <=50; i++) {
			System.out.println("\t\t\tBike is running..."+i);	
		}
	}
}
