abstract class ABCBank{
	public void message() {
		System.out.println("Welcome to ABC Bank");
	}
	public static void messageStatic() {
		System.out.println("Welomce with a static call");
	}
	abstract void openAccount();
	abstract void closeAccount();
}

abstract class BankAccount extends ABCBank{
	abstract void deposit();
	abstract void withdraw();
	abstract void balance();
}


class SavingsAccount extends BankAccount {

	@Override
	void deposit() {
		System.out.println("Deposit into Saving Account");
	}

	@Override
	void withdraw() {
		System.out.println("Withdraw from Saving Account");
	}

	@Override
	void balance() {
		System.out.println("Balance in Saving Account");
		
	}


//from ABCBank
	@Override
	void openAccount() {
		System.out.println("Open Savings Account");
	}

	@Override
	void closeAccount() {
		System.out.println("Close Savings Account");
	}


}

class CurrentAccount extends BankAccount {

	@Override
	void deposit() {
		System.out.println("Deposit into Current Account");
	}

	@Override
	void withdraw() {
		System.out.println("Withdraw from Current Account");
	}

	@Override
	void balance() {
		System.out.println("Balance in Current Account");
		
	}

//from ABCBank
	@Override
	void openAccount() {
		System.out.println("Open Current Account");
	}

	@Override
	void closeAccount() {
		System.out.println("Close Current Account");
	}
}

public class AbstractClassExample {

	public static void main(String[] args) {

		SavingsAccount sa = new SavingsAccount();
		//Cannt create an object of an abstract class
		//ABCBank abcb = new ABCBank();
		//but can acces the methods from inheretance
		sa.message();

		//OR

		//Make the method static which can call the class so not need a reference or object, directly call it
		ABCBank.messageStatic();



		sa.openAccount();
		sa.deposit();
		sa.withdraw();
		sa.balance();
		sa.closeAccount();
		
		System.out.println("****************************************");

		CurrentAccount ca = new CurrentAccount();
		ca.openAccount();
		ca.deposit();
		ca.withdraw();
		ca.balance();
		ca.closeAccount();
	}
}