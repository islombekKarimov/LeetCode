package leetCode.algorithms;

/**
 * Created by Islombek Karimov on 09.05.2020.
 */
public class SplitStringBalanced {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLLLLRRRLR"));
    }

    public static int balancedStringSplit(String s) {
        int result = 0;
        int balance =0;
        for (char ch : s.toCharArray()){
            if (ch == 'R') balance++;
            if (ch == 'L') balance--;
            if (balance == 0)result++;
        }

        return result;
    }


}
