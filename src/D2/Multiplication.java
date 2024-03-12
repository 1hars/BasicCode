package D2;
import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of matrix 1");
        int nr1 = scn.nextInt();
        int nc1 = scn.nextInt();
        int arr1[][] = new int[nr1][nc1];
        for(int r = 0; r < arr1.length; r++){
            for(int c = 0; c < arr1[0].length; c++){
                arr1[r][c] = scn.nextInt();
            }
        }
        System.out.println("Enter length of the matrix 2");
        int nr2 = scn.nextInt();
        int nc2 = scn.nextInt();
        int arr2[][] = new int[nr2][nc2];
        for(int r = 0; r < arr2.length; r++){
            for(int c = 0; c < arr2[0].length; c++){
                arr2[r][c] = scn.nextInt();
            }
        }
        int ans[][] = new int[nr1][nc2];
        for(int r = 0; r < arr1.length; r++){
            for(int c = 0; c < arr2[0].length; c++){
                for(int k = 0; k < arr2[0].length; k++){
                    ans[r][c] = ans[r][c]+(arr1[r][k]*arr2[k][c]);
                }
            }
        }
        for(int r = 0; r < ans.length; r++){
            for(int c = 0; c < ans[0].length; c++){
                System.out.print(ans[r][c]+" ");
            }
            System.out.println();
        }
    }
}
