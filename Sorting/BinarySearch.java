class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int tar = 5;
        int l = 0;
        int r = arr.length;
        
        while(l<r){
            int mid = (l+r)/2;
            if(arr[mid] == tar){
                System.out.println("Found at "+mid);
                break;
            }else if(tar>arr[mid]){
                l = mid+1;
            }else if(tar<arr[mid]){
                r = mid-1;
            }else{
                System.out.println("Not Found");
                break;
            }
        }
}