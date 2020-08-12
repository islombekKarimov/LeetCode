package LeetCode.algorithms;

/**
 * ShuffleString.
 *
 * @author Islombek Karimov
 * @since 12.08.2020
 */
public class ShuffleString {
    public static void main(String[] args) {
        System.out.println(restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3}));
    }

    public static String restoreString(String s, int[] indices) {
        char[] mass = s.toCharArray();
        for (int i = 0; i < mass.length; i++) {
            mass[indices[i]] = s.charAt(i);
        }
        return String.valueOf(mass);
    }

}