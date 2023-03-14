package Police_vehicle_management;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Vehicle {
	private String soXe;
	private String nhaSanXuat;
	private int namSanXuat;
	private String mauXe;
	private Owner chuXe;

	private static List<String> soXeList = new ArrayList<String>();
	private static List<String> nsxList = new ArrayList<String>(Arrays.asList("Honda", "Yamaha", "Toyota", "Suzuki"));

	public String getSoXe() {
		return soXe;
	}

	public String getNhaSanXuat() {
		return nhaSanXuat;
	}

	public int getNamSanXuat() {
		return namSanXuat;
	}

	public String getMauXe() {
		return mauXe;
	}

	public Owner getChuXe() {
		return chuXe;
	}

	public Vehicle(String soXe, String nhaSanXuat, int namSanXuat, String mauXe, Owner chuXe) {
		this.soXe = soXe;
		this.nhaSanXuat = nhaSanXuat;
		this.namSanXuat = namSanXuat;
		this.mauXe = mauXe;
		this.chuXe = chuXe;
	}

	public void displayInfo() {
		System.out.println("==Vehicle info:==");
		System.out.println("so xe: " + this.soXe);
		System.out.println("nha san xuat: " + this.nhaSanXuat);
		System.out.println("nam san xuat: " + this.namSanXuat);
		System.out.println("mau xe: " + this.mauXe);
		this.chuXe.displayInfo();
	}

	public boolean checkNumber() {
		if (soXe.length() == 5) {
			if (soXeList.contains(soXe)) {
				System.out.println("so xe da ton tai!");
				return false;
			}

			soXeList.add(soXe);
			return true;
		} else {
			System.out.println("So Xe khong dung 5 so!");
			return false;
		}
	}

	public boolean checkNSX() {
		if (nsxList.contains(nhaSanXuat)) {
			return true;
		}

		System.out.println("Nha San Xuat khong ton tai!");
		return false;
	}

	public boolean checkNamSX() {
		if (namSanXuat <= Year.now().getValue() && namSanXuat > 2000) {
			return true;
		}

		System.out.println("Nam san xuat khong hop le!");
		return false;
	}

	public boolean checkVehicle() {
		if (checkNumber() && checkNamSX() && checkNSX()) {
			return true;
		}

		return false;
	}
}
