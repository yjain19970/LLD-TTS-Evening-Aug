package generics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {

        HashSet<Integer> intSet = new HashSet<>();

        intSet.add(100);
        intSet.add(50);
        System.out.println(intSet.contains(500));




        TreeSet<Integer> set2 = new TreeSet<>();

    }
}
