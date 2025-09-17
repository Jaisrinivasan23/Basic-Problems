import java.util.*;
class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4,4,4,4};
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(i==0 || arr[i]!=arr[i-1]){
                arr[index++] = arr[i];
            }
        }
        for(int i=0;i<index;i++){
            System.out.println(arr[i]);
        }
    }
}