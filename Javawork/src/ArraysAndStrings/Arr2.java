package ArraysAndStrings;

public class Arr2
{
    public static void main(String[] args)
    {
        // to find minimum number in array
        int i,min;
        int array[]= {10,20,30,60,40};
        min=array[0];    // min=10
        for(i=0;i<array.length;i++)//0<5
        {
            if(array[i]<min)
                min=array[i];
        }
        System.out.print("minimum:" +min);
    }

}



