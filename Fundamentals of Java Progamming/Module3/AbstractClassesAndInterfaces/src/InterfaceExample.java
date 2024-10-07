/**
 * InnerInterfaceExample
 */
interface IABCBank {
	void openAccount();
	void closeAccount();
}

interface IBankAccount {

	default void message() {
			System.out.println("Using the default from interface to child");
	}
	void deposit();
	void withdraw();
	void balance();
	
}

class Saving implements IBankAccount, IABCBank {

	@Override
	public void deposit() {
		System.out.println("Deposit into Saving Account");
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw from Saving Account");
	}

	@Override
	public void balance() {
		System.out.println("Balance in Saving Account");
		
	}

	//from ABCBank
	@Override
	public void openAccount() {
		System.out.println("Open Savings Account");
	}

	@Override
	public void closeAccount() {
		System.out.println("Close Savings Account");
	}


}

public class InterfaceExample {

	public static void main(String[] args) {
		
		Saving s = new Saving();

		//Cannt create an object of an intereface
		//IABCBank abcb = new IABCBank();
		//but can acces the methods from inheretance if the are default type if like to give a definition to this method which
		//can be accessed from child class
		s.message();

		s.deposit();
		s.withdraw();
		s.balance();

	}
}