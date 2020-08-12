package LeetCode.algorithms;

/**
 * Created by Islombek Karimov on 01.05.2020.
 */
public class DefangingIPAddress {

    public static void main(String[] args) {
        System.out.println(defangIPaddr("255.100.50.0"));
    }

    public static String defangIPaddr(String address) {
        address = address.replace(".","[.]");
        return address;
    }
}


