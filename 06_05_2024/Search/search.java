import java.util.Scanner;

public class search {
  private static boolean search(int[] arr, int lengthArr, int target){
    for(int i = 0; i < lengthArr; i++){
      if(arr[i] == target) return true;
    }
    return false;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int lengthArr = sc.nextInt();
    int[] arr = new int[100];
    for(int i = 0; i < lengthArr; i++){
      arr[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    if(search(arr, lengthArr, target)) System.out.println("FOUND");
    else System.out.println("NOT FOUND");
  }
}