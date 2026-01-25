package Array.SortingTechniques;

class SelectionSort {

    public static void main(String[] args) {
        int[] arr1 = { 5, 4, 1, 2, 3 };
        int[] arr2 = { 8, 7 };

        int[] merged = new int[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            merged[k++] = arr1[i];
        }

        for (int j = 0; j < arr2.length; j++) {
            merged[k++] = arr2[j];
        }

        //Selection sort
        for(int i=0; i < merged.length - 1; i++){
            int smallIndex = i;
            for(int j= i+1; j<merged.length; j++){
                if(merged[j] < merged[smallIndex]){
                    smallIndex = j;
                }
            }

            int temp = merged[i];
            merged[i] = merged[smallIndex];
            merged[smallIndex] = temp;
        }

        for(int i : merged){
            System.out.print(i + " ");
        }
    }
}
