
public class AccountTest {
	public static void main(String[] args) { //testing entity

		/*int accountNumber1=101;
		String accountHolder1="Sachin";
		float accountBalance1=50000;
		
		System.out.println("Account number  : "+accountNumber1);
		System.out.println("Account Holder  : "+accountHolder1);
		System.out.println("Account Balance : "+accountBalance1);
		
		System.out.println("-------------");
		
		int accountNumber2=102;
		String accountHolder2="Dhoni";
		float accountBalance2=60000;
		
		System.out.println("Account number  : "+accountNumber2);
		System.out.println("Account Holder  : "+accountHolder2);
		System.out.println("Account Balance : "+accountBalance2);
		
		System.out.println("-------------");
		
		int accountNumber3=103;
		String accountHolder3="Virat";
		float accountBalance3=70000;
		
		System.out.println("Account number  : "+accountNumber3);
		System.out.println("Account Holder  : "+accountHolder3);
		System.out.println("Account Balance : "+accountBalance3);
		*/
		
		Account accountObj1 = new Account();
		accountObj1.printAccount();
		accountObj1.setAccount(101, "Sachin", 50000);
		accountObj1.printAccount();
		float remBal1 = accountObj1.withdraw(5000);
		System.out.println("Remaining balance : "+remBal1);
		
		

		Account accountObj2 = new Account();
		accountObj2.printAccount();
		accountObj2.setAccount(102, "Virat", 60000);
		accountObj2.printAccount();
		float remBal2 = accountObj2.withdraw(6000);
		System.out.println("Remaining balance : "+remBal2);
		

		Account accountObj3 = new Account();
		accountObj3.printAccount();
		accountObj3.setAccount(103, "Dhoni", 70000);
		accountObj3.printAccount();
		float remBal3 = accountObj3.withdraw(7000);
		System.out.println("Remaining balance : "+remBal3);
		

		
		
	}
}

class Account
{
	int accountNumber; //DATA MEMBER
	String accountHolder;
	float accountBalance;
	
	//mutator
	void setAccount(int x, String y, float z) {
		System.out.println("Setting the intital account details....");
		accountNumber = x;
		accountHolder = y;
		accountBalance = z;
	}
	
	//accessor|printer
	void printAccount() { // MEBER METHOD 
		System.out.println("Account number  : "+accountNumber);
		System.out.println("Account Holder  : "+accountHolder);
		System.out.println("Account Balance : "+accountBalance);
		System.out.println("-------------------");
	}
	
	float withdraw(float amt) {
		System.out.println(accountHolder+" is withdrawing "+amt);
		accountBalance = accountBalance- amt;
		return accountBalance;
	}
	
}

