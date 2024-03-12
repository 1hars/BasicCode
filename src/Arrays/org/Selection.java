package Arrays.org;
import java.util.Scanner;
public class Selection {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int ans[] = selectioSort(arr);
        for(int ele : ans){
            System.out.print(ele+" ");
        }
        scn.close();
    }
    public static int[] selectioSort(int arr[]){
//        for(int i = 0; i < arr.length; i++){
//            int temp = arr[i];
//            for(int j = i; j < arr.length-1; j++){
//                if(temp > arr[j+1]){
//                    temp = arr[j+1];
//                    arr[j+1] = arr[i];
//                }
//            }
//            arr[i] = temp;
//        }
        for(int i = 0; i < arr.length-1; i++) {
            int min_Index = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[min_Index]){
                    min_Index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_Index];
            arr[min_Index] = temp;
        }
        return arr;
    }
}
