import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * For this challenge we need to check if both arrays have the same elements.
 */
public class Main {

  /**
   * All the solutions will have the following initial checks:
   * 1. If any argument is null -> false
   * 2. We'll assume that the arrays must have the same number of elements so if size of <b>a</b> is not the same as size of <b>b</b> -> false
   * 3. The order of the elements does not matter
   * 4. Elements should be unique
   *
   * Then we loop through the elements of <b>b</b> for each element of <b>a</b> until a match is found or there are no more elements to visit.
   * If a match is found, we proceed with the next cycle, otherwise false is returned.
   *
   * Time Complexity: O(n^2)
   * Space Complexity: O(1)
   */
  public static boolean checkSameElementsV1(int[] a, int[] b) {
    if (a == null || b == null || a.length == 0 || (a.length != b.length)) {
      return false;
    }

    boolean exists;
    for (int i = 0; i < a.length; i++) {
      // At each cycle we assume that it doesn't exist
      exists = false;

      for (int j = 0; j < b.length; j++) {
        if (b[j] == a[i]) {
          exists = true;
        }
      }

      // If the exists wasn't updated -> return false
      if (!exists) {
        return false;
      }
    }

    return true;
  }

  /**
   * The runtime of the previous version is actually less than N^2 as in the worst case the iterations goes like this:
   * n, n-1, n-2, n-3, .. 2, 1 which leads us to the sum of numbers 1 to N-1 = N*(N+1)/2, which is N^2/2 and by removing the constant (1/2) it give us O(n^2)
   *
   * In this approach, we'll fill a set with the elements from array b O(n), then iterate through the other array and for each element check if exists
   * in the set. n*O(1) => O(n). The time complexity is improved here because we have 2 iterations over n elements => 2n and by removing the constant, leads to:
   *
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   */
  public static boolean checkSameElementsV2(int[] a, int[] b) {
    if (a == null || b == null || a.length == 0 || (a.length != b.length)) {
      return false;
    }

    Set<Integer> values = new HashSet<>(b.length);

    for (int i = 0; i < b.length; i++) {
      values.add(b[i]);
    }

    for (int j = 0; j < a.length; j++) {
      // only need to establish if at least 1 value doesn't exist
      if (!values.contains(a[j])) {
        return false;
      }
    }

    return true;
  }

  /**
   * Another way to handle it is by sorting both arrays initially leading to 2*O(n log n), and then check if the elements match: O(n)
   * By sorting them we ensure that all values should be in the same positions, if they have the same elements.
   *
   * Time Complexity: O(s + n log n) where s is the size of a or b
   * Space Complexity: O(n)
   */
  public static boolean checkSameElementsV3(int[] a, int[] b) {
    if (a == null || b == null || a.length == 0 || (a.length != b.length)) {
      return false;
    }

    Arrays.sort(a);
    Arrays.sort(b);

    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i]) {
        return false;
      }
    }

    return true;
  }
}
