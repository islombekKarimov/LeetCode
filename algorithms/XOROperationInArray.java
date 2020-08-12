package LeetCode.algorithms;

/**
 * XOROperationInArray.
 *
 * @author Islombek Karimov
 * @since 08.07.2020
 */
public class XOROperationInArray {
  public static void main(String[] args) {
    System.out.println(xorOperation(1, 7));
  }

  public static int xorOperation(int n, int start) {
    int result = 0;
    for (int i = 1; i <= n; i++) {
      result ^= start;
      start += 2;
    }
    return result;
  }
}
