package VehicleManagement;

public abstract class Vehicle {
	private String color;
	private String owner;
	private double price;

	public Vehicle(String color, String owner, double price) {
		this.color = color;
		this.owner = owner;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public String getOwner() {
		return owner;
	}

	public double getPrice() {
		return price;
	}

	public void displayInfo() {
		
	}

	public void tax() {
		
	}

}
