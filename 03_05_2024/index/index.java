import java.util.TreeSet;
import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    TreeSet<Integer> set = new TreeSet<Integer>();
    for(int i = 1; i <= Math.sqrt(n); i++){
      if(n % i == 0){
        set.add(i);
        set.add(n / i);
      }
    }
    for(int x : set){
      System.out.print(x + ", ");
    }
    sc.close();
  }
}