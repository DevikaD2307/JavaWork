package OOPS;
class Bike
{
            void drive()
        {
            System.out.println("im driving");
        }
        }
        class Scooter extends Bike  //overriding done in child class
        {
    void run()
    {
        System.out.println("im running");
    }
        }

public class MethodRide
{
    public static void main(String[] args)
    {
        Scooter s = new Scooter();
        s. run();
        s.drive();

    }
}
