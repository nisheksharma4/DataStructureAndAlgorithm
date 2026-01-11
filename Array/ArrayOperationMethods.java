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

    //delete from beginning
    public static int[] deleteFromBeginning(int[] arr){

        //Creating new array with -1 size
        int[] newArray = new int[arr.length - 1];
        System.out.println("\nElement Deleted From Beginning : "+arr[0]);
        //copying element of arr from 1 to end to new Array.
        for(int i=1; i<arr.length; i++){
            newArray[i-1] = arr[i];
        }

        return newArray;
    }


    public static int[] deleteFromEnd(int[] arr){

        int[] newArray = new int[arr.length-1];

        System.out.println("\nElement Deleted From End : "+arr[arr.length-1]);
        //iterating upto New Array length
        for(int i=0; i<newArray.length; i++){
            newArray[i] = arr[i];
        }

        return newArray;
    }

    public static int[] deleteFromIndex(int[] arr, int index){

        int[] newArray = new int[arr.length-1];

        if(index == 0){
            return deleteFromBeginning(arr);
        }else if(index == arr.length-1){
            return deleteFromEnd(arr);
        }

        for(int i=0; i<index; i++){
            newArray[i] = arr[i];
        }
        System.out.println("Element Deleted from index : "+arr[index]);
        for(int i=index+1; i<arr.length; i++){
            newArray[i-1]=arr[i];
        }

        return newArray;
    }

    public static int[] deleteMethod(int[] arr, int index){

        int[] newArray = new int[arr.length-1];

        for(int i=0; i<index; i++){
            newArray[i] = arr[i];
        }

        for(int i=index; i<newArray.length; i++){
            newArray[i] = arr[i+1];
        }

        return newArray;
    }
}
