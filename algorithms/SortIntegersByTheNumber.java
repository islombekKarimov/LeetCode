package LeetCode.algorithms;



/**
 * Created by Islombek Karimov on 29.04.2020.
 */
public class SortIntegersByTheNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] mass = sortByBits(arr);
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(mass[i]);
        }
    }

    public static int[] sortByBits(int[] arr) {
        int temp;
        for (int i=0; i<= arr.length-1; i++){
             for (int j=i+1; j<=arr.length-1; j++){
                 if(Integer.bitCount(arr[i]) > Integer.bitCount(arr[j])){
                     temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                 }
                 else if(Integer.bitCount(arr[i]) == Integer.bitCount(arr[j])){
                     if(arr[i] > arr[j]){
                         temp = arr[i];
                         arr[i] = arr[j];
                         arr[j] = temp;
                     }
                 }
             }
         }
        return arr;
    }


}
