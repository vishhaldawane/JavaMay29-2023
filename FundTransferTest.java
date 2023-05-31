
public class FundTransferTest {
	public static void main(String[] args) {
	
		SavingsAccount savings1 = new SavingsAccount(60000);
		SavingsAccount savings2 = new SavingsAccount(4000);
		
		System.out.println("Savings1 : "+savings1);
		System.out.println("Savings2 : "+savings2);
		
		FundTransferService fts = new FundTransferService();
		fts.fundTransfer(savings1, savings2, 10000);
		
		System.out.println("Savings1 : "+savings1);
		System.out.println("Savings2 : "+savings2);
		
	}
}
class FundTransferService
{
	void fundTransfer(Withdrawing source, Depositing target, float amtToTransfer) {
		System.out.println("Fund transfer in progress....");
		source.withdraw(amtToTransfer);
		target.deposit(amtToTransfer);
		System.out.println("Fund transferred.......");
	}
}
interface Withdrawing {
	void withdraw(float a);
}
interface Depositing {
	void deposit(float a);
}
class SavingsAccount implements Withdrawing, Depositing {
	
	float balance;

	public SavingsAccount(float balance) {
		super();
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "SavingsAccount [balance=" + balance + "]";
	}
	
	public void withdraw(float amt) {
		balance = balance - amt;
	}
	public void deposit(float amt) {
		balance = balance + amt;
	}
}
