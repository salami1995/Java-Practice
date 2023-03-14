package Police_vehicle_management;

public class Owner {
	public String cmnd;
	public String name;
	public String email;

	public Owner(String cmnd, String name, String email) {
		this.cmnd = cmnd;
		this.name = name;
		this.email = email;
	}

	public void displayInfo() {
		System.out.println("Owner:");
		System.out.println("cmnd:" + this.cmnd);
		System.out.println("name: " + this.name);
		System.out.println("email: " + this.email);
	}

}
