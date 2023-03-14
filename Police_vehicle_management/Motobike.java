package Police_vehicle_management;

public class Motobike extends Vehicle {
	private String congSuat;

	public Motobike(String soXe, String nhaSanXuat, int namSanXuat, String mauXe, Owner chuXe, String congSuat) {
		super(soXe, nhaSanXuat, namSanXuat, mauXe, chuXe);
		this.congSuat = congSuat;
	}

}
