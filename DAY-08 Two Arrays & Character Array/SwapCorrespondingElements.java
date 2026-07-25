public class SwapCorrespondingElements {
    public static void main(String args[]) {
        int[] arr1 = Arrayutility.inputarray();
        int[] arr2 = Arrayutility2.inputarray2();
        int min;
        if (arr1.length > arr2.length) {
            min = arr2.length;
        } else {
            min = arr1.length;
        }
        for (int i = 0; i < min; i++)
        {
            int swap =arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = swap;
        }
        System.out.println("=======Array after swapping====== :");
        System.out.println("First Array after swapping :");
        Arrayutility.displayarray(arr1);
        System.out.println("");
        System.out.println("Second Array after swapping :");
        Arrayutility2.displayarray2(arr2);
    }
}
