package Collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // create HashMap
        Map<Integer, String> map = new HashMap<>();

        // add values to HashMap
        map.put(1, "Eins");
        map.put(2, "Zwei");
        map.put(3, "Drei");
        map.put(4, "Vier");

        //show values in map
        for (Integer i : map.keySet()) {
            System.out.println("Key: " + i + " Value: " + map.get(i));
        }

        // delete values via key
        map.remove(3);

        for (Integer i : map.keySet()) {
            System.out.println("Key: " + i + " Value: " + map.get(i));
        }

        // iterate over values
        for (String s : map.values()) {
            if (s.contains("r")) {
                System.out.println(s);
            }
        }

        // it is possible to store a whole List as a Value in the HashMap
        Map<String, List<String>> complexMap = new HashMap<>();
    }
}
