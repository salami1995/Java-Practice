package Animal_exercise;

public class Animal {
	private String name;
	private int age;
	private String kind;

	public Animal(String name, int age, String kind) {
		super();
		this.name = name;
		this.age = age;
		this.kind = kind;
	}
	
	public void displayInfor() {
		System.out.println("Animal Information:");
		System.out.println("- Name: " + this.name);
		System.out.println("- Age: " + this.age);
		System.out.println("- Kind: " + this.kind);
	}
}
