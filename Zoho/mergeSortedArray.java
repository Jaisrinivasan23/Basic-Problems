import java.util.Collections;
import java.util.Arrays;
class mergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
            for(int j=0;j<n;j++){
                nums1[m+j] = nums2[j];
                
            }
        
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}