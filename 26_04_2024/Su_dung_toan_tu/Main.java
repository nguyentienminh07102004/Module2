import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float height = sc.nextFloat();
    float width = sc.nextFloat();

    System.out.println("Area is: " + height * width);

    sc.close();
  }
}