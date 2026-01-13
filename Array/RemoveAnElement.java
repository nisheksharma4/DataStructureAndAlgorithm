package Array;

public class RemoveAnElement {
    
    public static int removeElement(int[] nums, int value) {
        //Two pointer approach
        int k=0; // the index where unique elements are present
        int i = 0; // iterate over the nums array
        while(i < nums.length){

            if(nums[i] != value){
                nums[k] = nums[i];
                k++;
            }
            i++;
        }

        return k;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int result = removeElement(arr, 2);
        System.out.println("Count of Elements in Array: "+result);

        int[] arr1 = {3,3,2,2};
        int result1 = removeElement(arr1, 3);
        System.out.println("\nCount : "+result1);
    }
}
