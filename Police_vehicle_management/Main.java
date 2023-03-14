package Police_vehicle_management;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	private static List<Vehicle> vehicles = new ArrayList<Vehicle>();

	public static void main(String[] args) {
		Owner Tuan = new Owner("123456789012", "Tuan", "tuan@gmail.com");
		Owner Nhu = new Owner("123456789111", "Quynh Nhu", "QN@gmail.com");
		Owner Nhung = new Owner("123456789221", "Thu Nhung", "TN@gmail.com");
		Owner Thang = new Owner("123456789101", "Ba Thang", "BT@gmail.com");

//		Add vehicle successfully
		addVehicle(new Motobike("00202", "Honda", 2019, "Red", Tuan, "125cc"));
		addVehicle(new Car("00203", "Yamaha", 2023, "Black", Nhu, 4, "4 xilanh"));
		addVehicle(new Car("05536", "Honda", 2013, "Black", Nhung, 1, "2 xilanh"));
		addVehicle(new Car("02523", "Suzuki", 2016, "Black", Thang, 4, "4 xilanh"));
		addVehicle(new Car("02524", "Toyota", 2016, "Black", Thang, 4, "4 xilanh"));
		addVehicle(new Truck("02528", "Toyota", 2016, "Black", Tuan, "4 xilanh"));
		addVehicle(new Truck("02529", "Toyota", 2016, "Black", Tuan, "4 xilanh"));

//		Add vehicle fail
		addVehicle(new Car("083939", "Honda", 2023, "Black", Nhu, 4, "4 xilanh"));
		addVehicle(new Motobike("08393", "Mercedes", 2023, "Black", Nhu, "4 xilanh"));
		addVehicle(new Car("02523", "Honda", 2016, "Black", Thang, 4, "4 xilanh"));

		findByVehicleNumber("00203");

		findByVehicleCmnd("123456789221");

		deleteByNSX("Yamaha");

		findMostVehical();

		sortVehicalBySoXeDesc();

	}

	public static void addVehicle(Vehicle vehicle) {
		System.out.println("Them phuong tien giao thong:");
		if (vehicle.checkVehicle()) {
			vehicles.add(vehicle);
			System.out.println("Them thanh cong!\n");
		} else {
			System.out.println("Them that bai!\n");
		}
	}

	public static void findByVehicleNumber(String soXe) {
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getSoXe() == soXe) {
				System.out.println("**Vehicle by number - " + vehicle.getSoXe());
				vehicle.displayInfo();
				System.out.println("\n");
			}
		}
	}

	public static void findByVehicleCmnd(String cmnd) {
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getChuXe().cmnd == cmnd) {
				System.out.println("**Vehicle by cmnd - " + vehicle.getChuXe().cmnd);
				vehicle.displayInfo();
				System.out.println("\n");
			}
		}
	}

	public static void deleteByNSX(String nsx) {
		var result = new ArrayList<Vehicle>();

		for (Vehicle vehicle : vehicles) {
			if (vehicle.getNhaSanXuat().contains(nsx)) {
				result.add(vehicle);
			}
		}

		vehicles.removeAll(result);
		System.out.println("Xoa thanh cong!\n");
	}

	public static void findMostVehical() {
		var nsxGroups = vehicles.stream().collect(Collectors.groupingBy(e -> e.getNhaSanXuat(), Collectors.counting()));
		var maxOccurence = Collections.max(nsxGroups.entrySet(), Comparator.comparing(Map.Entry::getValue));
		System.out.println("NSX co nhieu xe nhat dang duoc quan ly: " + maxOccurence.getKey() + "\nso luong: "
				+ maxOccurence.getValue() + "\n");
	}

	public static void sortVehicalBySoXeDesc() {
		Collections.sort(vehicles, Comparator.comparing(Vehicle::getSoXe).reversed());
		System.out.println("Danh sach phuong tien theo so xe giam dan:\n");
		for (Vehicle vehicle : vehicles) {
			vehicle.displayInfo();
			System.out.println("\n");
		}
	}
}
