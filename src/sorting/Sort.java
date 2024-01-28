/*
Kim Kitsik
24.02.2024

This class contains methods mergeSort and merge. The first is used recursively to go through halves of the array.
The sorting and merging is done in merge method. Public mergeSort method returns a sorted array.

 */

package sorting;

public class Sort {

    //Method for returning a merge sorted array. Takes in an unsorted array, returns a sorted one
    public static int[] mergeSort(int[] array){
        mergeSort(array,0,array.length-1);
        return array;
    }

    //this method takes an array as an argument along with array's start and end points. Then it is recursively called
    //two times to go through two halves of array, dividing the remaining arrays in half again
    static void mergeSort(int[] array, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);
            merge(array, start, mid, end);
        }
    }

    //method for merging elements of the array in the right order
    static void merge(int[] array, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];  //temporary array to store sorted integers
        int i = start, j = mid + 1, k = 0;

        //going through the two halves of the given array using three while loops
        while (i <= mid && j <= end) {
            if (array[i] <= array[j]) {     //if the left int is smaller or same as the right int, it's added to temp array
                temp[k] = array[i];
                k += 1; i += 1;
            } else {                        //..and vice versa
                temp[k] = array[j];
                k += 1; j += 1;
            }
        }
        while (i <= mid) {  //adding elements to the left side of temp array
            temp[k] = array[i];
            k += 1; i += 1;
        }
        while (j <= end) {  //adding elements to the right side of temp array
            temp[k] = array[j];
            k += 1; j += 1;
        }
        //replacing elements in array with sorted elements
        for (i = start; i <= end; i += 1) {
            array[i] = temp[i - start];
        }
    }


}
