
public class DivideTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.divide(10, 0);
		calc.divide(10, 3);
		calc.divide(10, 2);
	}
}
class Calculator
{
	void divide(int num, int deno) {
		System.out.println("BEGIN Of DIVISION");
		System.out.println("Numerator  : "+num);
		System.out.println("denominator: "+deno);
		System.out.println("Trying to divide "+num+" by "+deno);
		if(deno !=0) {
			int div = num / deno;
			System.out.println("Division   : "+div);
		}
		else {
			System.out.println("Cannot divide by ZERO");
		}
		System.out.println("END OF DIVISION\n");
	}
}

