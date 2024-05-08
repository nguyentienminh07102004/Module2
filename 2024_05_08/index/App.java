public class App {
  public static void main(String[] args) {
    User user1 = new User("nguyentienminh07102004@gmail.com", "Minh123");
    System.out.println(user1.getEmail());
    User user;
    if(user == null) System.out.println(1);
    else System.out.println(0);
  }
}