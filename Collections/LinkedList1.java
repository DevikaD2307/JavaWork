package Collections;

import java.util.LinkedList;

public class LinkedList1
{
    public  void linked()
    {
        LinkedList<Integer> i= new LinkedList<>();
        i.add(10);
        i.add(20);
        i.add(30);
        i.add(50);
        i.add(90);
        System.out.println(i);
        i.addFirst(50);
        System.out.println("after adding first element");
        System.out.println(i);
        i.removeLast();  //removing last element
        System.out.println(i);
        i.addLast(500);
        System.out.println(i); // after adding last
        i.add(2, 600); //in b/w adding the element
        System.out.println(i);

        /* for (int p:i)
        {
            System.out.println(p);

        } */

    }

    public static void main(String[] args) {
        LinkedList1 ll= new LinkedList1();
        ll.linked();
    }
}
