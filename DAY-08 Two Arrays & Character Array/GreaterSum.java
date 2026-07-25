public class GreaterSum
{
    public static void main(String args[]) {
        int[] arr1 = Arrayutility.inputarray();
        int[] arr2 = Arrayutility2.inputarray2();
        int sum1=0,sum2=0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 = sum1 + arr1[i];
        }
        for (int j = 0; j < arr2.length; j++)
        {
            sum2=sum2+arr2[j];
        }
        System.out.println("Sum of First Array ="+sum1);
        System.out.println("Sum of Second Array ="+sum2);
        System.out.println("");
        if (sum1>sum2)
        {
            System.out.println("First Array has Greater Sum");
        }else if (sum1<sum2)
        {
            System.out.println("Second Array has Greater Sum");
        }else
        {
            System.out.println("Both Array has Equal Sum");
        }
    }
}
