package week05;

import java.util.TreeSet;

/*
    TreeSet
 */
public class Ex27 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(90);
        scores.add(80);
        scores.add(70);
        scores.add(100);
        scores.add(60);

        Integer score = null;
        score = scores.first();
        System.out.println("가장 낮은 점수 : " + score);

        score = scores.last();
        System.out.println("가장 높은 점수 : " + score);

        score = scores.lower(95);
        System.out.println("95점 아래 점수 : " + score);

        score = scores.higher(95);
        System.out.println("95점 위 점수 : " + score);

    }
}
