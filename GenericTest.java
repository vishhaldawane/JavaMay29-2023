
public class GenericTest {
	public static void main(String[] args) {

		//IntegerBag intBag = new IntegerBag(10, 20);
		//AnyBag          intBag = new AnyBag(10, 20);
		AnyBag<Integer> intBag = new AnyBag<Integer>(10, 20);
		intBag.print();
		intBag.swap();
		intBag.print();
		
		System.out.println("----------------");
		
		//FloatBag floBag = new FloatBag(12.5f, 90.5f);
		AnyBag<Float> floBag = new AnyBag<Float>(10.5f, 20.6f);
		floBag.print();
		floBag.swap();
		floBag.print();
		
		System.out.println("----------------");
		//StringBag strBag = new StringBag("Ping","Pong");
		AnyBag<String> strBag = new AnyBag<String>("Romio", "Juliet");
		strBag.print();
		strBag.swap();
		strBag.print();
		
		
	}
}

class AnyBag<T>
{
	T i;
	T j;
	
	public AnyBag(T i, T j) {
		super();
		this.i = i;
		this.j = j;
	}
	
	void print() {
		System.out.println("i "+i);
		System.out.println("j "+j);
	}
	void swap() {
		System.out.println("Swapping ..");
		T temp = i;
		i = j;
		j = temp;
	}
}

/*
class IntegerBag
{
	int i;
	int j;
	
	public IntegerBag(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	
	void print() {
		System.out.println("i "+i);
		System.out.println("j "+j);
	}
	void swap() {
		System.out.println("Swapping integers...");
		int temp = i;
		i = j;
		j = temp;
	}
}
class FloatBag
{
	float i;
	float j;
	
	public FloatBag(float i, float j) {
		super();
		this.i = i;
		this.j = j;
	}
	
	void print() {
		System.out.println("i "+i);
		System.out.println("j "+j);
	}
	void swap() {
		System.out.println("Swapping floats...");
		float temp = i;
		i = j;
		j = temp;
	}
}

class StringBag
{
	String i;
	String j;
	
	public StringBag(String i, String j) {
		this.i = i;
		this.j = j;
	}
	
	void print() {
		System.out.println("i "+i);
		System.out.println("j "+j);
	}
	void swap() {
		System.out.println("Swapping String ...");
		String temp = i;
		i = j;
		j = temp;
	}
			
	
	
}*/


