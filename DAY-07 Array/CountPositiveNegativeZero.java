public class CountPositiveNegativeZero
{
    public static void main(String[] args)
    {
        int[] arr=Arrayutility.inputarray();
        int positive=0,negative=0,zero=0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]<0)
            {
                negative++;
            }else if(arr[i]>0)
            {
                positive++;
            }else
            {
                zero++;
            }
        }
        System.out.println("Positive ="+positive);
        System.out.println("Negative ="+negative);
        System.out.println("Zero ="+zero);
    }
}
