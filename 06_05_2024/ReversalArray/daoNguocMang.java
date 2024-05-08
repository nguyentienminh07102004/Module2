public class daoNguocMang {
  private static void daoNguocMang(int[] arr){
    int l = 0;
    int r = arr.length - 1;
    while(l < r){
      int t = arr[l];
      arr[l] = arr[r];
      arr[r] = t;
      l++;
      r--;
    }
  }
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    daoNguocMang(arr);
    for(int x : arr) System.out.println(x);
  }
}
