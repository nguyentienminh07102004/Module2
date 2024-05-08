import java.util.Scanner;

public class delete {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[100];
    int n = sc.nextInt();
    for(int i = 0; i < n; i++){
      arr[i] = i + 1;
    }
    int l = sc.nextInt();
    int h = sc.nextInt();
    int[] arr2 = new int[100];
    int cnt = 0;
    for(int i = 0; i < n; i++){
      if(i < l - 1 || i > h - 1){
        arr2[cnt] = arr[i];
        cnt++;
      }
    }
    for(int i = 0; i < cnt; i++){
      System.out.print(arr2[i] + " ");
    }
    sc.close();
  }
}
