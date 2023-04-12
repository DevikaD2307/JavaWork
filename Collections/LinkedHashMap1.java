package Collections;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LinkedHashMap1
{
    public void map() {
        LinkedHashMap<Object, Object> lh = new LinkedHashMap<>();
        lh.put("Smoke", 200);
        lh.put("drive", 800);
        lh.put("playing", 120);
        lh.put("Drink", 300);
        System.out.println(lh);
    }

    public static void main(String[] args)
    {
        LinkedHashMap1 l1= new LinkedHashMap1();
        l1.map();
    }
}
