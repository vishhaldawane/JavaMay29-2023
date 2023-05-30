import java.time.LocalDate;

public class OverridingTest {
	public static void main(String[] args) {
		SavingsAccount savings = new SavingsAccount();
		savings.setSavingsAccount(50000);
		savings.withdraw(4000);
		System.out.println("-------------");
		FixedDepositAccount fd = new FixedDepositAccount();
		fd.setFixedAccount(50000, LocalDate.of(2023, 05, 31));
		fd.withdraw(4000);
	}
}
class SavingsAccount {
	float balance;
	void setSavingsAccount(float initialBalance) {
		balance = initialBalance;
	}
	void withdraw(float amountToWithdraw) {
		if(amountToWithdraw < (balance-5000)) {
			balance -= amountToWithdraw;
			System.out.println("Savings Withdrawn : "+amountToWithdraw);
		}
		else 
			System.out.println("Cannot withdraw...");
		}
}
class FixedDepositAccount extends SavingsAccount {
	LocalDate accountMaturity;
	void setFixedAccount(float initialBalance, LocalDate md) {
		balance = initialBalance;
		accountMaturity = md;
	}
	void withdraw(float amountToWithdraw) {
		if(amountToWithdraw <= balance && accountMaturity.equals(LocalDate.now())) {
			balance -= amountToWithdraw;
			System.out.println("FD Withdrawn : "+amountToWithdraw);
		}
		else 
			System.out.println("Account not yet matured...");
		}
}
