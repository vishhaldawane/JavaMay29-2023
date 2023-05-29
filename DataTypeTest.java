
class MyFamily
{
	final static int SIZE=10;
}

public class DataTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Data types..."+MyFamily.SIZE);

		byte nurseryRollNumber=120; // 1 
		System.out.println("My roll number is "+nurseryRollNumber);
		System.out.println("Size of byte is "+Byte.SIZE+" bits");
		
		short collegeRollNumber=32767; //2
		System.out.println("My college's roll number is "+collegeRollNumber);
		System.out.println("Size of short is "+Short.SIZE+" bits");

		
		int universityRollNumber=43000; //4
		System.out.println("University roll : "+universityRollNumber);
		System.out.println("Size of int is "+Integer.SIZE+" bits");
		
		long adharCardNumber=123412341234L;
		
		System.out.println("Adhaar card : "+adharCardNumber);
		System.out.println("Size of long is "+Long.SIZE+" bits");
		//92233 72036 85477 5807
		
		// BigDecimal // 40 digit
		
		//CTRL + F11
		
		float rateOfInterest=3.5F;
		System.out.println("the rate of interest is : "+rateOfInterest);
		System.out.println("Size of float is "+Float.SIZE+" bits");
		
		double molecularDistance=0.000023;
		System.out.println("molecular distance : "+molecularDistance);
		System.out.println("Size of double is "+Double.SIZE+" bits");
		
		char gender='M'; //single quotes
		System.out.println("gender is : "+gender);
		System.out.println("Size of char is "+Character.SIZE+" bits");
		
		boolean isCertified=true; // false or true | default is false
		System.out.println("Are you certified : "+isCertified);
		
		
	}

}








class Singer
{
	void sing() {
		System.out.println("Singer is singing...");
	}
	void practice() {
		System.out.println("Singer is practicing...");
	}
	void readLyricsNotes() {
		System.out.println("Singer is reading lyrics.....");
	}
}
