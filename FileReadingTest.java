import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingTest {
	public static void main(String[] args) {
		
		try {
			System.out.println("Trying to read the file...");
			FileInputStream fin = new FileInputStream("d:\\prince.txt");
			System.out.println("File is ready for reading...");
			
			byte b = (byte) fin.read(); //READ THE FIRST LETTER  : it returns int value 
			while(b!=-1) { //-1 means EOF
				System.out.print((char)b);
				b = (byte) fin.read();
				Thread.sleep(100);
			}
			System.out.println("-----------------");
			System.out.println("CLOSING THE FILE ");
			fin.close();
			System.out.println("FILE IS CLOSED....");
		} catch (FileNotFoundException e) {
			System.out.println("File not found : "+e);
		} catch (IOException e) {
			System.out.println("SOME I/O Error : "+e);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
