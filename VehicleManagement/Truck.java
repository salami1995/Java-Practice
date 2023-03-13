package VehicleManagement;

public class Truck extends Vehicle {

	public Truck(String color, String owner, double price) {
		super(color, owner, price);
	}
	
	public void displayInfo() {
		System.out.println("Truck information: " + "Owner: " + this.getOwner() + " + Color: " + this.getColor() + " + Price: " + this.getPrice());
	}
	
	public void tax() {
		double VAT = this.getPrice() * 0.1;
		double registrationTax = this.getPrice() * 0.02;
		double totalTax = VAT + registrationTax;
		System.out.println("Total Tax: " + totalTax);
		System.out.println("=========");
	}

}
