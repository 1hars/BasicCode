package Arrays.org;
import java.util.Scanner;
public class Bar {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        PrintBar(arr);
        scn.close();
    }
    public static void PrintBar(int arr[]){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i = max ; i >= 1; i--){
            for(int str = 0; str < arr.length; str++){
                if(arr[str] >= i){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();

        }
    }
}
