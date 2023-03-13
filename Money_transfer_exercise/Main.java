package Money_transfer_exercise;

public class Main {

	public static void main(String[] args) {
		Account a = new Account("1", "Nguyen Van A", 50);
		Account b = new Account("1", "Le Van B", 10);
		System.out.println("Balance A: " + a.getBalance());
		System.out.println("Balance B: " + b.getBalance());
		System.out.println("========");

//		Cong tien vao tai khoan
		a.credit(5);
		b.credit(10);
		System.out.println("Balance A after credit: " + a.getBalance());
		System.out.println("Balance B after credit: " + b.getBalance());
		System.out.println("========");
		
//		Tru tien tai khoan
		b.debit(20);
		System.out.println("Balance A after debit: " + a.getBalance());
		System.out.println("Balance B after debit: " + b.getBalance());
		System.out.println("========");
		
//		Chuyen tien tu a sang b
		a.transferTo(b, 55);
		System.out.println("Balance A after transfer: " + a.getBalance());
		System.out.println("Balance B after transfer: " + b.getBalance());
	}

}
