package Collections;

import java.util.TreeMap;

public class TreeMap1
{
    public void tree()
    {
        TreeMap<Object, Object> i= new TreeMap<>();
        i.put("flower",100);
        i.put("rose",200);
        i.put("deer",590);
        i.put("lilly",90);
        System.out.println(i);

        System.out.println(i.keySet());
        System.out.println(i.values());
        System.out.println(i.containsKey("rose"));
        System.out.println(i.containsValue(986));
       // System.out.println(i.put(null,10));  // nullpointer excp
    }

    public static void main(String[] args) {
        TreeMap1 tm= new TreeMap1();
        tm.tree();
    }
}
