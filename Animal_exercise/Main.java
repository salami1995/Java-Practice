package Animal_exercise;

public class Main {

	public static void main(String[] args) {
		Animal dog1 = new Dog ("KiKi", 1, "Chihuahua", "brown", 0.5);
		Animal cat1 = new Cat ("Hoàng Thượng", 2, "Ragdoll", "yellow", 0.5);
		Dog dog2 = new Dog ("Ngáo", 2, "Husky", "white", 1.2);
		Cat cat2 = new Cat ("Big Boss", 1, "Savannah", "black", 0.5);
		
		dog1.displayInfor();
		cat1.displayInfor();
		dog2.displayInfor();
		cat2.displayInfor();
	}

}
