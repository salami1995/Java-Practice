package VehicleManagement;

public class Main {

	public static void main(String[] args) {
		Vehicle bike = new Bycicle("yellow", "Mr.A", 500);
		bike.displayInfo();
		bike.tax();
		
		Vehicle moto = new Motorbike("black", "Mr.B", 1000);
		moto.displayInfo();
		moto.tax();
		
		Vehicle truck = new Truck("White", "Mr.X", 4000);
		truck.displayInfo();
		truck.tax();
		
		Vehicle bus = new Bus("Green", "Mr. Z", 1000, 0);
		bus.displayInfo();
		bus.tax();
		
		Vehicle bus2 = new Bus("Blue", "Mr. Z", 1000, 5);
		bus2.displayInfo();
		bus2.tax();
	}

}
