package leetCode.algorithms;

/**
 * Created by Islombek Karimov on 01.05.2020.
 */
public class JewelsAndStones {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("b", "aAAbbbbBoO"));
    }

    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        for (char c : S.toCharArray()){
            if(J.indexOf(c) !=-1){
                count++;
            }
        }
        return count;
    }
//    public int numJewelsInStones(String J, String S) {
//        int count = 0;
//        String str = J + S;
//        char[] sArr = str.toCharArray();
//        char[] jArr = J.toCharArray();
//        for (int i = 0; i < sArr.length; i++) {
//            for (int j = 0; j < jArr.length; j++) {
//                if (sArr[i] == jArr[j]) {
//                    count++;
//                }
//            }
//        }
//
//        return count - jArr.length;
//    }

}
