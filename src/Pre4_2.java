public class Pre4_2 {
  public int[] pre4(int[] nums) {
    int[] result;
    int count = 0;;

    for (int i = 0; nums[i] != 4; i++) {
      count++;
    }
    result = new int[count];
    for (int j = 0; j < count; j++) {
      result[j] = nums[j];
    }
    return result;
  }
}
