package Arrays.org;
import java.util.Scanner;
public class SubArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx < arr.length; idx++){
            arr[idx] = scn.nextInt();
        }
        subb(arr);
    }
    public static void subb(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k]+"\t");
                }
                System.out.println();
            }
        }
    }
}
