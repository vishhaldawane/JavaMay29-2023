
public class FunctionOverloadingTest {
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.jump();
		tiger.jump(10);
		tiger.jump(3.5f, 12);
		tiger.jump(8,10.5f);
	}
}
class Tiger
{
	void jump() {
		System.out.println("Tiger is jumping...");
	}
	void jump(int length) { // number of args same, type is diff
		System.out.println("Tiger is jumping...length : "+length+" feet");
	}
	void jump(float length) { // number of args same, type is diff
		System.out.println("Tiger is jumping...length : "+length+" feet");
	}
	
	void jump(int length, float height) { // number of args same, type is same, sequence is diff
		System.out.println("Tiger is jumping...length : "+length+" feet and height : "+height+" feet");
	}
	void jump(float height, int length) { // number of args same, type is same, sequence is diff
		System.out.println("Tiger is jumping...height : "+height+" feet and length : "+length+" feet");
	}
}
