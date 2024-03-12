package Arrays.org;
import java.util.Scanner;
public class Insertion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int ans[] = insertSort(arr);
        for(int ele : ans){
            System.out.print(ele+"\t");
        }
        scn.close();
    }
    public static int[] insertSort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j] > arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
//    public static void swap(int arr[]){
//        for(int i = 0; i < arr.length-1; i++){
//            int temp = arr[i];
//            arr[i] = arr[i+1];
//            arr[i+1] = temp;
//        }
//    }
}
