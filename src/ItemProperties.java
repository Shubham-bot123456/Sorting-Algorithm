import jdk.jfr.DataAmount;

import java.util.Arrays;
import java.util.List;


public class ItemProperties {
    public static void main(String[] args) {
        int[] array = {5, 2, 1, 3
        };
//        mergeSort(array);
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }

    // this will be a merge sort method.
    public static void mergeSort(int[] array) {
        // this base condition
        if (array.length < 2) {
            return;
        }
        // find the mid.
        int middle = array.length / 2;
        int[] leftarray = new int[middle];
        int[] rightarray = new int[array.length - middle];
        for (int i = 0; i < middle; i++) {
            leftarray[i] = array[i];
        }

        for (int i = 0; i < rightarray.length; i++) {
            rightarray[i] = array[middle + i];
        }
        mergeSort(leftarray);
        mergeSort(rightarray);
        merge(leftarray, rightarray, array);


    }

    // this method will merge the arrays
    public static void merge(int[] leftarray, int[] rightarray, int[] array) {
        int i = 0;
        int leftarrayindex = 0;
        int rightarrayindex = 0;

        while (leftarrayindex < leftarray.length && rightarrayindex < rightarray.length) {
            if (leftarray[leftarrayindex] < rightarray[rightarrayindex]) {
                array[i++] = leftarray[leftarrayindex++];

            } else {
                array[i++] = rightarray[rightarrayindex++];
            }
        }

        if (leftarrayindex < leftarray.length) {
            for (int j = leftarrayindex; j < leftarray.length; j++) {
                array[i] = leftarray[leftarrayindex];
                i++;
            }
        }

        if (rightarrayindex < rightarray.length) {
            for (int j = rightarrayindex; j < rightarray.length; j++) {
                array[i] = rightarray[rightarrayindex];
                i++;
            }
        }


    }

    public static void bubbleSort(int[] array) {
      for(int i=array.length-1;i>0;i--){
          innerloop:
          for(int j=0;j<i;j++){
              if(i==j){
                  continue innerloop;
              }else {
                  if(array[j]>array[j+1]){
                      int temp=array[j];
                      array[j]=array[j+1];
                      array[j+1]=temp;
                  }
              }

          }
      }
    }
}
