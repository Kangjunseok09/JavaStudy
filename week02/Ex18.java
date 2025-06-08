package week02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    Set
 */
public class Ex18 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Spring");
        set.add("Oracle");
        set.add("Java");
        set.add("Mybatis");
        set.add("Java");

        System.out.println(set.toString());

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for(String s : set) {
            System.out.println(s);
        }
    }
}
