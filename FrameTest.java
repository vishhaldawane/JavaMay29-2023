import javax.swing.JFrame;
import javax.swing.JTextField;

public class FrameTest {
	public static void main(String[] args) {
		
		MyFrame myFrame1 = new MyFrame(250,100,100,300,"Train"); //3 //ctrl+shift+M to auto import
		MyFrame myFrame2 = new MyFrame(250,100,350,300,"Bus");  //3
		MyFrame myFrame3 = new MyFrame(250,100,650,300,"Car");  //3
		MyFrame myFrame4 = new MyFrame(250,100,950,300,"Bike");  //3
		
		/*myFrame1.run();
		myFrame2.run();
		myFrame3.run();
		myFrame4.run();*/
		
		Thread t1 = new Thread(myFrame1);
		Thread t2 = new Thread(myFrame2);
		Thread t3 = new Thread(myFrame3);
		Thread t4 = new Thread(myFrame4);
		
		
	/*	t1.start();
		t2.start();
		t3.start();
		t4.start();*/
		
		t1.run();
		t2.run();
		t3.run();
		t4.run();
		
		
		
		
	}
}

class MyFrame extends JFrame implements Runnable//isA 1
{
	JTextField tf = new JTextField(20); //hasA
	
	MyFrame(int w, int h, int x, int y, String title) {
		setSize(w,h);
		setLocation(x,y);
		setTitle(title);
		add(tf);
		setVisible(true);
	}
	public void run() { //2
		for (int i = 1; i <=500000; i++) {
			//System.out.println(title+" is running..."+i);
			tf.setText(""+i);
		}
	}
	
}
