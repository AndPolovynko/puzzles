package puzzles;

import java.util.LinkedList;
import java.util.List;

public class FindAllNumbersDisappearedInArray448 {

  public static void main(String[] args) {
    int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
    System.out.println(findDisappearedNumbers(nums));
  }

  public static List<Integer> findDisappearedNumbers(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      nums[Math.abs(Math.abs(nums[i]) - 1)] = -1 * Math.abs(nums[Math.abs(Math.abs(nums[i]) - 1)]);
    }

    List<Integer> list = new LinkedList<>();

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        list.add(i + 1);
      }
    }
    return list;
  }
}
