package Collections;

import java.util.ListIterator;
import java.util.PriorityQueue;

public class QuePriority
{
    public void quemethod()
    {
        PriorityQueue<Integer> i= new PriorityQueue<>();
        i.add(10);
        i.add(80);
        i.add(96);
        i.add(3);
        i.add(59);
        System.out.println(i);
        System.out.println(i.peek());
        System.out.println("after peek");
        System.out.println(i.poll());
        System.out.println(i);
        System.out.println(i.add(63));// added end
        System.out.println(i);// now printing
    }

    public static void main(String[] args) {
        QuePriority qp= new QuePriority();
        qp.quemethod();


    }
}
