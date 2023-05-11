package butka.tarathep.lab11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        
        System.out.println("Original________________________");
        m.forEach((k, v) -> System.out.printf("%s => %s\n", k, v));

        System.out.println("Sorted________________________");
        List<Map.Entry<String, Integer>> list = new ArrayList<>(m.entrySet());

        Collections.sort(list, Map.Entry.comparingByValue()
        // public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer>
        // e2) {
        // return e1.getValue().compareTo(e2.getValue());
        // }
        );
        for (Map.Entry<String, Integer> e : list) {
            System.out.printf("%s => %s\n", e.getKey(), e.getValue());
        }

    }
}