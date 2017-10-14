import java.util.ArrayList;

public class Student {
  private String firstName;
  private String lastName;
  private String stuYear;
  private int ID;
  private ArrayList<Integer> grades1stSem = new ArrayList<Integer>();
  private ArrayList<Integer> grades2ndSem = new ArrayList<Integer>();

  public Student(String firstName, String lastName, String stuYear) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.stuYear = stuYear;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getID() {
    return ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

  public String getStuYear() {
    return stuYear;
  }

  public void setStuYear(String stuYear) {
    this.stuYear = stuYear;
  }

  public ArrayList<Integer> getGrades1stSem() {
    return grades1stSem;
  }

  public void setGrades1stSem(ArrayList<Integer> grades1stSem) {
    this.grades1stSem = grades1stSem;
  }

  public ArrayList<Integer> getGrades2ndSem() {
    return grades2ndSem;
  }

  public void setGrades2ndSem(ArrayList<Integer> grades2ndSem) {
    this.grades2ndSem = grades2ndSem;
  }
}
