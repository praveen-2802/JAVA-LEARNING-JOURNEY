public class OnlySecondArray {
    public static void main(String args[]) {
        int[] arr1 = Arrayutility.inputarray();
        int[] arr2 = Arrayutility2.inputarray2();
        boolean found=false;
        boolean uniquefound=false;
        for (int i = 0; i < arr2.length; i++)
        {
            found=false;
            for (int j = 0; j < arr1.length; j++)
            {
                if(arr2[i]== arr1[j])
                {
                    found=true;
                    break;
                }
            }
            if(!found)
            {
                System.out.println(arr2[i]);
                uniquefound=true;
            }
        }
        if(!uniquefound)
        {
            System.out.println("No Unique Element In Array-2");
        }
    }
}
