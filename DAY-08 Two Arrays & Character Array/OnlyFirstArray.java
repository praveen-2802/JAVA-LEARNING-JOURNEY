public class OnlyFirstArray
{
    public static void main(String args[])
    {
        int[] arr1 = Arrayutility.inputarray();
        int[] arr2 = Arrayutility2.inputarray2();
        boolean found = false;
        boolean found2 = false;
        for(int i=0;i<arr1.length;i++)
        {
            found = false;
            for (int j = 0; j < arr2.length; j++)
            {
                if (arr1[i] == arr2[j])
                {
                    found = true;
                    break;
                }
            }
            if (!found)
            {
                System.out.println(arr1[i]);
                found2 = true;
            }
        }
        if(!found2)
        {
            System.out.println("No Unique Element In First Array");
        }
    }
}

