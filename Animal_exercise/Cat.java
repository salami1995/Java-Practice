package Animal_exercise;

public class Cat extends Animal {
	private String furColor;
	private double height;

	public Cat(String name, int age, String kind, String furColor, double height) {
		super(name, age, kind);
		this.furColor = furColor;
		this.height = height;

	}

	public void displayInfor() {
		super.displayInfor();
		System.out.println("- Fur Color: " + this.furColor);
		System.out.println("- Height: " + this.height);
		System.out.println("==========");
	}

}
