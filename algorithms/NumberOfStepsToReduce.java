package LeetCode.algorithms;

/**
 * Created by Islombek Karimov on 01.05.2020.
 */
public class NumberOfStepsToReduce {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    public static int numberOfSteps(int num) {
        int step = 0;
        while (num > 1) {
            if (num % 2 != 0) {
                step++;
            }
            step++;
            num = num / 2;
        }
        step++;
        return step;
    }

}
