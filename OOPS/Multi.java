package OOPS;
class Apple {
    void execute() {
        System.out.println("this is a apple");
    }
}
    class Banana extends Apple
    {
        void publish()
        {
            System.out.println(" this is banana");
        }
    }
    class Grapes extends Banana
    {
    void put()
    {
        System.out.println(" this is grapes");
    }
    }
   public class Multi
    {
        public static void main(String[] args)
    {
        Grapes b= new Grapes();
        b.put();
        b.execute();
        b.publish();
    }
}

