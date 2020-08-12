package LeetCode.algorithms;

/**
 * Created by Islombek Karimov on 23.05.2020.
 */
public class NumberStudentsDoingHomeworkGivenTime {

    public static void main(String[] args) {
        System.out.println(busyStudent(new int[]{4}, new int[]{4}, 5));

    }


    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i]>=queryTime) {
                count++;
            }
        }
        return count;
    }

}
