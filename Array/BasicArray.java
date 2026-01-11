package Array;

import java.util.Arrays;

public class BasicArray {

    public static void main(String[] args) {
        // static Array
        int[] arr = new int[5];// all the index will return value 0 bydefault
        arr[0] = 4;
        arr[1] = 2;
        arr[2] = 8;
        arr[3] = 9;
        

        System.out.println("\nPrinting array through it's reference : " + arr);
        // return reference address of an array : [I@251a69d7 <-----(This happens because array don't override toString() method);
        // Observe "I" means array of int, 251a69d7 is the hexadecimal representation of
        // the array's hashcode (often related to its memory address, though not the
        // actual memory address—just a unique identifier).

        //----> To Print an array content

        System.out.println("\nPrinting Array by using toString() method : "+Arrays.toString(arr));

        // Accessing arr throuh it's index
        int a = arr[0];
        System.out.println(a);// value is 0 by default

        System.out.println("====================================");

        int[] arr1 = { 10, 20, 30, 40, 50 };

       System.out.println(arr1.length);
       
       //Insert Array Element

        int[] result = ArrayOperationMethods.insertAtAnyIndex(arr1, 2, 55);
        System.out.println("Array after inserting element at any Index : "+Arrays.toString(result)+"\n");
        
        int[] insertAtBegining = ArrayOperationMethods.insertAtBegining(arr1, 77);
        System.out.println("Inserting at Beginining of Array : "+Arrays.toString(insertAtBegining)+"\n");
        
        int[] inserAtEnd = ArrayOperationMethods.inserAtEnd(arr1, 99);
        System.out.println("Insert at end : "+Arrays.toString(inserAtEnd)+"\n");

        // Delete Array Element
        System.out.println("Before Deletion : "+Arrays.toString(arr1));

        int[] deleteFromBeginning = ArrayOperationMethods.deleteFromBeginning(arr1);
        System.out.println("Array after Delete From Beginning : "+Arrays.toString(deleteFromBeginning));

        int[] deleteFromEnd = ArrayOperationMethods.deleteFromEnd(arr1);
        System.out.println("Array after Deleting From End "+Arrays.toString(deleteFromEnd));

        int[] deleteFromIndex = ArrayOperationMethods.deleteFromIndex(arr1, 0);
        System.out.println("Element deleted from index : "+Arrays.toString(deleteFromIndex));
        
    }   

}
