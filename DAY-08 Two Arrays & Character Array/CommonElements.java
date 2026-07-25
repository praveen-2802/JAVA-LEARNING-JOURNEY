public class CommonElements
{
    public static void main(String args[]) {
        int[] arr1 = Arrayutility.inputarray();
        int[] arr2 = Arrayutility2.inputarray2();
        boolean found = false;
        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if (arr1[i] == arr2[j])
                {
                    System.out.println(arr1[i]+" ");
                    found = true;
                    break;
                }
            }
        } if(!found)
        {
            System.out.println("No Common Elements");
        }
    }
}
