import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingTest {
	public static void main(String[] args) {
		
		try {
			System.out.println("Trying to write to the file...");
			FileOutputStream fout = new FileOutputStream("d:\\king.txt", true);
			System.out.println("File is ready for writing...");
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter line : ");
			String theLine = scan.nextLine();
			
			byte dataAry[]= theLine.getBytes();
			System.out.println("Converted line into bytes");
			
			System.out.println("Writing the array to the file...");
			fout.write(dataAry);
			System.out.println("Array is written.....");
			
			System.out.println("-----------------");
			System.out.println("CLOSING THE FILE ");
			fout.close();
			System.out.println("FILE IS CLOSED....");
		} catch (FileNotFoundException e) {
			System.out.println("File not found : "+e);
		} catch (IOException e) {
			System.out.println("SOME I/O Error : "+e);
		} 
		
	}
}
