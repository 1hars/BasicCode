package Arrays.org;

public class Bubble {
    public static void main(String[] args) {
        int arr[] = {5,2,6,7,3};
        int ans[] = bubblesort(arr);
        for(int ele : ans){
            System.out.print(ele+ "\t");
        }
    }
    public static int[] bubblesort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
