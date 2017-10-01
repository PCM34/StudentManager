import java.util.Scanner;

/* To-Do List - project idea: https://goo.gl/PK2erS
//TODO Output/Input student list to/from a file
*/

public class Main {
  public static void main(String[] args) {
    Scanner inpt = new Scanner(System.in);
    DataBase recordStore = new DataBase();

    //Name may be changed
    System.out.println("Welcome to The University Student Manager.");
    int response = 0;

    while (!(response == 7)) {
      System.out.println("Main Menu:");
      System.out.println("  1. Add Student Record");
      System.out.println("  2. Remove Student Record");
      System.out.println("  3. Edit Student Record");
      System.out.println("  4. List all Student Records"); //TODO add next page option
      System.out.println("  5. Export Student Records");
      System.out.println("  6. Import Student Records");
      System.out.println("  7. Exit");
      System.out.print("Please select a menu option: ");
      response = inpt.nextInt();

      switch (response) {
        case 1:
          System.out.println("Creating a Student Record:");
          System.out.print("First and Last Name: ");

          String tempInpt = inpt.next().trim();
          int NmSpace = tempInpt.indexOf(" ");
          String firstName = tempInpt.substring(0 , NmSpace);
          String lastName = tempInpt.substring(NmSpace+1);

          System.out.println("What year is the student?");
          String stuYear = inpt.next();

          Student s = new Student(firstName, lastName, stuYear);
          if (recordStore.addStudent(s)) {
            System.out.println("Record successfully added");
          } else {
            System.out.println("Record addition FAILED");
          }
          break;
        case 2:
          System.out.println("What is the ID?");
          int ID = inpt.nextInt();
          if (recordStore.delStudent(recordStore.search(ID))) {
            System.out.println("Record successfully deleted");
          } else {
            System.out.println("Record deletion FAILED");
          }
          break;
        case 3:
          break;
        case 4:
          break;
        case 5:
          break;
        case 6:
          break;
        default:
          if (response != 7) System.out.println("Please select a valid numerical option");
          break;
      }
    }
  }
}
