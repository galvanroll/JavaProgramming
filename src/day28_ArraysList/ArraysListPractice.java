package day28_ArraysList;

import java.util.ArrayList;

public class ArraysListPractice {

    public static void main(String[] args) {
        /* {1,2,3,4,5,6}*/ // array list, then multiply by 2

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) { // i: index numbers of list
            list.set(i, list.get(i) * 2); // set replaces the element with new element
        }

        System.out.println(list);

    }
}
