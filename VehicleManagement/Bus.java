package VehicleManagement;

public class Bus extends Vehicle {
	private int seatNumber;

	public Bus(String color, String owner, double price, int seatNumber) {
		super(color, owner, price);
		this.seatNumber = seatNumber;
	}

	public void displayInfo() {
		System.out.println("Bus information: " + "Owner: " + this.getOwner() + " + Color: " + this.getColor()
				+ " + Price: " + this.getPrice() + " + Seat Number: " + this.seatNumber);
	}

	public void tax() {
		double VAT = this.getPrice() * 0.1;
		double registrationTax = this.getPrice() * 0.2;
		double exciseTax = 0.0;
		double totalTax;

		if (seatNumber <= 0) {
			System.out.println("Invalid Seat Number");
			System.out.println("=========");
			return;
		} else if (seatNumber >= 5) {
			exciseTax = this.getPrice() * 0.3;
		} else {
			exciseTax = this.getPrice() * 0.5;
		}
		totalTax = VAT + registrationTax + exciseTax;
		System.out.println("Total Tax: " + totalTax);
		System.out.println("=========");

	}
}
