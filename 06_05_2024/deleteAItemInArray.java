public class deleteAItemInArray {
  public static void main(String[] args) {
    int[] arr = new int[10];
    for(int i = 0; i < arr.length; i++){
      arr[i] = i;
    }
    int[] arr1 = new int[9];
    int cnt = 0;
    for(int i = 0; i < 10; i++){
      if(i != 2){
        arr1[cnt] = arr[i];
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
