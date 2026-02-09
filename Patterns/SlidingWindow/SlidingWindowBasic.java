package Patterns.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindowBasic {
    

    public static void main(String[] args) {
        
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;  

        int maxSumSequence = bruteForceMethod(arr, k);

        System.out.println("Max Sum of subArray is : "+ maxSumSequence);

        //second method optimzed

        int maxSumOptimized = slidingWindowOptimized(arr, k);
        System.out.println("Max Sum of SubArray by Optimization is : "+maxSumOptimized);

        k = 4;
        //Average of subarray
        double maxSumAverage = maxAverageOfSubArray(arr, k);

        System.out.println("Max Average of SubArray is : "+maxSumAverage);

        int[] arr1 = {5,4,4,1,2,3,4,5};
        k=3;
        //Sum of distinct element in array
        int result = distinctElementSubArraySum(arr1, k);
        System.out.println("Result of Array : "+result);

    }


    //optimized method of sliding window
    static int slidingWindowOptimized(int[] arr, int k){

        int windowSum = 0;
        int maxSum = 0;

        //first frame
        for(int i=0; i<k; i++){
            windowSum += arr[i];
        }

        //sliding window
        for(int i=k; i<arr.length; i++){
            windowSum += arr[i];
            windowSum -= arr[i-k];

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
    static int bruteForceMethod(int[] arr, int k){
        int maxSum = 0;
        for(int i=0; i<=arr.length - k; i++){
            int sum = 0;
            for(int j=i; j<i+k; j++){
                sum += arr[j];
            }
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    //find maximum average of subArray of size k

    static double maxAverageOfSubArray(int[] arr, int k){

        int windowSumAverage = 0;
        int maxSumAverage = 0;

        //first subArray
        for(int i=0; i<k; i++){
            windowSumAverage += arr[i];
        }

        //Sliding Window
        for(int i = k; i<arr.length; i++){
            windowSumAverage += arr[i];
            windowSumAverage -= arr[i-k];

            maxSumAverage = Math.max(maxSumAverage, windowSumAverage);
        }

        return (double) maxSumAverage / k;
    }

    static int distinctElementSubArraySum(int[] arr, int k){

        int left = 0;
        int windowSum = 0;
        int maxSum = 0;

        Set<Integer> set = new HashSet<>();
        for(int right = 0; right<arr.length; right++){

            //If duplicate found, shrink from left
            while(set.contains(arr[right])){
                set.remove(arr[left]);
                windowSum -= arr[left];
                left++;
            }

            set.add(arr[right]);
            windowSum += arr[right];

            // If window size exceeds k, shrink
            if (right - left + 1 > k) {
                set.remove(arr[left]);
                windowSum -= arr[left];
                left++;
            }

            // If window size is exactly k, update answer
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
    }
}
