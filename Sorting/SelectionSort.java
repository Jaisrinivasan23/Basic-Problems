import java.util.Arrays;

public class SelectionSort {
     public static void main(String[] args) {
       int[] arr = {5,3,6,2,7};
       for(int i=0;i<arr.length-1;i++){
           int min = i;
           for(int j= i+1;j<arr.length;j++){
               if(arr[j]<arr[min]){
                   min = j;
               }
           }
           int temp = arr[i];
               arr[i] = arr[min];
               arr[min] = temp;
    }System.out.println(Arrays.toString(arr));

