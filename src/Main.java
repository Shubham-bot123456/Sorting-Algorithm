import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // this is the merge sort
        //steps to do it:
        //1.middle of the array
        //2.split the array
        //3.merge the array.

        int[] example = {1, 5, 7,2, 4, 3};
        mergeSort(example);
        System.out.println(Arrays.toString(example));


    }

    public static void mergeSort(int[] array) {

        // this is the base statement where the recursion will fail.
        if (array.length < 2) {
            return;
        }
        int middle = array.length / 2;
        int[] leftarray = new int[middle];
        int[] rightarray = new int[array.length - middle];
        for (int i = 0; i < leftarray.length; i++) {
            //transfer the elements from main array to this one.
            leftarray[i] = array[i];

        }
        for (int j = 0; j < rightarray.length; j++) {

            rightarray[j] = array[j + middle];
        }
        System.out.println(Arrays.toString(leftarray));
        System.out.println(Arrays.toString(rightarray));
        //this is the second step.
        mergeSort(leftarray);
        mergeSort(rightarray);
        merge(leftarray, rightarray, array);
    }

    public static void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {

                result[k++] = right[j++];
            }


        }
        while (i < left.length) {
            result[k++] = left[i++];


        }
        while (j < right.length) {
            result[k++] = right[j++];


        }


    }


}