package Student_management;

import java.util.ArrayList;
import java.util.List;

public class School {
	private List<Student> students = new ArrayList<Student>();

	public void addStudent(Student student) {
		students.add(student);
	}

	public List<Student> getStudents() {
		return students;
	}
}