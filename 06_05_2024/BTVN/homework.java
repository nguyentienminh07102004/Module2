public class homework {
  private static int[] removeItemByIndex(int index, int[] arr) {
    int[] res = new int[arr.length - 1];
    int cnt = 0;
    for(int i = 0; i < arr.length; i++){
      if(i != index){
        res[cnt] = arr[i];
        cnt++;
      }
    }
    return res;
  }

  // them phan tu
  private static int[] addItem(int item, int[] arr) {
    int[] res = new int[arr.length + 1];
    for(int i = 0; i < arr.length; i++){
      res[i] = arr[i];
    }
    res[arr.length] = item;
    return res;
  }

  // Tim index cua phan tu
  private static int findIndexByValue(int value, int[] arr) {
    for(int item : arr) {
      if(item == value) return 1;
    }
    return 0;
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 4, 5, 67, 78, 65, 68};
  }
}