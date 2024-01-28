/*
Kim Kitsik
24.01.2024

Main class to test the work of the code.

 */

package sorting;

public class Main {
    public static void main(String[] args) {
        //Test cases:

        //int array[]={4,5,3,2};
        //int array[]={2,3,4,5};
        //int array[]={5,4,3,2};
        //int array[]={4,5};
        //int array[]={5};
        int array[]={3,5,1,1,1,6};

        array=Sort.mergeSort(array);

        System.out.println("Sorted array: ");
        for (int i:array){
            System.out.print(i);
        }
    }
}
