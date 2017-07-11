import java.util.Scanner;

/* To-Do List - project idea: https://goo.gl/PK2erS
//TODO Make Database class
//TODO Output/Input student list to/from a file
*/

public class Main {
	public static void main(String[] args) {
		Scanner inpt = new Scanner(System.in);

		System.out.println("Welcome to The University Student Manager.");
		int response = 0;

		while (!(response == 6)) {
			System.out.println("Main Menu:");
			System.out.println("  1. Add Student Record");
			System.out.println("  2. Remove Student Record");
			System.out.println("  3. List all Student Records"); //TODO add next page option
			System.out.println("  4. Export Student Records");
			System.out.println("  5. Import Student Records");
			System.out.println("  6. Exit");
			System.out.print("Please select a menu option: ");
			response = inpt.nextInt();
		}
	}
}
