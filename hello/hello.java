import java.util.Scanner;

public class hello{
  public static void main(String[] args) {
    System.out.println("Enter your name: ");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.println("Your name is: " + s);
    sc.close();
  }
}