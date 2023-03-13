package Animal_exercise;

public class Dog extends Animal {
	private String color;
	private double weight;

	public Dog(String name, int age, String kind, String color, double weight){
		super(name, age, kind);
		this.color = color;
		this.weight = weight;
	}
	
	public void displayInfor(){
		super.displayInfor();
		System.out.println("- Color: " + this.color);
		System.out.println("- Weight: " + this.weight);
		System.out.println("==========");
	}

}
