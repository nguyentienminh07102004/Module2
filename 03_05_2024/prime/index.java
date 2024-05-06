import java.util.Scanner;

public class index {
  private static boolean isPrime(int x){
    for(int i = 2; i <= Math.sqrt(x); i++){
      if(x % i == 0) return false;
    }
    return x > 1;
  }
  public static void main(String[] args) {
    System.out.print("Enter your number: ");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if(isPrime(x)) System.out.println(x + " is a prime");
    else System.out.println(x + " isn't a prime");
    sc.close();
  }
}