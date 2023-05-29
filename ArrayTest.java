
public class ArrayTest {
	public static void main(String[] args) {
		/*
		 * Array =  - group of variables
		 * 			- of similar type
		 * 			- stored in consecutive memory locations
		 * 			- referred by a common name 
		 * 
		 */
		//int players[] = {45,56,78,90,39,55}; // is of fixed size now
		int players[] = new int [ 11 ]; // size is 11 but values are 0
		
		players[0]=45;
		players[1]=56;
		players[2]=85;
		players[3]=145;
		players[4]=50;
		
		int totalScore=0;
		
		for (int i = 0; i < players.length; i++) {
			System.out.println(i+" Player score : "+players[i]);
			totalScore = totalScore + players[i];
		}
		System.out.println("Total score : "+totalScore);
		
		
	}
}
