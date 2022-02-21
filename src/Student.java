public class Student {

  private int rating;
  private String name;

  private static int studentsCount = 0;
  private static int sumOfStudentsRating = 0;

  public Student(String name) {
    studentsCount++;
    this.name = name;
  }

  public static double getAvgRating() {
    if (studentsCount == 0) {
      return 0d;
    }
    return (double) sumOfStudentsRating / studentsCount;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    sumOfStudentsRating += rating;
    this.rating = rating;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean betterStudent(Student student) {
    if (student.getRating() < this.getRating()) {
      return true;
    }
    return false;
  }

  public void changeRating(int rating) {
    sumOfStudentsRating -= getRating();
    setRating(rating);
  }

  public static void removeStudent(Student student) {
    studentsCount = 0;
    sumOfStudentsRating = 0;
  }

  @Override
  public String toString() {
    return "name: " + name + ", rating: " + rating;
  }
}