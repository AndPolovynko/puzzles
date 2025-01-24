package puzzles;

public class MoveZeroes283 {

  public static void main(String[] args) {
    int[] nums = { 0, 1, 0, 3, 12 };
    moveZeroes(nums);
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
  }

  public static void moveZeroes(int[] nums) {
    int nonZeroElementCounter = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        int temp = nums[nonZeroElementCounter];
        nums[nonZeroElementCounter++] = nums[i];
        nums[i] = temp;
      }
    }
  }
}
