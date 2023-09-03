package generics;

import java.util.*;

public class GenericClass {
    public static void main(String[] args) {

        ArrayList<Integer> basicIntList = new ArrayList<>(100); // DEFAULT capacity is 10.

        List<Integer> vec = new Vector<>();

        basicIntList.add(10);
        basicIntList.add(10);
        System.out.println(basicIntList.size());
        System.out.println(basicIntList);

        //basicIntList.set(3,51); // go at that index and update the value.
        // 3 RANGE of index (0,size-1)
        basicIntList.get(1);

        System.out.println(basicIntList);



        LinkedList<String> linkedAnimalList = new LinkedList<>();

        linkedAnimalList.add("A");
        linkedAnimalList.add("B");
        linkedAnimalList.addFirst("C");
        linkedAnimalList.addLast("z");
        linkedAnimalList.add(2,"R");
        // C -> A-> B


        System.out.println(linkedAnimalList);

        PriorityQueue<Animals> pq = new PriorityQueue<>(new Comparator<Animals>() {
            @Override
            public int compare(Animals o1, Animals o2) {
                return o1.age-o2.age;
            }
        });
        pq.add(new Animals(10));
        pq.add(new Animals(20));
        pq.add(new Animals(30));
        pq.add(new Animals(1));


        System.out.println("PQ :");
        while(!pq.isEmpty()){
            int x = pq.poll().age;
            System.out.println(x);
        }



        //













    }
}
