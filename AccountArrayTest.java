
public class AccountArrayTest {
	public static void main(String[] args) {
		
		Account accSet[] = new Account[11]; //will create 11 references, and not objects
		
		accSet[0] = new Account(); //this is object, "new" will create accountNumber, accountHolder, accountBalance
		accSet[1] = new Account(); 
		accSet[2] = new Account(); 
		accSet[3] = new Account();
		
		accSet[0].setAccount(101, "sachin", 50000);
		accSet[1].setAccount(102, "virat",  60000);
		accSet[2].setAccount(103, "dhoni",  70000);
		accSet[3].setAccount(104, "rohit",  80000);
		
		accSet[0].printAccount();
		accSet[1].printAccount();
		accSet[2].printAccount();
		accSet[3].printAccount();
		
		System.out.println("--------for loop------");
		for (int i = 0; i < accSet.length; i++) {
			if(accSet[i]!=null)
				accSet[i].printAccount();
			//else
			//	System.out.println("Account  is null");
		}
		
		
	}
}
