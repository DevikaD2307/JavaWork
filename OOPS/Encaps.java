package OOPS;

public class Encaps {
    private String name;

    public String getName()   // setting the name
    {
        return name;
    }

    public void setName(String name)   // getting the name
    {
        this.name = name;
    }

    public static void main(String[] args)
    {
        Encaps e = new Encaps();
        e.setName("devika");
        System.out.println(e.getName());
    }
}
