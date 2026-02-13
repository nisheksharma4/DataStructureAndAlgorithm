package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayListOperation {
    
    public static void main(String[] args) {
        
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;

        System.out.println(Arrays.toString(arr));

        int[] arrInit = {5,2,3,8};
        System.out.println(Arrays.toString(arrInit));
        arrInit[2] = 6;
        System.out.println(Arrays.toString(arrInit));

        int[] arr1 = arrInit;
        System.out.println(arr1);

        System.out.println(arr1 == arrInit);

        Integer[] arr2 = new Integer[5];
        arr2[1] = 0;
        arr2[0] = 1;
        arr2[2] = 3;

        System.out.println("Address of Wrapper class array : "+arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
