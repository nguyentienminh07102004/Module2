import java.util.Scanner;

public class index2 {
  private static int GCD(int a, int b){
    if(b == 0) return a;
    else return GCD(b, a % b);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(GCD(a, b));
    sc.close();
  }
}
