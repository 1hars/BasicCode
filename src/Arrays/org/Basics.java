package Arrays.org;
import java.util.Scanner;
public class Basics {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int arr[] = new int[5];
//        arr[0] = 1;
//        arr[1] = 3;
//        arr[2] = 4;
//        arr[4] = 8;
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
        System.out.println("Enter input");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("The output is ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
       scn.close();
    }
}
