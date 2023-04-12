package Collections;


import java.util.ArrayDeque;

public class ArrDe1
{
    public void arrdeq()
    {
        ArrayDeque<Integer>i= new ArrayDeque<>();
        i.add(20);
        i.add(50);
        i.add(89);
        i.add(25);
        i.add(60);
        System.out.println(i);
        i.addFirst(54); //adding in first position
        System.out.println(i);
        i.addLast(88);  //adding last position
        System.out.println(i);
        i.removeFirst();
        System.out.println(i);
        //i.clear();  // it will print empty
        //System.out.println(i);

    }

    public static void main(String[] args) {
        ArrDe1 ad= new ArrDe1();
        ad.arrdeq();
    }
}
