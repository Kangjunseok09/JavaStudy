package week02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Map
 */
public class Ex19 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("홍길동", 90);
        map.put("이몽룡", 100);
        map.put("변학도", 80);
        map.put("홍길동", 95);

        System.out.println(map.size());
        System.out.println(map.get("홍길동"));

        // map => set
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.printf("%s, %d\n", key, map.get(key));
        }
        map.remove("홍길동");
        map.clear();
        System.out.println(map.isEmpty());
    }
}
