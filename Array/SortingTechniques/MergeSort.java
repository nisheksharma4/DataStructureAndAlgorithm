package Array.SortingTechniques;

import java.util.Arrays;

public class MergeSort {
    
    public static void main(String[] args) {
        
        int[] a = {5,4,3,2,1};
        int[] b = {8,7};

        int[] newArray = new int[a.length + b.length];

        for(int i=0; i<newArray.length; i++){
            if(i < a.length){
                newArray[i] = a[i];
            }else{
                newArray[i] = b[i-a.length];
            }
        }

        System.out.println("Unsorted Array : "+Arrays.toString(newArray)+"\n");

        int[] sortedArray = mergeSort(newArray);
        System.out.println("Sorted Array : "+Arrays.toString(sortedArray));
    }

    public static int[] mergeSort(int[] nums){
    
        //calculate nums.length and store in variable
        int n = nums.length;

        //base case
        if(n == 1){
            return nums;
        }

        //mid index of an array so that we can divide
        //Left into mid-1 index; 
        //Right into n-mid index;

        int mid = n/2;

        //for example if n=nums.length = 5; mid = n/2 = 2; n=5, mid=2;

        // Left = size 2 element but upto index 2-1 i.e 1; indexes = 0,1
        int[] Left = new int[mid];
        //Right = size 3 element but upto index 3-1 i.e 3; indexes = 0,1,2
        int[] Right = new int[n-mid];

        //copy the element from nums array to Left and right array
        
        for(int i=0; i<Left.length; i++){
            Left[i] = nums[i];
        }

        for(int i=0; i<Right.length; i++){
            Right[i] = nums[mid + i];
        }

        //calling recursion 
        //this recursion runs until it returns sorted sub parts
        Left = mergeSort(Left);
        Right = mergeSort(Right);// <- this stay pause in stack until Left finishes

        int[] resultArray = new int[n];
        //initializing pointers 
        //i for Left array
        int i = 0;

        //j for Right array
        int j= 0;

        //k for resultArray
        int k = 0;

        //Now loop through both array Left and Right to compare elements of each array
        while(i < Left.length && j < Right.length){
            if(Left[i] <= Right[j]){
                resultArray[k] = Left[i];
                k++; i++;
            }else{
                resultArray[k] = Right[j];
                k++; j++;
            }
        }

        //copy the remain from Left array
        while(i < Left.length){
            resultArray[k] = Left[i];
            k++;
            i++;
        }

        //copy remain from Right Array
        while(j < Right.length){
            resultArray[k] = Right[j];
            k++;
            j++;
        }
        
        return resultArray;

    }
}
