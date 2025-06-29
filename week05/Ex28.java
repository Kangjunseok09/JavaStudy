package week05;

import java.util.Map;
import java.util.TreeMap;

/*
    TreeMap
 */
public class Ex28 {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(90, "홍길동");
        scores.put(80, "이몽룡");
        scores.put(70, "성춘향");
        scores.put(100, "홍길순");
        scores.put(60, "변학도");

        Map.Entry<Integer, String> entry = null;
        entry = scores.firstEntry();
        System.out.println("가장 낮은 점수 : " + entry.getKey() + "점:" + entry.getValue());
    }
}
