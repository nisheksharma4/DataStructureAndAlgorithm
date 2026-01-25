package Array.SortingTechniques;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr1 = {5, 4, 1, 2, 3};
        int[] arr2 = {8, 7};

        int[] merged = new int[arr1.length + arr2.length];
        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            merged[k++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            merged[k++] = arr2[i];
        }

        for (int i = 0; i < merged.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < merged.length - i-1; j++) {
                if (merged[j] > merged[j + 1]) {
                    int temp = merged[j];
                    merged[j] = merged[j + 1];
                    merged[j + 1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }

        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}

