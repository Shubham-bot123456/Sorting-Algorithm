import java.util.Arrays;

public class QuickSortAlgorithm {
    public static void main(String[]args){
        int []array={201,2,2,3,0,1
        };
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    public static void quickSort(int []array,int lowIndex, int highIndex){
        //this will have the base condition that
        if(highIndex<=lowIndex){
            return;
        }
        int pivot=array[highIndex];
        int lowindexnew=lowIndex;
        int newHighIndex=highIndex;
        while(lowindexnew<newHighIndex){
            while(array[lowindexnew]<=pivot&&lowindexnew<newHighIndex){
                lowindexnew++;
            }
            while(array[newHighIndex]>=pivot&&lowindexnew<newHighIndex){
                newHighIndex--;
            }
            swap(array,lowindexnew,newHighIndex);
        }
        // now will swap the pivot.
        swap(array,lowindexnew,highIndex);
        // now will be the recurssion calls.
        if(lowIndex>0)
        quickSort(array,lowIndex,lowindexnew-1);

        quickSort(array,lowindexnew+1,highIndex);
    }
    public static void swap(int []array,int index1, int index2){
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
}
