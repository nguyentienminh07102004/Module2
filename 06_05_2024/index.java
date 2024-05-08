import java.util.Scanner;

public class index {
  public static void main(String[] args) throws InterruptedException {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[10];
    for (int i = 0; i < 10; i++) {
      a[i] = i;
    }
    int[] A = new int[100];
    System.arraycopy(a, 0, A, 0, 10);
    for(int i = 0; i < 10; i++){
      System.out.println(A[i]);
    }
    sc.close();
  }
}