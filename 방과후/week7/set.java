package 방과후.week7;

import java.util.*;

public class set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Set<String> set3 = new LinkedHashSet<>();
        TreeSet<Integer> set4 = new TreeSet<>();

        set2.add("하린");
        set2.add("현태");
        set2.add("수화");

        set.add("민길");
        set.add("민길");
        set.add("현우");

        set3.add("T1");
        set3.add("T1");
        set3.add("mingil");
        set3.add("오른");

        set4.add(1);
        set4.add(13);
        set4.add(7);
        set4.add(106);
        set4.add(69);
        set4.add(1113);
        set4.add(67);
        set4.add(83);


        System.out.println(set.toString());

        set.remove("민길");
        System.out.println(set.toString());

        set.addAll(set2);
        System.out.println(set.toString());

        System.out.println(set3.toString());

        System.out.println(set4.toString());
    }
}
