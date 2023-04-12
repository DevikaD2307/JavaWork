package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

public class LinkedHash1
{
    public void hash()
    {
        LinkedHashSet<Object> l= new LinkedHashSet();
        l.add("DEVIKA");
        l.add("sony");
        l.add(30);
        l.add("chandu");
        l.add(null);// only one null value allowed
        System.out.println(l);
        l.add("DEVIKA");  //duplicate not allowed
        System.out.println("after adding duplicate"+ l);
        Iterator i=l.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }

    public static void main(String[] args)
    {
        LinkedHash1 lh= new LinkedHash1();
        lh.hash();
    }
}
