package Collections;

import java.util.ArrayList;

public class ArrayList1
{
    public  void arrList()
    {
        ArrayList<String> s= new ArrayList<>();
        s.add("Devika");
        s.add("sony");
        s.add("chandu");
        System.out.println(s);
        for (String str:s
             )
        {
            System.out.println("using for each loop printing");
            System.out.println(str);

        }
    }

    public static void main(String[] args)
    {
       ArrayList1 ar= new ArrayList1();
       ar.arrList();
    }
}
