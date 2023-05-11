package butka.tarathep.lab11;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class A {
    public static void main(String[] args) {
        System.out.println("=LinkedHashMap===============");
        LinkedHashMap<String, Double> link = new LinkedHashMap<>();
        link.put("B", 50.0);
        link.put("A", 40.0);
        link.put("C", 10.0);
        link.forEach((key, val) -> System.out.println("Key :" + key + " Val :" + val));

        System.out.println("\n=HashMap===============");
        Map<String, Integer> hash = new HashMap<>();
        hash.put("B", 50);
        hash.put("A", 40);
        hash.put("C", 10);
        hash.forEach((key, val) -> System.out.println("Key :" + key + " Val :" + val));

        System.out.println("\n=MapSortByVal===============");
        ValueComparator bvc = new ValueComparator(hash);
        TreeMap<String, Integer> sorted_map = new TreeMap<String, Integer>(bvc);
        sorted_map.putAll(hash);
        sorted_map.forEach((key, val) -> System.out.println("Key :" + key + " Val :" + val));
    }
}

class ValueComparator implements Comparator<String> {
    Map<String, Integer> base;

    public ValueComparator(Map<String, Integer> hash) {
        this.base = hash;
    }

    @Override
    public int compare(String a, String b) {
        return Integer.compare(base.get(a), base.get(b));
    }
}
