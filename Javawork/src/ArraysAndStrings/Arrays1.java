package ArraysAndStrings;

public class Arrays1
{
    public static void main(String[] args)
    {
        int[] marks= new int[5];
      //int marks[]= {1,2,3,4,5};
      marks[0]=10;
      marks[1]=20;
      marks[2]=30;
      marks[3]=40;
      marks[4]=50;
      for (int i=0;i<marks.length;i++)
      {
          System.out.println(marks[i]); //10  20 30 40 50
      }

    }
}
