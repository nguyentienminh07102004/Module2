import java.util.Arrays;

public class App {
  private static int[] removeItemByIndex(int index, int[] arr) {
    int[] res = new int[arr.length - 1];
    int cnt = 0;
    for (int i = 0; i < arr.length; i++) {
      if (i != index) {
        res[cnt] = arr[i];
        cnt++;
      }
    }
    return res;
  }

  // them phan tu
  private static int[] addItem(int item, int[] arr) {
    int[] res = new int[arr.length + 1];
    for (int i = 0; i < arr.length; i++) {
      res[i] = arr[i];
    }
    res[arr.length] = item;
    return res;
  }

  // Tim index cua phan tu
  private static boolean findIndexByValue(int value, int[] arr) {
    for (int item : arr) {
      if (item == value)
        return true;
    }
    return false;
  }

  public static void main(String[] args) {
    int[] array = new int[5]; // 10 so luong toi da cac phan tu
    array[0] = 1;
    array[1] = 2;
    array[2] = 3;
    array[3] = 4;
    array[4] = 5;

    // remove item by index
    array = removeItemByIndex(2, array);
    System.out.println(Arrays.toString(array));

    // add item 
    array = addItem(10, array);
    System.out.println(Arrays.toString(array));

    // find item by index
    boolean isFound = findIndexByValue(10, array);
    if(isFound) System.out.println("FOUND");
    else System.out.println("NOT FOUND");
  }
}