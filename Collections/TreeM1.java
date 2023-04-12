package Collections;
import java.util.*;

public class TreeM1 {
    public static void main(String[] args) {

        TreeMap<String, Integer> treeMap = new TreeMap<>();

// adding some key-value pairs
        treeMap.put("one", 1);
        treeMap.put("two", 2);
        treeMap.put("three", 3);

// iterating over entries
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}


