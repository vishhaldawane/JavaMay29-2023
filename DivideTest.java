
public class DivideTest {
	public static void main(String[] args) { 
		
		System.out.println("BEGIN");
		
		int ary[]= {10,20,30};
		System.out.println("array "+ary[2]);
		
		String str="sbi";
		System.out.println("string 5th letter : "+str.toUpperCase());
		
		String str2="state bank of india";
		System.out.println("string 15th letter : "+str.charAt(15));
		
		Calculator calc = new Calculator();
		try {
			calc.divide(10, 0); //3 - here it is uncaught - it is rethrown to JVM - which drops it by terminating ur method here
		}
		catch(ArithmeticException e) {
			System.out.println("Problem1 : "+e);
		}
		catch(NullPointerException e) {
			System.out.println("Problem2 : "+e);
		}
		catch(RuntimeException e) {
			System.out.println("Problem3 : "+e);
		}
		catch(Exception e) {
			System.out.println("Problem4 : "+e);
		}
		
		
		
		
		
		try {
			calc.divide(20, 0);
		}
		catch(ArithmeticException e) {
			System.out.println("Problem : "+e);
		}
		
		try {
			calc.divide(30, 0);
		}
		catch(ArithmeticException e) {
			System.out.println("Problem : "+e);
		}
	}
}
class Calculator
{
	void divide(int num, int deno) {
		System.out.println("BEGIN Of DIVISION");
		System.out.println("Numerator  : "+num);
		System.out.println("denominator: "+deno);
		System.out.println("Trying to divide "+num+" by "+deno);
		int div = num / deno; // --> JVM --1--> CPU
							  //    --2--> throw new ArithmeticException("/ by zero");
		System.out.println("Division   : "+div);
		System.out.println("END OF DIVISION\n");
	}
}

