import java.util.ArrayList;

public class DataBase {
	private ArrayList<Student> db = new ArrayList<Student>();

	public Student search(int stID) {
		for (Student stu : db) {
			if (stu.getID() == stID) {
				return stu;
			}
		}
		return null;
	}
}
