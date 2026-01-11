package Array;

public class ArrayOperationMethods {
    
    //insert an element in at beginning
    public static int[] insertAtBegining(int[] arr, int value){

        // int arrSize = arr.length;
        // System.out.println("Old Length : "+arrSize);
        // //new arr with +1 size
        int[] arr1 = new int[arr.length+1];
        // System.out.println("New Array Length : "+arr1.length);

        //copy arr into arr1
        for(int i=0; i<arr.length; i++){
            arr1[i] = arr[i];
        }

        //shifting each element to right by one index
        for(int i=arr1.length-1; i > 0; i--){
            arr1[i] = arr[i-1];
        }

        arr1[0] = value;
        return arr1;
    }

    //insert at end
    public static int[] inserAtEnd(int[] arr, int value){

        int[] arr1 = new int[arr.length + 1];

        //copy
        int i=0;
        while(i<arr.length){
            arr1[i] = arr[i];
            i++;
        }

        arr1[arr1.length-1] = value;

        return arr1;
    }


    // insert at any index
    public static int[] insertAtAnyIndex(int[] arr, int index, int value){
        //new array with +1 size
        int[] arr1 = new int[arr.length + 1]; 

        //copy
        for(int i=0; i<arr.length; i++){
            arr1[i] = arr[i];
        }

        //insert at index
        for(int i=arr1.length-1; i>index; i--){
                arr1[i] = arr1[i-1];
        }

        arr1[index] = value;
        return arr1;
    }
}
