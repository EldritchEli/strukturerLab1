import java.util.Random;

public class Lab1 {
    /** Sorting algorithms **/

    // Insertion sort.

    public static void insertionSort(int[] array) {




        for (int i = 1; i < array.length; i++){

            if (array[i] < array[i-1]){
               int tmp = array[i];
               array[i] = array[i-1];
            for(int hole = i-1; hole >= 0; hole--) {
                if ((hole-1) < 0 || array[hole-1] <= tmp) {
                    array[hole] = tmp;
                    break;
                }
                else{ array[hole] = array[hole-1];}
            }
        }}*/
    }

    public static void insertionSort2(int[] array) {
        int len = array.length;
        int hole = -1;

        for (int i = 1; i < len; i++) {
            int j = i;

            hole = array[j];
            while (j > 0 && array[j - 1] > hole) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = hole;
        }
//        throw new UnsupportedOperationException();

    }




    public static void quickSort(int[] array) {

        partition(array,0, array.length-1);
    }

    // Quicksort part of an array
    private static void quickSort(int[] array, int left, int right) {


    }


    // Partition part of an array, and return the index where the pivot
    // ended up.
    private static void partition(int[] array, int begin, int end) {


        if(begin >= end){return;}
        int left = begin;
        int right = end;

        Random rand = new Random();
        int pivotIndex = rand.nextInt(end - begin) + begin;
        int pivot= array[pivotIndex];
        swap(array, pivotIndex, end);


        while(left < right){
            while(array[left] <= pivot && left < right) {left++;}
            while(array[right] >= pivot && left < right) {right--;}
            swap(array,left,right);
    }
        swap(array, left, end);
        partition(array, begin, left-1);
        partition(array, right +1, end);
    }

    // Swap two elements in an array
    private static void swap(int[] array, int i, int j) {
        int x = array[i];
        array[i] = array[j];
        array[j] = x;
    }

    // Mergesort.

    public static int[] mergeSort2(int[] array) {


    //    throw new UnsupportedOperationException();
        int arrayLength = array.length;
        if(arrayLength == 1){return array;}
        int middle = arrayLength/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[arrayLength - middle];

        for(int i = 0; i < middle; i++){leftArray[i] = array[i];}
        for(int i = middle; i < arrayLength; i++){rightArray[i - middle] = array[i];}

        return merge(mergeSort(leftArray), mergeSort(rightArray));};


    // Mergesort part of an array


    // Merge two sorted arrays into one
    private static int[] merge2(int[] left, int[] right) {
     int  leftLength =  left.length;
     int rightLength = right.length;
     int[] mergeArray = new int [leftLength + rightLength];
     int leftIndex = 0;
     int rightIndex = 0;
     int mergeIndex = 0;

     while(leftIndex < leftLength && rightIndex < rightLength){
         if(left[leftIndex] <= right[rightIndex]){

             mergeArray[mergeIndex] = left[leftIndex];
             mergeIndex++; leftIndex++;}

         else{mergeArray[mergeIndex] = right[rightIndex];

             mergeIndex++; rightIndex++;}}

         for (int i = leftIndex; i < leftLength; i++){

             mergeArray[mergeIndex] = left[i];
             mergeIndex++;
         }
         for (int i = rightIndex; i < rightLength; i++){
             mergeArray[mergeIndex] = right[i];
             mergeIndex++;
         }

     return mergeArray;

    }

    public static int[] mergeSort(int[] array) {
        int len = array.length;
        if (len<2) {return array;}

        int n = len / 2;
        int[] a1 = new int[n];
        int[] a2 = new int[len-n];

        for (int i=0; i<n; i++) {
            a1[i] = array[i];
        }
        for (int i=n; i<len; i++) {
            a2[i-n] = array[i];
        }

        return merge(mergeSort(a1), mergeSort(a2));
    }

    // Mergesort part of an array
    /*private static int[] mergeSort(int[] array, int begin, int end) {
        int[] part = new int[end-begin+1];
        for (int i=begin; i<end; i++) {
            part[i-begin] = array[i];
        }
        mergeSort(part);
        for (int i=begin; i<end; i++) {
            array[i] = part[i-begin];
        }
        return array;
    }*/

    // Merge two sorted arrays into one
    private static int[] merge(int[] left, int[] right) {
        int[] arr = new int[left.length + right.length];
        int l=0, r = 0;
        int n=0;
        while (n<arr.length) {
            if (r>=right.length) {
                arr[n] = left[l];
                l++;
            } else if (l>=left.length) {
                arr[n] = right[r];
                r++;
            } else {
                if (right[r]>left[l]) {
                    arr[n] = left[l];
                    l++;
                } else {
                    arr[n] = right[r];
                    r++;
                }
            }
            n++;
        }
        return arr;
    }

}
