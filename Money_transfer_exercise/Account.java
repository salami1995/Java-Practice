package Money_transfer_exercise;

public class Account {
	private String id;
	private String name;
	private int balance;

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public void credit(int amount) {
		if (checkParam(amount)) {
			this.balance += amount;
			System.out.println("Credit successfully");
		} else {
			System.out.println("Credit unsuccessfully");
		}
	}

	public void debit(int amount) {
		if (checkParam(amount) && checkBalance(amount)) {
			this.balance -= amount;
			System.out.println("Debit successfully");
		} else {
			System.out.println("Debit unsuccessfully");
		}

	}

	public void transferTo(Account account, int amount) {
		if (checkParam(amount) && checkBalance(amount)) {
			this.balance -= amount;
			account.balance += amount;
			System.out.println("Transfer successfully");
		} else {
			System.out.println("Debit unsuccessfully");
		}

	}
	
	public boolean checkParam(int param) {
		if (param > 0) {
			return true;
		} else {
			System.out.println("Invalid param");
			return false;
		}
	}

	public boolean checkBalance(int amount) {
		if (amount > balance) {
			System.out.println("Balance is not enought");
			return false;
		}
		return true;
	}

}
