package week02;

import java.util.ArrayList;
import java.util.List;

/*
    ArrayList
 */
public class Ex15 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("MyBatis");
        System.out.println(list.toString());
        list.add(2, "Oracle");

        list.set(3, "Mybatis");
        System.out.println(list.toString());

        list.remove(0);
        System.out.println(list.toString());

        list.add("Mybatis");
        list.add("Mybatis");

        System.out.println(list.toString());

        list.remove("Mybatis");
        System.out.println(list.toString());

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        list.clear();
        System.out.println(list.isEmpty());
    }
}
