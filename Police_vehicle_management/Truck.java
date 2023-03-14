package Police_vehicle_management;

public class Truck extends Vehicle {
	private String trongTai;

	public Truck(String soXe, String nhaSanXuat, int namSanXuat, String mauXe, Owner chuXe, String trongTai) {
		super(soXe, nhaSanXuat, namSanXuat, mauXe, chuXe);
		this.trongTai = trongTai;
	}

}
