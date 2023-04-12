package Exceptions;

public class ExcepFina
{
    public static void main(String[] args)
    {
        System.out.println("world");
        try {
            int arr[] = new int[]{1, 2, 3, 4, 5};  //ArrayIndexOutOfBound exception
            System.out.println(arr[10]);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("This is finally block");
        }


    }
}
