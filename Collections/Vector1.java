package Collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Vector;

public class Vector1
{
    public  void vect()
    {
        Vector<Object> ob= new Vector<>();
        ob.add("Devika");
        ob.add(50);
        ob.add('S');
        ob.add("Tiger");
        System.out.println(ob);
        //System.out.println("the capacity is: " + ob.capacity());
       // System.out.println("the size is : " + ob.size());
        // using list iterator
      /*  ListIterator l2= ob.listIterator();
        {
            while (l2.hasNext())
            {
                System.out.println(l2.next());
            }
        } */
    }

    public static void main(String[] args) {
        Vector1 v= new Vector1();
        v.vect();
    }
}
