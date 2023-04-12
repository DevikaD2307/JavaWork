package Collections;

import java.util.LinkedList;

public class Stack1
{
     public void stackmeth()
     {
         LinkedList<Integer> i= new LinkedList<>();
         i.push(20);
         i.push(30);
         i.push(40);
         i.push(60);
         System.out.println(i);
         i.pop();
         System.out.println(i);
         i.add(3,82); //adding element
         System.out.println(i);
         i.addLast(50); // adding last
         System.out.println(i);
         i.addFirst(23);
         System.out.println(i);
         i.remove(2);
         System.out.println(i);
         i.removeFirstOccurrence(23); //removes the elememnt
         System.out.println(i);
        /* for (int it:i)
         {
             System.out.println(it);

         } */
     }

    public static void main(String[] args)
    {
        Stack1 s= new Stack1();
        s.stackmeth();
    }
}

