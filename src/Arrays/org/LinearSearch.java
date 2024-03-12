package Arrays.org;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,60,68};
        int k = 60;
        System.out.println(linearSerach(a,k));
    }
    public static int linearSerach(int arr[], int k){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }
}
