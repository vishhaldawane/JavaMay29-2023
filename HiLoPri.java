//Demonstrate thread priorities
class Clicker  implements Runnable {
	long click = 0;
	Thread t;
	
	private volatile boolean running = true;

		public Clicker(int p)		{
			t = new Thread(this);
			t.setPriority(p);
		}

		public void run()		
		{
			while(running) 		
			{
				click++;
			}
		}

		public void stop()  {
			System.out.println("Trying to stop...");
			running=false;
			System.out.println("stopped...");
		}

		public void start() {
			t.start();
		}
}

public class HiLoPri			{
	public static void main(String[] args) 	{

		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		
		Clicker hi = new Clicker(Thread.MAX_PRIORITY); //10
		Clicker lo = new Clicker(Thread.MIN_PRIORITY); //1

		lo.start();
		hi.start();
		System.out.println("Waiting for 5 seconds....");
		try		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e) 		{
				System.out.println("Main thread interrupted");
		}
		
		lo.stop();
		hi.stop();

		//wait for child threads to terminate
		try		{
					   hi.t.join();
					   lo.t.join();
		}
		catch (InterruptedException e)		{
				System.out.println("InterruptedException caught");
		}

				System.out.println("Low-priority thread :  "+lo.click);
				System.out.println("Hi-priority thread  :  "+hi.click);
	}
}
//lo = 32678065
//hi = 1613291673

