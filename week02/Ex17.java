package week02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
    LinkedList
 */
public class Ex17 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        long startTime;
        long endtime;
        startTime = System.nanoTime();
        for(int i = 0; i < 100000; i++) {
            list1.add(0, String.valueOf(i));
        }
        endtime = System.nanoTime();
        System.out.println("ArrayList: " + (endtime - startTime) + "ns");

        startTime = System.nanoTime();
        for(int i = 0; i < 100000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endtime = System.nanoTime();
        System.out.println("LinkedList: " + (endtime - startTime) + "ns");

    }
}
