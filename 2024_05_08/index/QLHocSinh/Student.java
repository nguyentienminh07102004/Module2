public class Student {
  private long id;
  private String fullName;
  private String email;
  private double GPA;
  
  public Student(long id, String fullName, String email, double gPA) {
    this.id = id;
    this.fullName = fullName;
    this.email = email;
    GPA = gPA;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public double getGPA() {
    return GPA;
  }

  public void setGPA(double gPA) {
    GPA = gPA;
  }

  @Override
  public String toString() {
    return "[id=" + id + ", fullName=" + fullName + ", email=" + email + ", GPA=" + GPA + "]";
  }

  
}