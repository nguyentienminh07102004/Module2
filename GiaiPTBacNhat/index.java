import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("a = ");
    int a = sc.nextInt();

    System.out.print("b = ");
    int b = sc.nextInt();

    if(a == 0 && b == 0){
      System.out.println("Phương trình đã cho có vô số nghiệm");
    }else if(a == 0 && b != 0){
      System.out.println("Phương trình đã cho vô nghiệm");
    }else{
      System.out.println("Nghiệm của phương trình là: " + (- b / a));
    }
    sc.close();
  }
}