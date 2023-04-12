package OOPS;

class Rectangle implements Interf
{
    @Override
    public void draw()
    {
        System.out.println("drawing the rectangle");
    }
}
    class Circle implements Interf
    {
        @Override
        public void draw()
        {
            System.out.println("drawing the circle");
        }
    }

    public class InterfMain
    {
        public static void main(String[] args)
        {
            Interf i= new Circle();
            i.draw();
        }
    }

