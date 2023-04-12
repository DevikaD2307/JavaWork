package Exceptions;

public class ExcepThrows
{
     static void check(int num)throws ArithmeticException
     {
         if(num<18)
         {
             System.out.println("you are not selected to vote");
         }
         else
         {
             System.out.println("You can vote");
         }
     }

    public static void main(String[] args)
    {
check(20);    }
}
