import java.util.ArrayList;

class DataBase {
	private ArrayList<Student> db = new ArrayList<Student>();
	//TODO
	Student search(int stID) {
		for (Student stu : db) {
			if (stu.getID() == stID) {
				return stu;
			}
		}
		return null;
	}

	boolean addStudent(Student s) {
		return db.add(s);
	}

	boolean delStudent(Student s) {
		return db.remove(s);
	}
}
