package Collections;

import java.util.HashMap;

public class HashMap1
{
    public void hash()
    {
        HashMap<Integer, String>  si= new HashMap<>();
        si.put(100, "devika");
        si.put(560,"Sony");
        si.put(150, "chandu");
        System.out.println(si);
        System.out.println("the keys are"+ si.keySet());
        System.out.println("the values are "+ si.values());
        System.out.println(si.containsValue(560));
        System.out.println(si.containsKey("DEVIKA"));
        System.out.println(si.containsValue(600));

    }

    public static void main(String[] args) {
        HashMap1 hp= new HashMap1();
        hp.hash();
    }
}
