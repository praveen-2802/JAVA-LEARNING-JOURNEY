public class ProductOfCorresponding
{
    public static void main(String args[])
    {
        int[] arr1= Arrayutility.inputarray();
        int[] arr2= Arrayutility2.inputarray2();
        int min;
        if (arr1.length>arr2.length)
        {
            min=arr2.length;
        }
        else
        {
            min=arr1.length;
        }
        for (int i = 0; i < min; i++)
        {
            System.out.println((arr1[i]*arr2[i]));
        }
    }
}
