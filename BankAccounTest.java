import java.time.LocalDate;

public class BankAccounTest {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount(101, "Sachin", 5000000);
		System.out.println("ba "+ba);//toString() is invoked
		
		SavingsAccount savings = new SavingsAccount(102, "Dhoni", 6000000, 4.5);
		System.out.println("savings "+savings);//toString() is invoked
		
		FixeDepositAccount  fd = new FixeDepositAccount(103, "Virat", 7000000, 8.5, LocalDate.of(2025, 12, 31));
		System.out.println("Fixed : "+fd);
	}
}
class BankAccount //extends Object -- 11 functions
{
	int accountNumber;
	String accountHolderName;
	double accountBalance;
	
	public BankAccount(int accountNumber, String accountHolderName, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + "]";
	}
}

class SavingsAccount extends BankAccount 
{
	double interestRate; //EXTRA
																								//EXTRA

	public SavingsAccount(int accountNumber, String accountHolderName, double accountBalance, double interestRate) {
		super(accountNumber, accountHolderName, accountBalance);
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return "SavingsAccount [ " + super.toString() + ", interestRate=" + interestRate + "]";
	}
}
class FixeDepositAccount extends SavingsAccount {
	LocalDate maturityDate;

	public FixeDepositAccount(int accountNumber, String accountHolderName, double accountBalance, double interestRate,
			LocalDate maturityDate) {
		super(accountNumber, accountHolderName, accountBalance, interestRate);
		this.maturityDate = maturityDate;
	}

	@Override
	public String toString() {
		return "FixeDepositAccount [ " + super.toString() + ", maturityDate=" + maturityDate + "]";
	}
	
	
}
