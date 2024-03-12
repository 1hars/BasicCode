package Arrays.org;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,10,15,22,33,40,42,55,66};
        int k = 55;
        System.out.println(binarySearch(arr,k));
    }
    public static int binarySearch(int arr[], int k){
        int str =  0, end = arr.length-1;
        while(str <= end){
            int mid = (str+end)/2;
            if(arr[mid] < k){
                str = mid+1;
            }else if(arr[mid]>k){
                end = mid-1;
            }else{
                return mid;
            } 
        }
        return -1;
    }
}
