package TestNG;

import org.testng.annotations.*;

public class PriorityAnnotation
{

        @Test(priority = 1)
        public void eat()
        {
            System.out.println("Eating fruits");
        }
        @Test(priority =2)
        public void run()
        {
            System.out.println("Im running");
        }
        @Test(priority = 3)
        public void drink()
        {
            System.out.println("drinking water");
        }
        @Test(priority = 4)
        public void sleep()
        {
            System.out.println("Im sleeping");
        }
        @Test(priority = 5)
        public void perform()
        {
            System.out.println("this is the main to perform the testing");
        }



}
