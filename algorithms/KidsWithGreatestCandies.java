package LeetCode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Islombek Karimov on 03.05.2020.
 */
public class KidsWithGreatestCandies {
    public static void main(String[] args) {
        kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> booleanList = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        System.out.println("max " + max);
        for (int candy : candies) {
            if ((candy + extraCandies) >= max) {
                booleanList.add(true);
            } else {
                booleanList.add(false);
            }
        }

        return booleanList;
    }
}
