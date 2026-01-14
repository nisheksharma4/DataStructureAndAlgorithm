package Array;

import java.util.Arrays;

public class ReverseAnArray {
    
    public static int[] reverseArray(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {90,30,20,10,5,2,1};

        int[] result = reverseArray(arr);
        System.out.println("Array after reversed : "+Arrays.toString(result));
    }
}
