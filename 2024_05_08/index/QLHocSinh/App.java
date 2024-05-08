import java.text.DecimalFormat;

public class App {
  public static void main(String[] args) {
    Student[] students = new Student[10];
    String[] name = {"John", "Alice", "Bob", "Emily", "Michael", "Sophia", "David", "Emma", "James", "Olivia"};
    for(int i = 0; i < 10; i++){
      DecimalFormat df = new DecimalFormat("#.##");
      students[i] = new Student(i + 1, name[i], name[i] + "@gmail.com", Double.parseDouble(df.format(Math.random() * 5 + 5)));
      System.out.println(students[i].toString());
    }
    System.out.println("Các sinh viên có GPA lớn hơn 8.0 là: ");
    for(Student student : students){
      if(student.getGPA() >= 8.0) System.out.println(student.toString());
    }
  }
}
