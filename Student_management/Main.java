package Student_management;

public class Main {
	public static void main(String[] args) {

		School sc = new School();
		sc.addStudent(new Student("Nguyen Van A", 15, "BD", 11));
		sc.addStudent(new Student("Le Thi B", 23, "DN", 12));
		sc.addStudent(new Student("Nguyen Van C", 20, "BD", 11));
		sc.addStudent(new Student("Le Thi F", 23, "DN", 12));
		sc.addStudent(new Student("Nguyen Van X", 15, "DN", 11));
		sc.addStudent(new Student("Pham Thao Ly", 20, "DN", 12));
		sc.addStudent(new Student("Nguyen Huu Y", 23, "DL", 11));
		sc.addStudent(new Student("Le Thi Xuan", 20, "DN", 12));

		System.out.println("List of 20-year-old students:");

		for (int i = 0; i < sc.getStudents().size(); i++) {

			if (sc.getStudents().get(i).getAge() == 20) {
				sc.getStudents().get(i).displayInfo();
			}

		}
		System.out.println();
		System.out.println("*********");

		int count = 0;
		for (int i = 0; i < sc.getStudents().size(); i++) {
			if (sc.getStudents().get(i).getAge() == 23 && sc.getStudents().get(i).getHometown().equals("DN")) {
				count += 1;
			}
		}
		System.out.println("Number of 23-year-old students in DN: " + count);
	}
}
