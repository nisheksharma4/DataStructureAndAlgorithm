package Array;

public class RemoveDuplicateFromSortedArray {
    
    public static int removeDuplicates(int[] nums) {
        int count = 1;
        int k=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }

            if(count <= 2){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int a = removeDuplicates(arr);
        System.out.println(a);
    }
}

