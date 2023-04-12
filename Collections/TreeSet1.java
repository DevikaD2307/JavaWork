package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1
{
    public void tree()
    {
        TreeSet<Object> i= new TreeSet<>();
       i.add(90);
       i.add(20);
       i.add(30);
       i.add(50);
       i.add(10);
        System.out.println(i);
        i.pollFirst();
        System.out.println(i);
        i.pollLast();
        System.out.println(i);
        Iterator it=i.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }

    public static void main(String[] args) {
        TreeSet1 t= new TreeSet1();
        t.tree();
    }
}
