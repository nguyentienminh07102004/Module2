public class Person {
  private long id;
  private String fullName;
  private String email;
  private String address;
  private int role;
  public Person(long id, String fullName, String email, String address, int role) {
    this.id = id;
    this.fullName = fullName;
    this.email = email;
    this.address = address;
    this.role = role;
  }
  public Person() {
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
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public int getRole() {
    return role;
  }
  public void setRole(int role) {
    this.role = role;
  }
  @Override
  public String toString() {
    return "[id=" + id + ", fullName=" + fullName + ", email=" + email + ", address=" + address + ", role=" + role + "]";
  }
}
