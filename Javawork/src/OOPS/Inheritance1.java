package OOPS;

class  People
        {
            void run()
        {
            System.out.println(" im running");
        }

        }
        class Human extends People
        {
        void eat()
        {
        System.out.println(" im eating");
        }
        }
        public class Inheritance1
{
    public static void main(String[] args)
    {
        Human h= new Human();
        h.run();
        h.eat();
    }


}
