package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1
{
    public void hash()
    {
        HashSet<Object> h= new HashSet<>();
        h.add("Devika");
        h.add("sony");
        h.add("chandu");
        h.add(null);
        System.out.println(h);
        Iterator i=h.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }

    public static void main(String[] args) {
        HashSet1 hs= new HashSet1();
        hs.hash();
    }
}
