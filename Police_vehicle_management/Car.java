package Police_vehicle_management;

public class Car extends Vehicle {
	private int soCho;
	private String kieuDongCo;

	public Car(String soXe, String nhaSanXuat, int namSanXuat, String mauXe, Owner chuXe, int soCho,
			String kieuDongCo) {
		super(soXe, nhaSanXuat, namSanXuat, mauXe, chuXe);
		this.soCho = soCho;
		this.kieuDongCo = kieuDongCo;
	}
}
