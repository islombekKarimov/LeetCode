package leetCode;
/** Created by Islombek Karimov on 12.07.2020. */

/**
 * NumberOfGoodPairs.
 *
 * @author Islombek Karimov
 * @since 12.07.2020
 */
public class NumberOfGoodPairs {

  public static void main(String[] args) {

    System.out.println(numIdenticalPairs(new int[] {1, 2, 3, 1, 1, 3}));
  }

  public static int numIdenticalPairs(int[] nums) {
    int result = 0, count[] = new int[101];
    for (int i : nums) {
      result += count[i]++;
    }
    return result;
  }
}
