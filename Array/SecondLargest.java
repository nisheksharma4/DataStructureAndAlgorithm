package Array;

import java.util.Arrays;

public class SecondLargest {
    
    public static int secondLargestUsingSorting(int[] arr){
        //Array sorted
        Arrays.sort(arr);

        int n = arr.length-2;
        //Iterate from last index
        for(int i =n; i>=0; i--){

        if(arr[i] != arr[arr.length - 1]){
            return arr[i];
        }
        }
        return -1;
    }
    public static int secondLargetTwoPass(int[] arr){
        int largest = -1, secondLargest = -1;

        //find largest
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest Found : " + largest);

        //second larget
        for(int i=0; i<arr.length; i++){
            if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest Found : "+secondLargest);
        return secondLargest;
    }
    public static int secondLargestOnePass(int[] arr){

        int largest = -1;
        int secondLargest = -1;

        for(int i = 0; i<arr.length; i++){

            if(arr[i] > largest){
                // largest = arr[i];     mistake done here largest = 12,
                // secondLarget = largest;   secondLargest = 12
                secondLargest = largest;
                largest = arr[i];
            }else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }


    public static void main(String[] args) {
        int[] arr = {12,35,0,1,34,1};
        int secondLarget = secondLargestOnePass(arr);
        System.out.println("Second Largest : "+secondLarget);

        int[] arr1 = {30,23,385,43,23,44,32};
        int secondLargetTwoPass = secondLargetTwoPass(arr1);
        System.out.println("\nSecond Largest : "+secondLargetTwoPass);
    }
}
