import java.util.function.Supplier;

public class findMaxValue {
  private static int findMaxValueInArray(int[] arr, int length){
    Supplier<Integer> findMax = () -> {
      int maxValue = arr[0];
      for(int i = 1; i < length; i++){
        if(maxValue < arr[i]) maxValue = arr[i];
      }
      return maxValue;
    };
    return findMax.get();
  }
  public static void main(String[] args) {
    int[] arr = new int[10];
    for(int i = 0; i < 10; i++){
      arr[i] = (int) (Math.random() * 210);
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    System.out.println(findMaxValueInArray(arr, 10));
  }
}