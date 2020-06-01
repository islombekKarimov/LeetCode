package leetCode.algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Islombek Karimov on 01.06.2020.
 */
public class DestinationCity {

    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        List<String> firstLine = new ArrayList<>();
        firstLine.add("B");
        firstLine.add("C");
        list.add(firstLine);
        List<String> secondLine = new ArrayList<>();
        secondLine.add("D");
        secondLine.add("B");
        list.add(secondLine);
        List<String> thirdLine = new ArrayList<>();
        thirdLine.add("C");
        thirdLine.add("A");
        list.add(thirdLine);
        System.out.println(destCity(list));
    }

    public static String destCity(List<List<String>> paths) {
        Set<String> stringSet = new HashSet<>();
        for (List<String> list : paths) {
            stringSet.add(list.get(0));
        }
        for (List<String> list : paths) {
            if (!stringSet.contains(list.get(1))) {
                return list.get(1);
            }
        }

        return "";
    }

}
