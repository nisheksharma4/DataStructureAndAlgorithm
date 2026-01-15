package Array;

import java.util.Arrays;

public class ShiftDuplicate {
    
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n <= 1){
            return n;
        }
        int a = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
               nums[a] = nums[i];
               a++; 
            }
            
        }

        return a;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expected1 = {0, 1, 2, 3, 4};

        int k1 = removeDuplicates(nums1);
        System.out.println("Test Case 1:");
        System.out.println("Input:    " + Arrays.toString(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        System.out.println("Output k: " + k1);
        System.out.println("First k elements: " + Arrays.toString(Arrays.copyOf(nums1, k1)));

        // Manual assertion (like LeetCode judge)
        if (k1 == expected1.length) {
            boolean passed = true;
            for (int i = 0; i < k1; i++) {
                if (nums1[i] != expected1[i]) {
                    passed = false;
                    break;
                }
            }
            if (passed) {
                System.out.println("✅ Test Case 1 PASSED\n");
            } else {
                System.out.println("❌ Test Case 1 FAILED\n");
            }
        } else {
            System.out.println("❌ Test Case 1 FAILED (length mismatch)\n");
        }

        // Test case 2: All same
        int[] nums2 = {1, 1, 1, 1};
        int[] expected2 = {1};
        int k2 = removeDuplicates(nums2);
        System.out.println("Test Case 2:");
        System.out.println("Input:    " + Arrays.toString(new int[]{1, 1, 1, 1}));
        System.out.println("Output k: " + k2);
        System.out.println("First k elements: " + Arrays.toString(Arrays.copyOf(nums2, k2)));

        if (k2 == expected2.length && nums2[0] == expected2[0]) {
            System.out.println("✅ Test Case 2 PASSED\n");
        } else {
            System.out.println("❌ Test Case 2 FAILED\n");
        }

        // Test case 3: All unique
        int[] nums3 = {1, 2, 3, 4, 5};
        int[] expected3 = {1, 2, 3, 4, 5};
        int k3 = removeDuplicates(nums3);
        System.out.println("Test Case 3:");
        System.out.println("Input:    " + Arrays.toString(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Output k: " + k3);
        System.out.println("First k elements: " + Arrays.toString(Arrays.copyOf(nums3, k3)));

        if (k3 == expected3.length) {
            boolean passed = true;
            for (int i = 0; i < k3; i++) {
                if (nums3[i] != expected3[i]) {
                    passed = false;
                    break;
                }
            }
            if (passed) {
                System.out.println("✅ Test Case 3 PASSED\n");
            } else {
                System.out.println("❌ Test Case 3 FAILED\n");
            }
        }
    }
}

