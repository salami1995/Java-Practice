package VehicleManagement;

public class Bycicle extends Vehicle {

	public Bycicle(String color, String owner, double price) {
		super(color, owner, price);
	}
	public void displayInfo() {
		System.out.println("Bycicle information: " + "Owner: " + this.getOwner() + " + Color: " + this.getColor() + " + Price: " + this.getPrice());
	}
	public void tax() {
		System.out.println("No Tax.");
		System.out.println("=========");
	}

}
